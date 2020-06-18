package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PRIORITIES database table.
 * 
 */
@Entity
@Table(name="PRIORITIES")
@NamedQuery(name="Priority.findAll", query="SELECT p FROM Priority p")
public class Priority extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PRIORITY_ID", unique=true, nullable=false)
	private long priorityId;

	@Column(nullable=false, length=32)
	private String code;

	@Column(length=2000)
	private String description;

	@Column(nullable=false, length=128)
	private String title;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="priority")
	private List<Task> tasks;

	public Priority() {
	}

	public long getPriorityId() {
		return this.priorityId;
	}

	public void setPriorityId(long priorityId) {
		this.priorityId = priorityId;
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

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setPriority(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setPriority(null);

		return task;
	}

}