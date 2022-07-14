package jana60.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Degrees;
import jana60.repository.DegreesRepository;

@Controller
@RequestMapping("/")
public class DegreesController {
	
	@Autowired
	private DegreesRepository repo;
	
	@GetMapping("/degrees")
	public String courses(Model model) {
		
		List<Degrees> degreesList = (List<Degrees>)repo.findAll();
		
		model.addAttribute("degreesList", degreesList);
		
		return "degrees";
	}

}
