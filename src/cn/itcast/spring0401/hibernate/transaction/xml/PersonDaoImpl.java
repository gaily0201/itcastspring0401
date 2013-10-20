package cn.itcast.spring0401.hibernate.transaction.xml;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{

	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(person);
	}

	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}
