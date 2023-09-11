package messagerie.models;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class User {
	private String lastname;
	private int age;
	private String firstname;
	private String login;
	private String password;
	private String email;
	private LocalDate bDate;
	private Set<Group> groups;

	
	//Constructeur
	public User(String lastname, String firstname, LocalDate bDate, Group group) {
		this.lastname = lastname;
		this.age=0;
		this.bDate = bDate;
		this.firstname = firstname;
		this.groups = new HashSet<>();

	}
	
	public User(String lastname, String firstname) {
		this(lastname, firstname, null, null);
	}
	
	public User() {
		this("?","?");
	}
	//pour afficher Maurice avec methode afficher
	public void afficher() {
		System.out.println(lastname + "...");
	}
	
	public boolean addIn(Group group) {
		if(this.groups.add(group)) {
			group.getUsers().add(this);
			return true;
		}
		return false;
	}
	
	
	
	//pour afficher Maurice avec methode Override
	@Override
	public String toString() {
		return lastname + " " + firstname + " (" + age + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof User)) {
			return false;
		}
		return this.getEmail().equals(((User) obj).getEmail());
	}
	
	@Override
	public int hashCode() {
		return getEmail().hashCode();
	}
	
	
	/*----------------------
	//Accesseur /Mutateur
	----------------------*/
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Set<Group> getGroups() {
		return groups;
	}
	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getlastname() {
		return this.lastname;
	}
	public void setlastname(String lastname) {
		this.lastname=lastname;
	}
	public String getfirstname() {
		return this.firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname=firstname;
	}
	public int getAge() {
		return 0;
	}
	
	public String getPasswod() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login=login;
	}
	
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public LocalDate getbDate() {
		return this.bDate;
	}
	public void setbDate(LocalDate bDate) {
		this.bDate=bDate;
	}
		
	public String getPassword() {
		return password;
	}
	

	public String  getEmail(){
		return lastname + "." + firstname;
	}
	
	
	public boolean removeFrom(Group group) {
		if(this.groups.remove(group)) {
			return group.getUsers().remove(this);
		}
		return false;
	}
	
	
	// Ne respect pas les norme du Set
	
	public boolean setAge(int age) {
		if(age >= 0 && age <= 130) {
			this.age=age;
			return true;
		}else {
			return false;
		}
	}
}