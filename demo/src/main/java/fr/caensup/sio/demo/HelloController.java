package fr.caensup.sio.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/hello")
@SessionAttributes("messages")
public class HelloController {
	@RequestMapping({"/",""})
	@ResponseBody
	public String helloAction() {
		return "Hello world";
	}
	
	@ModelAttribute("messages")
	public List<String>getMessage(){
		return new ArrayList<String>();
	}
	
	
	@RequestMapping("/{message}/{count}")
	@ResponseBody
	public String helloAction(@PathVariable String message,@PathVariable int count) {
		return (message + "<br>").repeat(count); 	/*http://127.0.0.1:8080/toutLeMonde/2*/
	}

	@RequestMapping("/vue")
	public String helloWithVueAction() {
		return "hello vue";
	}
	@GetMapping("/vue/{message}")
	public String helloWithVueAction(@PathVariable String message, ModelMap model) {
		model.put("autreVariable", new String[] {"A", "B", "C", "D"});
		return "test";
	}
	
	@GetMapping("/form")
	public String formAction() {
		return "form";
	}
	
	@PostMapping("/form")
	public RedirectView formSubmitAction(@RequestParam String message, @SessionAttribute List<String> messages ) {
		messages.add(message);
		return new RedirectView("/hello/vue/" + message);
	}
	
}
