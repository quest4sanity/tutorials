package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Tasks extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.TASK_ID")
	private Long taskId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.REV_ID")
	private Long revId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.MODULE_ID")
	private Long moduleId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.DAT")
	private Date dat;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.TITLE")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.DESCRIPTION")
	private String description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.AUTHOR_ID")
	private Long authorId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.PARENT_ID")
	private Long parentId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.TYPE_ID")
	private Long typeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.PRIORITY_ID")
	private Long priorityId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.DAT_PLAN")
	private Date datPlan;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.DAT_FACT")
	private Date datFact;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.RELEASE_ID")
	private Long releaseId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source field: TASKS.STUFF")
	private String stuff;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source Table: TASKS")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source Table: TASKS")
	public Tasks(Long taskId, Long revId, Long moduleId, Date dat, String title, String description, Long authorId,
			Long parentId, Long typeId, Long priorityId, Date datPlan, Date datFact, Long releaseId, String stuff) {
		this.taskId = taskId;
		this.revId = revId;
		this.moduleId = moduleId;
		this.dat = dat;
		this.title = title;
		this.description = description;
		this.authorId = authorId;
		this.parentId = parentId;
		this.typeId = typeId;
		this.priorityId = priorityId;
		this.datPlan = datPlan;
		this.datFact = datFact;
		this.releaseId = releaseId;
		this.stuff = stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source Table: TASKS")
	public Tasks() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.TASK_ID")
	public Long getTaskId() {
		return taskId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.TASK_ID")
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.REV_ID")
	public Long getRevId() {
		return revId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.REV_ID")
	public void setRevId(Long revId) {
		this.revId = revId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.MODULE_ID")
	public Long getModuleId() {
		return moduleId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.607+03:00", comments = "Source field: TASKS.MODULE_ID")
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.DAT")
	public Date getDat() {
		return dat;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.DAT")
	public void setDat(Date dat) {
		this.dat = dat;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.TITLE")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.TITLE")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.AUTHOR_ID")
	public Long getAuthorId() {
		return authorId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.AUTHOR_ID")
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.PARENT_ID")
	public Long getParentId() {
		return parentId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.608+03:00", comments = "Source field: TASKS.PARENT_ID")
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.TYPE_ID")
	public Long getTypeId() {
		return typeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.TYPE_ID")
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.PRIORITY_ID")
	public Long getPriorityId() {
		return priorityId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.PRIORITY_ID")
	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.DAT_PLAN")
	public Date getDatPlan() {
		return datPlan;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.DAT_PLAN")
	public void setDatPlan(Date datPlan) {
		this.datPlan = datPlan;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.DAT_FACT")
	public Date getDatFact() {
		return datFact;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.DAT_FACT")
	public void setDatFact(Date datFact) {
		this.datFact = datFact;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.609+03:00", comments = "Source field: TASKS.RELEASE_ID")
	public Long getReleaseId() {
		return releaseId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source field: TASKS.RELEASE_ID")
	public void setReleaseId(Long releaseId) {
		this.releaseId = releaseId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source field: TASKS.STUFF")
	public String getStuff() {
		return stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source field: TASKS.STUFF")
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source Table: TASKS")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", taskId=").append(taskId);
		sb.append(", revId=").append(revId);
		sb.append(", moduleId=").append(moduleId);
		sb.append(", dat=").append(dat);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", authorId=").append(authorId);
		sb.append(", parentId=").append(parentId);
		sb.append(", typeId=").append(typeId);
		sb.append(", priorityId=").append(priorityId);
		sb.append(", datPlan=").append(datPlan);
		sb.append(", datFact=").append(datFact);
		sb.append(", releaseId=").append(releaseId);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source Table: TASKS")
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
		Tasks other = (Tasks) that;
		return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
				&& (this.getRevId() == null ? other.getRevId() == null : this.getRevId().equals(other.getRevId()))
				&& (this.getModuleId() == null ? other.getModuleId() == null
						: this.getModuleId().equals(other.getModuleId()))
				&& (this.getDat() == null ? other.getDat() == null : this.getDat().equals(other.getDat()))
				&& (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()))
				&& (this.getAuthorId() == null ? other.getAuthorId() == null
						: this.getAuthorId().equals(other.getAuthorId()))
				&& (this.getParentId() == null ? other.getParentId() == null
						: this.getParentId().equals(other.getParentId()))
				&& (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
				&& (this.getPriorityId() == null ? other.getPriorityId() == null
						: this.getPriorityId().equals(other.getPriorityId()))
				&& (this.getDatPlan() == null ? other.getDatPlan() == null
						: this.getDatPlan().equals(other.getDatPlan()))
				&& (this.getDatFact() == null ? other.getDatFact() == null
						: this.getDatFact().equals(other.getDatFact()))
				&& (this.getReleaseId() == null ? other.getReleaseId() == null
						: this.getReleaseId().equals(other.getReleaseId()))
				&& (this.getStuff() == null ? other.getStuff() == null : this.getStuff().equals(other.getStuff()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.61+03:00", comments = "Source Table: TASKS")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
		result = prime * result + ((getRevId() == null) ? 0 : getRevId().hashCode());
		result = prime * result + ((getModuleId() == null) ? 0 : getModuleId().hashCode());
		result = prime * result + ((getDat() == null) ? 0 : getDat().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		result = prime * result + ((getAuthorId() == null) ? 0 : getAuthorId().hashCode());
		result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
		result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
		result = prime * result + ((getPriorityId() == null) ? 0 : getPriorityId().hashCode());
		result = prime * result + ((getDatPlan() == null) ? 0 : getDatPlan().hashCode());
		result = prime * result + ((getDatFact() == null) ? 0 : getDatFact().hashCode());
		result = prime * result + ((getReleaseId() == null) ? 0 : getReleaseId().hashCode());
		result = prime * result + ((getStuff() == null) ? 0 : getStuff().hashCode());
		return result;
	}
}