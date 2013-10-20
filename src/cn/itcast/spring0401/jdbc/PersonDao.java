package cn.itcast.spring0401.jdbc;

import java.util.List;

public interface PersonDao {
	public void insertPerson();
	public void updatePerson();
	
	public void deletePerson();
	
	public List<Person> getAllPerson();
	
	public List<Person> getAllPersonByRowMapper();
	
	public List<Person> getPersons();
}
