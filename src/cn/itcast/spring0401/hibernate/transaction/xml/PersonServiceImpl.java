package cn.itcast.spring0401.hibernate.transaction.xml;

import java.util.List;

public class PersonServiceImpl implements PersonService{

	private PersonDao personDao;
	public PersonDao getPersonDao() {
		return personDao;
	}
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDao.savePerson(person);
	}
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return this.personDao.getPersons();
	}
}
