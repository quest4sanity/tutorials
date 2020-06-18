package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the EMPLOYEES database table.
 * 
 */
@Entity
@Table(name="EMPLOYEES")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EMP_ID", unique=true, nullable=false)
	private long empId;

	@Column(length=128)
	private String email;

	@Column(nullable=false, length=64)
	private String fname;

	@Column(nullable=false, length=64)
	private String lname;

	@Column(length=64)
	private String mname;

	@Column(nullable=false, length=32)
	private String nickname;

	private String stuff;

	//bi-directional many-to-one association to Skill
	@ManyToOne
	@JoinColumn(name="SKILL_ID", nullable=false)
	private Skill skill;

	//bi-directional many-to-one association to RevisionHist
	@OneToMany(mappedBy="employee")
	private List<RevisionHist> revisionHists;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="employee")
	private List<Task> tasks;

	//bi-directional many-to-one association to TasksHist
	@OneToMany(mappedBy="employee")
	private List<TasksHist> tasksHists;

	public Employee() {
	}

	public long getEmpId() {
		return this.empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getStuff() {
		return this.stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public List<RevisionHist> getRevisionHists() {
		return this.revisionHists;
	}

	public void setRevisionHists(List<RevisionHist> revisionHists) {
		this.revisionHists = revisionHists;
	}

	public RevisionHist addRevisionHist(RevisionHist revisionHist) {
		getRevisionHists().add(revisionHist);
		revisionHist.setEmployee(this);

		return revisionHist;
	}

	public RevisionHist removeRevisionHist(RevisionHist revisionHist) {
		getRevisionHists().remove(revisionHist);
		revisionHist.setEmployee(null);

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
		task.setEmployee(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setEmployee(null);

		return task;
	}

	public List<TasksHist> getTasksHists() {
		return this.tasksHists;
	}

	public void setTasksHists(List<TasksHist> tasksHists) {
		this.tasksHists = tasksHists;
	}

	public TasksHist addTasksHist(TasksHist tasksHist) {
		getTasksHists().add(tasksHist);
		tasksHist.setEmployee(this);

		return tasksHist;
	}

	public TasksHist removeTasksHist(TasksHist tasksHist) {
		getTasksHists().remove(tasksHist);
		tasksHist.setEmployee(null);

		return tasksHist;
	}

}