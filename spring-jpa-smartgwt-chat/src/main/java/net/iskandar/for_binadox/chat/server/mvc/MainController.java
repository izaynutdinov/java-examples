package net.iskandar.for_binadox.chat.server.mvc;

import javax.servlet.http.HttpServletRequest;

import net.iskandar.for_binadox.chat.server.Utils;
import net.iskandar.for_binadox.chat.server.domain.User;
import net.iskandar.for_binadox.chat.server.mvc.model.LoginForm;
import net.iskandar.for_binadox.chat.server.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@Autowired
	private ChatService chatService;
	
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public ModelAndView login(HttpServletRequest req){
		Utils.logout(req);
		return new ModelAndView("login", "loginForm", new LoginForm());
	}

	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest req, @ModelAttribute("loginForm") LoginForm loginForm){
		User user = chatService.login(loginForm.getLogin(), loginForm.getPassword());
		if(user != null){
			Utils.setUserId(req, user.getId());
			return "redirect:/index.mvc";
		}
		loginForm.setErrorMessage("Incorrect login and/or password!");
		return "login";
	}

	@RequestMapping(path="/index", method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest req){
		if(Utils.isLoggedIn(req)){
			User user = chatService.getUser(Utils.getUserId(req));
			return new ModelAndView("index", "user", user);			
		}
		return new ModelAndView("redirect:/login.mvc");
	}

}
