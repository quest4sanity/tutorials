package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the TASKS_HIST database table.
 * 
 */
@Entity
@Table(name="TASKS_HIST")
@NamedQuery(name="TasksHist.findAll", query="SELECT t FROM TasksHist t")
public class TasksHist extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TasksHistPK id;

	@Column(length=2000)
	private String description;

	private String stuff;

	@Column(name="WORK_TIME")
	private Time workTime;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="EMP_ID", nullable=false)
	private Employee employee;

	//bi-directional many-to-one association to Task
	@ManyToOne
	@JoinColumn(name="TASK_ID", nullable=false, insertable=false, updatable=false)
	private Task task;

	public TasksHist() {
	}

	public TasksHistPK getId() {
		return this.id;
	}

	public void setId(TasksHistPK id) {
		this.id = id;
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

	public Time getWorkTime() {
		return this.workTime;
	}

	public void setWorkTime(Time workTime) {
		this.workTime = workTime;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}