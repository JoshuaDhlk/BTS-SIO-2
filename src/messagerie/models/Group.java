package messagerie.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Group {
	private String name;
	private String description;
	private String email;
	private Set<User> users;


	public Group(String name) {
		this.name=name;
		users = new HashSet<>();
		}
	
	
	public void addUsers(User...users){
		for(User user : users) {
			if(this.users.add(user)) {
				user.getGroups().add(this);
			}
		}
		
	}
	
	
	public String getName() {
		return name;
		
	}
	

	
	public boolean removeUser(User user) {
		return this.users.remove(user);
	}
	
	public int count() {
		return this.users.size();
		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Group)) {
			return false;
		}
		return this.name.equals(((Group) obj).getName());
	}
	
	public boolean removeFrom(User user) {
		if(this.users.remove(user)) {
			return user.getGroups().remove(this);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return "jjj";
	}


	public Set<User> getUsers() {

		return users;
	}


	}
	


