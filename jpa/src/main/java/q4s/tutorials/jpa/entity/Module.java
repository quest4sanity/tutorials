package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the MODULES database table.
 * 
 */
@Entity
@Table(name="MODULES")
@NamedQuery(name="Module.findAll", query="SELECT m FROM Module m")
public class Module extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MODULE_ID", unique=true, nullable=false)
	private long moduleId;

	@Column(nullable=false, length=32)
	private String code;

	@Column(length=2000)
	private String description;

	private String stuff;

	@Column(nullable=false, length=128)
	private String title;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="PROJECT_ID", nullable=false)
	private Project project;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="module")
	private List<Task> tasks;

	public Module() {
	}

	public long getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
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

	public String getStuff() {
		return this.stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setModule(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setModule(null);

		return task;
	}

}