package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContectController {
	
	@Autowired
	private UserService userService;
		
	// common data which we need every time.
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("desc", "Spring MVC practice");
	}
	
	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST) 
	public String processform(
			@RequestParam("name") String name,
			@RequestParam("contact") String contact,
			@RequestParam("country") String country,
			Model model) {
		
		// HttpServletRequest can be used get parameter to fetch data 
		System.out.println(name);
		System.out.println(contact);
		System.out.println(country);
		
		model.addAttribute("Name", name);
		model.addAttribute("Contact", contact);
		model.addAttribute("Country", country);
		return "sucess";
	}
	
	@RequestMapping(path="/processform1", method = RequestMethod.POST)
	public String processform2(@ModelAttribute User user, Model model) {
		System.out.println(user);
		int userid = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id: "+userid);
		return "sucess";
	}
}
