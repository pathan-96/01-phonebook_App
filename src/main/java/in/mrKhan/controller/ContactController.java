package in.mrKhan.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.mrKhan.entity.ContactEntity;
import in.mrKhan.service.IContactService;



@Controller
public class ContactController {
	
		private IContactService serv;
	
	@Autowired
	public void setServ(IContactService serv) {
	
		this.serv = serv;
	}

	
	@PostMapping("/saveProcess")
	public String saveProcessContact(
			       @ModelAttribute("saveContact") ContactEntity entity,
			                           Model model)	
	{
	
		String msg= null;
		   
		if(entity.getContactId()==null)
		{
			msg="contact saved successfully!";
		}
		else {
    			msg="contact updated successfully! ";
			}
			
		boolean isStatus = serv.saveContact(entity);
			
		if(isStatus)
			model.addAttribute("succMsg",msg);
		else
			model.addAttribute("errMsg","record insertion faild!");
				
		return"contact-form";
	}

	
	@RequestMapping("/viewAllContact")
	public String viewAllContact(Model model) {
	
		List<ContactEntity> allContact = serv.getAllContact();
		
		model.addAttribute("contacts",allContact);
		
		return "viewContacts";
	}
	
	
	@GetMapping("/edit")
	public String handleEditClick(@RequestParam("cid")Integer cid,
			                               Model model)
	{
	
		ContactEntity id= serv.getContactById(cid);
		
		model.addAttribute("saveContact",id);
		
		return "contact-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteContact(@RequestParam("cid") Integer cid)
	{
	
		
		serv.deleteContactById(cid);

		return "redirect:/viewAllContact";
			
	}
	
	
	
	
}

















