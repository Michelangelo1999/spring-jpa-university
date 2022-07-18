package jana60.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "degrees")
public class Degrees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int degreesId;
	
	private String name;
	private String level;
	private String address;
	private String email;
	
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Departments departments;
	
	@OneToMany
	@JoinColumn(name = "courses_id")
	private List<Courses> courses;
	
	
	//getters and setters
	public int getDegreesId() {
		return degreesId;
	}
	public void setDegreesId(int degreesId) {
		this.degreesId = degreesId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Departments getDepartments() {
		return departments;
	}
	public void setDepartments(Departments departments) {
		this.departments = departments;
	}
	
	public String getDepartmentsName() {
		return this.departments.getName();
	}
	
	

}
