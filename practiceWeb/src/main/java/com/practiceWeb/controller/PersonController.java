package com.practiceWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practiceWeb.rds.entity.Person;
import com.practiceWeb.rds.service.PersonService;

@Controller
public class PersonController {

	private PersonService personService;

	@Autowired(required = true)
	@Qualifier(value = "personService")
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}

	// For add and update person both
	@RequestMapping(value = "/person/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("person") Person person) {
		System.out.println("here");
		if (person.getPersonId() == 0) {
			// new person, add it
			this.personService.addPerson(person);
		} else {
			// existing person, call update
			this.personService.updatePerson(person);
		}

		return "redirect:/persons";

	}

	@RequestMapping("/remove/{id}")
	public String removePerson(@PathVariable("personId") int personId) {

		this.personService.removePerson(personId);
		return "redirect:/persons";
	}

	@RequestMapping("/edit/{personId}")
	public String editPerson(@PathVariable("personId") int personId, Model model) {
		model.addAttribute("person", this.personService.getPersonById(personId));
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}

}
