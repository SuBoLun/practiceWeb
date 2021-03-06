package com.practiceWeb.rds.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practiceWeb.rds.entity.Person;

public interface PersonService {

	public void addPerson(Person person);

	public void updatePerson(Person person);

	public List<Person> listPersons();

	public Person getPersonById(int personId);

	public void removePerson(int personId);

}
