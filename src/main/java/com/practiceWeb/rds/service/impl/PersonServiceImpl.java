package com.practiceWeb.rds.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practiceWeb.rds.dao.PersonDAO;
import com.practiceWeb.rds.entity.Person;
import com.practiceWeb.rds.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public void addPerson(Person person) {
		this.personDAO.addPerson(person);
	}

	@Override
	public void updatePerson(Person person) {
		this.personDAO.updatePerson(person);
	}

	@Override
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}

	@Override
	public Person getPersonById(int personId) {
		return this.personDAO.getPersonById(personId);
	}

	@Override
	public void removePerson(int personId) {
		this.personDAO.removePerson(personId);
	}

}
