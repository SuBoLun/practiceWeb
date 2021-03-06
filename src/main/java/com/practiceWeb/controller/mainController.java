package com.practiceWeb.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.practiceWeb.rds.entity.Person;

@Controller
@RequestMapping("/myMain")

public class mainController {

	@RequestMapping(value = "/show", method = RequestMethod.GET)

	public String show(ModelMap model) {

		model.addAttribute("message", "Hi , Spring 3 MVC Hello World");

		return "hello";

	}

	@RequestMapping(value = "/showObject", method = RequestMethod.GET)

	public String showObject(ModelMap model) {
		
		// test object
		Person person = new Person();
		person.setPersonName("su");
		person.setPersonGender(0);
		model.addAttribute("message", person);

		return "helloObject";

	}

}