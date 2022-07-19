package jana60.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import jana60.model.Departments;

public interface DepartmentsRepository extends CrudRepository<Departments, Integer> {
	
	List<Departments> findAllByOrderByName();
	//findAllBy è fisso, poi continua con la parte custom
	
	List<Departments> findAllByOrderByNameDesc();
    
	//se vuoi qualcosa di ancora più specifico, puoi creare delle query manualmente con l'annotation @equery
}
