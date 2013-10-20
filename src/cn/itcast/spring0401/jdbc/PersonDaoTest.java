package cn.itcast.spring0401.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDaoTest {
	@Test
	public void testSavePerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/jdbc/applicationContext.xml");
		
		PersonDao personDao = (PersonDao)context.getBean("personDao");
	 
		personDao.insertPerson();
	}
	
	@Test
	public void testUpatePerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/jdbc/applicationContext.xml");
		
		PersonDao personDao = (PersonDao)context.getBean("personDao");
	 
		personDao.updatePerson();
	}
	
	@Test
	public void testDeletePerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/jdbc/applicationContext.xml");
		
		PersonDao personDao = (PersonDao)context.getBean("personDao");
	 
		personDao.deletePerson();
	}
	
	@Test
	public void testGetAllPerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/jdbc/applicationContext.xml");
		
		PersonDao personDao = (PersonDao)context.getBean("personDao");
	 
		personDao.getAllPerson();
	}
	
	@Test
	public void testGetAllPersonByRowMapper(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/jdbc/applicationContext.xml");
		
		PersonDao personDao = (PersonDao)context.getBean("personDao");
	 
		personDao.getAllPersonByRowMapper();
	}
	
	@Test
	public void testGetPersonsByParam(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/jdbc/applicationContext.xml");
		
		PersonDao personDao = (PersonDao)context.getBean("personDao");
	 
		personDao.getPersons();
	}
}
