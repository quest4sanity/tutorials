package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class TasksHist extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.TASK_ID")
	private Long taskId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.DAT")
	private Date dat;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.DATTO")
	private Date datto;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.EMP_ID")
	private Long empId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.WORK_TIME")
	private Date workTime;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.DESCRIPTION")
	private String description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source field: TASKS_HIST.STUFF")
	private String stuff;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source Table: TASKS_HIST")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.615+03:00", comments = "Source Table: TASKS_HIST")
	public TasksHist(Long taskId, Date dat, Date datto, Long empId, Date workTime, String description, String stuff) {
		this.taskId = taskId;
		this.dat = dat;
		this.datto = datto;
		this.empId = empId;
		this.workTime = workTime;
		this.description = description;
		this.stuff = stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.615+03:00", comments = "Source Table: TASKS_HIST")
	public TasksHist() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.TASK_ID")
	public Long getTaskId() {
		return taskId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.TASK_ID")
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.DAT")
	public Date getDat() {
		return dat;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.DAT")
	public void setDat(Date dat) {
		this.dat = dat;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.DATTO")
	public Date getDatto() {
		return datto;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.DATTO")
	public void setDatto(Date datto) {
		this.datto = datto;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.EMP_ID")
	public Long getEmpId() {
		return empId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.EMP_ID")
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.WORK_TIME")
	public Date getWorkTime() {
		return workTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.WORK_TIME")
	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.616+03:00", comments = "Source field: TASKS_HIST.DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source field: TASKS_HIST.DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source field: TASKS_HIST.STUFF")
	public String getStuff() {
		return stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source field: TASKS_HIST.STUFF")
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source Table: TASKS_HIST")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", taskId=").append(taskId);
		sb.append(", dat=").append(dat);
		sb.append(", datto=").append(datto);
		sb.append(", empId=").append(empId);
		sb.append(", workTime=").append(workTime);
		sb.append(", description=").append(description);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source Table: TASKS_HIST")
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		TasksHist other = (TasksHist) that;
		return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
				&& (this.getDat() == null ? other.getDat() == null : this.getDat().equals(other.getDat()))
				&& (this.getDatto() == null ? other.getDatto() == null : this.getDatto().equals(other.getDatto()))
				&& (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
				&& (this.getWorkTime() == null ? other.getWorkTime() == null
						: this.getWorkTime().equals(other.getWorkTime()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()))
				&& (this.getStuff() == null ? other.getStuff() == null : this.getStuff().equals(other.getStuff()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.617+03:00", comments = "Source Table: TASKS_HIST")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
		result = prime * result + ((getDat() == null) ? 0 : getDat().hashCode());
		result = prime * result + ((getDatto() == null) ? 0 : getDatto().hashCode());
		result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
		result = prime * result + ((getWorkTime() == null) ? 0 : getWorkTime().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		result = prime * result + ((getStuff() == null) ? 0 : getStuff().hashCode());
		return result;
	}
}