package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.model.Departments;

@Repository
public interface DepartmentsRepository extends CrudRepository<Departments, Integer> {
	
	List<Departments> findAllByOrderByName();
	//findAllBy è fisso, poi continua con la parte custom
	
	List<Departments> findAllByOrderByNameDesc();
	
	List<Departments> findByNameContainsIgnoreCase(String query);	
	
	

//	List<Departments> findBy(String query);
	
	
    
	//se vuoi qualcosa di ancora più specifico, puoi creare delle query manualmente con l'annotation @equery
}
