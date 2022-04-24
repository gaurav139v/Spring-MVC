package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:/two";
	}
	
	@RequestMapping("/test")
	public RedirectView test() {
		System.out.println("This is test handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String tow() {
		System.out.println("This is second handler");
		return "form";
	}
}
