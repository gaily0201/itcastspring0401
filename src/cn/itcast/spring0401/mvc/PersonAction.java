package cn.itcast.spring0401.mvc;

public class PersonAction {
	private PersonService personService;
	public PersonService getPersonService() {
		return personService;
	}
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	public void savePerson(){
		this.personService.savePerson();
	}
	
	public void updatePerson(){
		this.personService.updatePerson();
	}
}
