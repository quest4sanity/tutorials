package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TASK_TYPES database table.
 * 
 */
@Entity
@Table(name="TASK_TYPES")
@NamedQuery(name="TaskType.findAll", query="SELECT t FROM TaskType t")
public class TaskType extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TYPE_ID", unique=true, nullable=false)
	private long typeId;

	@Column(nullable=false, length=32)
	private String code;

	@Column(length=2000)
	private String description;

	@Column(nullable=false, length=128)
	private String title;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="taskType")
	private List<Task> tasks;

	public TaskType() {
	}

	public long getTypeId() {
		return this.typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
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
		task.setTaskType(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setTaskType(null);

		return task;
	}

}