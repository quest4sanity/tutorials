package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the RELEASES database table.
 * 
 */
@Entity
@Table(name="RELEASES")
@NamedQuery(name="Release.findAll", query="SELECT r FROM Release r")
public class Release extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RELEASE_ID", unique=true, nullable=false)
	private long releaseId;

	@Temporal(TemporalType.DATE)
	@Column(name="RELEASE_DATE")
	private Date releaseDate;

	@Column(name="RELEASE_VER", nullable=false)
	private int releaseVer;

	private String stuff;

	//bi-directional many-to-one association to Revision
	@ManyToOne
	@JoinColumn(name="REV_ID", nullable=false)
	private Revision revision;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="releas")
	private List<Task> tasks;

	public Release() {
	}

	public long getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(long releaseId) {
		this.releaseId = releaseId;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getReleaseVer() {
		return this.releaseVer;
	}

	public void setReleaseVer(int releaseVer) {
		this.releaseVer = releaseVer;
	}

	public String getStuff() {
		return this.stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public Revision getRevision() {
		return this.revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setReleas(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setReleas(null);

		return task;
	}

}