package cn.itcast.spring0401.jdbc.transaction.annotation;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

@Repository(value="personDao")
public class PersonDaoImpl implements PersonDao{

	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	public void savePerson() {
		// TODO Auto-generated method stub
		this.jdbcTemplate.execute("insert into person(pname) values('王二麻子')");
	}	
}
