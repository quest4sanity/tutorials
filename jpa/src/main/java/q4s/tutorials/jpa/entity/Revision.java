package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the REVISIONS database table.
 * 
 */
@Entity
@Table(name="REVISIONS")
@NamedQuery(name="Revision.findAll", query="SELECT r FROM Revision r")
public class Revision extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="REV_ID", unique=true, nullable=false)
	private long revId;

	@Column(length=32)
	private String code;

	@Column(name="MINOR_VER", nullable=false)
	private int minorVer;

	private String stuff;

	//bi-directional many-to-one association to Release
	@OneToMany(mappedBy="revision")
	private List<Release> releases;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="PROJECT_ID", nullable=false)
	private Project project;

	//bi-directional many-to-one association to RevisionHist
	@OneToMany(mappedBy="revision")
	private List<RevisionHist> revisionHists;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="revision")
	private List<Task> tasks;

	public Revision() {
	}

	public long getRevId() {
		return this.revId;
	}

	public void setRevId(long revId) {
		this.revId = revId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getMinorVer() {
		return this.minorVer;
	}

	public void setMinorVer(int minorVer) {
		this.minorVer = minorVer;
	}

	public String getStuff() {
		return this.stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public List<Release> getReleases() {
		return this.releases;
	}

	public void setReleases(List<Release> releases) {
		this.releases = releases;
	}

	public Release addReleas(Release releas) {
		getReleases().add(releas);
		releas.setRevision(this);

		return releas;
	}

	public Release removeReleas(Release releas) {
		getReleases().remove(releas);
		releas.setRevision(null);

		return releas;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<RevisionHist> getRevisionHists() {
		return this.revisionHists;
	}

	public void setRevisionHists(List<RevisionHist> revisionHists) {
		this.revisionHists = revisionHists;
	}

	public RevisionHist addRevisionHist(RevisionHist revisionHist) {
		getRevisionHists().add(revisionHist);
		revisionHist.setRevision(this);

		return revisionHist;
	}

	public RevisionHist removeRevisionHist(RevisionHist revisionHist) {
		getRevisionHists().remove(revisionHist);
		revisionHist.setRevision(null);

		return revisionHist;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setRevision(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setRevision(null);

		return task;
	}

}