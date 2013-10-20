package cn.itcast.spring0401.jdbc.transaction.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void testSavePerson(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/jdbc/transaction/annotation/applicationContext.xml");
		
		PersonService personService = (PersonService)context.getBean("personService");
		
		personService.savePerson();
	}
}
