package jana60.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import jana60.model.Teacher;
import jana60.repository.TeacherRepository;



@Controller
@RequestMapping("/")
public class TeacherController {
	
	@Autowired
	private TeacherRepository repo;
	
	@GetMapping("/teachers")
	public String courses(Model model) {
		
		List<Teacher> teachersList = (List<Teacher>)repo.findAll();
		
		model.addAttribute("teachersList", teachersList);
		
		return "teachers";
	}
	
	@GetMapping("/detail/{id}")
	public String teacherDetails(@PathVariable(name = "id") Integer teacherId, Model model) {
		Optional<Teacher> queryResult = repo.findById(teacherId);
		
		if(queryResult.isPresent()) {
			model.addAttribute("teacher", queryResult.get());
			return "teacherDetails";
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Teacher not found");
		}
	}

}
