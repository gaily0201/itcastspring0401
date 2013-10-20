package cn.itcast.spring0401.hibernate.transaction.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void testSavePerson(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/hibernate/transaction/xml/applicationContext.xml");
		
		PersonService personService = (PersonService)context.getBean("personService");
	
		Person person = new Person();
		
		person.setPname("武大郎");
		
		personService.savePerson(person);
	}
}
