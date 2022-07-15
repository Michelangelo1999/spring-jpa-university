package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import jana60.model.Courses;

public interface CoursesRepository extends CrudRepository<Courses, Integer> {
	
	List<Courses> findAllByOrderByName();

}
