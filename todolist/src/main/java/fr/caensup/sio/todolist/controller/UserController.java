package fr.caensup.sio.todolist.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import fr.caensup.sio.todolist.models.Utilisateur;
import fr.caensup.sio.todolist.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository uRepository;
	
	@GetMapping("/users")
	public String index(ModelMap model) {
		model.put("users", uRepository.findAll());
		return "/users/index";
	}
		
	@GetMapping("/users/{id}")
	public ModelAndView showUserAction(@PathVariable int id) {
		Optional<Utilisateur> optUser = uRepository.findById(id);
		if(optUser.isPresent()) {
			return new ModelAndView(".users/show", "user", optUser.get());
		}
		return new ModelAndView("", HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("users/create")
	public ModelAndView createUserAction() {
		return new ModelAndView("/users/form", "user", new Utilisateur());
	}
	
	@PostMapping("/users/create")
	public RedirectView submitCreateUserAction(@ModelAttribute Utilisateur user, RedirectAttributes attrs) {
		uRepository.save(user);
		attrs.addFlashAttribute("message", "Utilisateur" + user.getLogin()+" ajouté");
		return new RedirectView("/users");
	
	}
}