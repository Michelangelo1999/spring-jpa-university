package jana60.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jana60.model.Departments;
import jana60.repository.DepartmentsRepository;

@Controller
@RequestMapping("/")
public class DepartmentsController {
	
	@Autowired
	private DepartmentsRepository repo;
	
	@GetMapping
	public String depart(Model model) {
		
		List<Departments> departList = (List<Departments>)repo.findAllByOrderByName();
		List<Departments> emptyList = new ArrayList<Departments>();
		
		model.addAttribute("departList", departList);
		
		return "departments";
	}

}
