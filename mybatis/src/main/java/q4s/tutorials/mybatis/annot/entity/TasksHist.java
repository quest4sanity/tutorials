package q4s.tutorials.mybatis.annot.entity;

import java.io.Serializable;
import java.util.Date;

public class TasksHist extends TasksHistKey implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column TASKS_HIST.EMP_ID
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	private Long empId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column TASKS_HIST.WORK_TIME
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	private Date workTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column TASKS_HIST.DESCRIPTION
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column TASKS_HIST.STUFF
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	private String stuff;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public TasksHist(Long taskId, Date dat, Date datto, Long empId, Date workTime, String description) {
		super(taskId, dat, datto);
		this.empId = empId;
		this.workTime = workTime;
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public TasksHist(Long taskId, Date dat, Date datto, Long empId, Date workTime, String description, String stuff) {
		super(taskId, dat, datto);
		this.empId = empId;
		this.workTime = workTime;
		this.description = description;
		this.stuff = stuff;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public TasksHist() {
		super();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column TASKS_HIST.EMP_ID
	 * @return  the value of TASKS_HIST.EMP_ID
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public Long getEmpId() {
		return empId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column TASKS_HIST.EMP_ID
	 * @param empId  the value for TASKS_HIST.EMP_ID
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column TASKS_HIST.WORK_TIME
	 * @return  the value of TASKS_HIST.WORK_TIME
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public Date getWorkTime() {
		return workTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column TASKS_HIST.WORK_TIME
	 * @param workTime  the value for TASKS_HIST.WORK_TIME
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column TASKS_HIST.DESCRIPTION
	 * @return  the value of TASKS_HIST.DESCRIPTION
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column TASKS_HIST.DESCRIPTION
	 * @param description  the value for TASKS_HIST.DESCRIPTION
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column TASKS_HIST.STUFF
	 * @return  the value of TASKS_HIST.STUFF
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public String getStuff() {
		return stuff;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column TASKS_HIST.STUFF
	 * @param stuff  the value for TASKS_HIST.STUFF
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", empId=").append(empId);
		sb.append(", workTime=").append(workTime);
		sb.append(", description=").append(description);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	@Override
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

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TASKS_HIST
	 * @mbg.generated  Tue Jun 23 13:10:31 MSK 2020
	 */
	@Override
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