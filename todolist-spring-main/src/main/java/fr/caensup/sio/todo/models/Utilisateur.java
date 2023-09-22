package fr.caensup.sio.todo.models;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Utilisateur")
@Getter
@Setter
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String email = "";
	private String login = "";
	private String password = "";
	
	@OneToMany(mappedBy = "utilisateur",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<ToDoList> listes= new HashSet<ToDoList>();
	
	@ManyToMany
	private Set<ToDoList> listesPartagee=new HashSet<ToDoList>();
}
