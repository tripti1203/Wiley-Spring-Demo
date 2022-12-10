package Encapsulation;

import java.util.ArrayList;
import java.util.List;

class UserCollection {
	
	private List<String> users;
	
	public void setUsers(List<String> users) {
		this.users = users;
	}
	public List<String> getUsers() {
		return users;
	}
}

public class ObjectGetterAndSetter {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Tripti Kushwaha");
		list.add("Priya Sharma");
		list.add("Nihal Suman");
		list.add("Kiran K");
		
		UserCollection obj = new UserCollection();
		obj.setUsers(list);
		for(String names : obj.getUsers()) {
			System.out.println(names);
		}

	}

}
