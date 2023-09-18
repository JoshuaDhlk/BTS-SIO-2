package fr.caensup.sio.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.caensup.sio.todolist.models.Utilisateur;

public interface UserRepository extends JpaRepository<Utilisateur, Integer>{

}
