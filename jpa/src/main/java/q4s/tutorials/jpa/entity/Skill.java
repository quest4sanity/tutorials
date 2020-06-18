package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SKILLS database table.
 * 
 */
@Entity
@Table(name="SKILLS")
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SKILL_ID", unique=true, nullable=false)
	private long skillId;

	@Column(nullable=false, length=32)
	private String code;

	@Column(length=2000)
	private String description;

	@Column(nullable=false, length=128)
	private String title;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="skill")
	private List<Employee> employees;

	public Skill() {
	}

	public long getSkillId() {
		return this.skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setSkill(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setSkill(null);

		return employee;
	}

}