package fr.caensup.sio.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorControlleur {

	@RequestMapping("/erreur")
	@ResponseBody
	public String errorAction() {
		return "Error 404";
	}

}