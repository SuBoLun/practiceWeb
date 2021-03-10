package com.practiceWeb.rds.dao;

import java.util.List;

import com.practiceWeb.rds.entity.Person;

public interface PersonDAO {

	public void addPerson(Person person);

	public void updatePerson(Person person);

	public List<Person> listPersons();

	public Person getPersonById(int personId);

	public void removePerson(int personId);

}
