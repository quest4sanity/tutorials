package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PROJECT_STATES database table.
 * 
 */
@Entity
@Table(name="PROJECT_STATES")
@NamedQuery(name="ProjectState.findAll", query="SELECT p FROM ProjectState p")
public class ProjectState extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STATE_ID", unique=true, nullable=false)
	private long stateId;

	@Column(nullable=false, length=32)
	private String code;

	@Column(length=2000)
	private String description;

	@Column(nullable=false, length=128)
	private String title;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="projectState")
	private List<Project> projects;

	public ProjectState() {
	}

	public long getStateId() {
		return this.stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
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

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project addProject(Project project) {
		getProjects().add(project);
		project.setProjectState(this);

		return project;
	}

	public Project removeProject(Project project) {
		getProjects().remove(project);
		project.setProjectState(null);

		return project;
	}

}