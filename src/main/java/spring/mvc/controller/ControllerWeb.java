package spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.model.User;

@Controller
public class ControllerWeb {

	@RequestMapping(value = {"/addUser","/"},method = RequestMethod.GET)
	public ModelAndView doGetAddUser(Model model) {
		if(!model.containsAttribute("user")) {
			model.addAttribute("user", new User());
		}
		return new ModelAndView("addUser");
	}
	
	@RequestMapping(value = "/addUser",method = RequestMethod.POST)
	public ModelAndView doPostAddUser(@ModelAttribute(name = "user") @Valid User user, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return new ModelAndView("addUser");
		}
		return new ModelAndView("viewUser");
	}
	
}
