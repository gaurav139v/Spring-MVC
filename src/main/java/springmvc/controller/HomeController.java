package springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home method");
		model.addAttribute("Name", "Ankit");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about method");
		return "about";
	}
	
	// using model and view object
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("Name", "Ankit");
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(40);
		marks.add(42);
		marks.add(89);
		modelAndView.addObject("marks", marks);
		
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
