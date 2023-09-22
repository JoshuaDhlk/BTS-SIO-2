package fr.caensup.sio.todo.models;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode.Include;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ToDoList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Include
	private String nom;
	
	@ManyToOne
	private Utilisateur utilisateur;
	
	@ManyToMany
	private Set<Utilisateur>collaborateur;
	
	@Override
	public String toString() {
		return nom;
	}
	
}
