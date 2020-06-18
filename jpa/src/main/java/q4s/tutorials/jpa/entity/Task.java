package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TASKS database table.
 * 
 */
@Entity
@Table(name="TASKS")
@NamedQuery(name="Task.findAll", query="SELECT t FROM Task t")
public class Task extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TASK_ID", unique=true, nullable=false)
	private long taskId;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date dat;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_FACT")
	private Date datFact;

	@Temporal(TemporalType.DATE)
	@Column(name="DAT_PLAN")
	private Date datPlan;

	@Column(length=2000)
	private String description;

	private String stuff;

	@Column(nullable=false, length=128)
	private String title;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="AUTHOR_ID", nullable=false)
	private Employee employee;

	//bi-directional many-to-one association to Module
	@ManyToOne
	@JoinColumn(name="MODULE_ID")
	private Module module;

	//bi-directional many-to-one association to Priority
	@ManyToOne
	@JoinColumn(name="PRIORITY_ID", nullable=false)
	private Priority priority;

	//bi-directional many-to-one association to Release
	@ManyToOne
	@JoinColumn(name="RELEASE_ID")
	private Release releas;

	//bi-directional many-to-one association to Revision
	@ManyToOne
	@JoinColumn(name="REV_ID", nullable=false)
	private Revision revision;

	//bi-directional many-to-many association to Tag
	@ManyToMany
	@JoinTable(
		name="TASK_TAGS"
		, joinColumns={
			@JoinColumn(name="TASK_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="TAG_ID", nullable=false)
			}
		)
	private List<Tag> tags;

	//bi-directional many-to-one association to Task
	@ManyToOne
	@JoinColumn(name="PARENT_ID")
	private Task task;

	//bi-directional many-to-one association to Task
	@OneToMany(mappedBy="task")
	private List<Task> tasks;

	//bi-directional many-to-one association to TaskType
	@ManyToOne
	@JoinColumn(name="TYPE_ID", nullable=false)
	private TaskType taskType;

	//bi-directional many-to-one association to TasksHist
	@OneToMany(mappedBy="task")
	private List<TasksHist> tasksHists;

	public Task() {
	}

	public long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public Date getDatFact() {
		return this.datFact;
	}

	public void setDatFact(Date datFact) {
		this.datFact = datFact;
	}

	public Date getDatPlan() {
		return this.datPlan;
	}

	public void setDatPlan(Date datPlan) {
		this.datPlan = datPlan;
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

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Priority getPriority() {
		return this.priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Release getReleas() {
		return this.releas;
	}

	public void setReleas(Release releas) {
		this.releas = releas;
	}

	public Revision getRevision() {
		return this.revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task addTask(Task task) {
		getTasks().add(task);
		task.setTask(this);

		return task;
	}

	public Task removeTask(Task task) {
		getTasks().remove(task);
		task.setTask(null);

		return task;
	}

	public TaskType getTaskType() {
		return this.taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public List<TasksHist> getTasksHists() {
		return this.tasksHists;
	}

	public void setTasksHists(List<TasksHist> tasksHists) {
		this.tasksHists = tasksHists;
	}

	public TasksHist addTasksHist(TasksHist tasksHist) {
		getTasksHists().add(tasksHist);
		tasksHist.setTask(this);

		return tasksHist;
	}

	public TasksHist removeTasksHist(TasksHist tasksHist) {
		getTasksHists().remove(tasksHist);
		tasksHist.setTask(null);

		return tasksHist;
	}

}