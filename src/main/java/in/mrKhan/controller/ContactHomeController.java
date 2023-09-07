package in.mrKhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.mrKhan.entity.ContactEntity;

@Controller
public class ContactHomeController {
	
	@RequestMapping("/")
	public String ContactForm(Model model)
	{
		model.addAttribute("saveContact", new ContactEntity());
		return "contact-form";
	}

}
