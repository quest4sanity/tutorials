package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PROJECTS database table.
 * 
 */
@Entity
@Table(name="PROJECTS")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROJECT_ID", unique=true, nullable=false)
	private long projectId;

	@Column(nullable=false, length=32)
	private String code;

	@Column(length=2000)
	private String description;

	@Column(name="MAJOR_VER", nullable=false)
	private int majorVer;

	private String stuff;

	@Column(nullable=false, length=128)
	private String title;

	//bi-directional many-to-one association to Module
	@OneToMany(mappedBy="project")
	private List<Module> modules;

	//bi-directional many-to-one association to ProjectState
	@ManyToOne
	@JoinColumn(name="STATE_ID", nullable=false)
	private ProjectState projectState;

	//bi-directional many-to-one association to Revision
	@OneToMany(mappedBy="project")
	private List<Revision> revisions;

	public Project() {
	}

	public long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
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

	public int getMajorVer() {
		return this.majorVer;
	}

	public void setMajorVer(int majorVer) {
		this.majorVer = majorVer;
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

	public List<Module> getModules() {
		return this.modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public Module addModule(Module module) {
		getModules().add(module);
		module.setProject(this);

		return module;
	}

	public Module removeModule(Module module) {
		getModules().remove(module);
		module.setProject(null);

		return module;
	}

	public ProjectState getProjectState() {
		return this.projectState;
	}

	public void setProjectState(ProjectState projectState) {
		this.projectState = projectState;
	}

	public List<Revision> getRevisions() {
		return this.revisions;
	}

	public void setRevisions(List<Revision> revisions) {
		this.revisions = revisions;
	}

	public Revision addRevision(Revision revision) {
		getRevisions().add(revision);
		revision.setProject(this);

		return revision;
	}

	public Revision removeRevision(Revision revision) {
		getRevisions().remove(revision);
		revision.setProject(null);

		return revision;
	}

}