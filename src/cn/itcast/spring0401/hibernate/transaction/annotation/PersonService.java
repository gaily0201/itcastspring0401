package cn.itcast.spring0401.hibernate.transaction.annotation;

import java.util.List;

public interface PersonService {
	public void savePerson(Person person);
	
	public List<Person> getPersons();
}
