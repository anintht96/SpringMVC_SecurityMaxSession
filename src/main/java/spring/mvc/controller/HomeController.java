package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value = {"/login" },method = RequestMethod.GET)
	public String login(@RequestParam(name = "message", required = false) String message, final Model model) {
		if (message != null && !message.isEmpty()) {
			if (message.equals("timeout")) {
				model.addAttribute("message", "Time out");
			}
			if (message.equals("max_session")) {
				model.addAttribute("message", "This account has been login from another device!");
			}
			if (message.equals("logout")) {
				model.addAttribute("message", "Logout!");
			}
			if (message.equals("error")) {
				model.addAttribute("message", "Login Failed!");
			}
		}
		return "login";
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user() {
		return "user";
	}
}
