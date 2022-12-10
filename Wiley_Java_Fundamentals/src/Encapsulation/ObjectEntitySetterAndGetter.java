package Encapsulation;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String users;
	
	Person(String users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "[users=" + users + "]";
	}
	
}
class Client{
	List<Person> pList = new ArrayList<>();
	public List<Person> getpList() {
		return pList;
	}
	public void setpList(List<Person> pList) {
		this.pList = pList;
	}
}
public class ObjectEntitySetterAndGetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("King"));
		list.add(new Person("Kochhar"));
		list.add(new Person("Sarah"));
		list.add(new Person("Bowling"));
		
		Client client = new Client();
		client.setpList(list);
		for(Person person : client.getpList()) {
			System.out.println(person);
		}
	}

}
