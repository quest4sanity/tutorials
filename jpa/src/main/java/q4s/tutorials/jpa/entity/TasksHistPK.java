package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TASKS_HIST database table.
 * 
 */
@Embeddable
public class TasksHistPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="TASK_ID", insertable=false, updatable=false, unique=true, nullable=false)
	private long taskId;

	@Temporal(TemporalType.DATE)
	@Column(unique=true, nullable=false)
	private java.util.Date dat;

	@Temporal(TemporalType.DATE)
	@Column(unique=true, nullable=false)
	private java.util.Date datto;

	public TasksHistPK() {
	}
	public long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	public java.util.Date getDat() {
		return this.dat;
	}
	public void setDat(java.util.Date dat) {
		this.dat = dat;
	}
	public java.util.Date getDatto() {
		return this.datto;
	}
	public void setDatto(java.util.Date datto) {
		this.datto = datto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TasksHistPK)) {
			return false;
		}
		TasksHistPK castOther = (TasksHistPK)other;
		return 
			(this.taskId == castOther.taskId)
			&& this.dat.equals(castOther.dat)
			&& this.datto.equals(castOther.datto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.taskId ^ (this.taskId >>> 32)));
		hash = hash * prime + this.dat.hashCode();
		hash = hash * prime + this.datto.hashCode();
		
		return hash;
	}
}