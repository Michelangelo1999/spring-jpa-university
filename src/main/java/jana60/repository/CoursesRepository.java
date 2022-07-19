package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.model.Courses;

@Repository
public interface CoursesRepository extends CrudRepository<Courses, Integer> {
	
	List<Courses> findAllByOrderByName();
	List<Courses> findAllByOrderByCfuDesc();
	

}
