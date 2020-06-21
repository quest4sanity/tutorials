package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class TaskTags extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source field: TASK_TAGS.TASK_ID")
	private Long taskId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source field: TASK_TAGS.TAG_ID")
	private String tagId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source Table: TASK_TAGS")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source Table: TASK_TAGS")
	public TaskTags(Long taskId, String tagId) {
		this.taskId = taskId;
		this.tagId = tagId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source Table: TASK_TAGS")
	public TaskTags() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source field: TASK_TAGS.TASK_ID")
	public Long getTaskId() {
		return taskId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source field: TASK_TAGS.TASK_ID")
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source field: TASK_TAGS.TAG_ID")
	public String getTagId() {
		return tagId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source field: TASK_TAGS.TAG_ID")
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.628+03:00", comments = "Source Table: TASK_TAGS")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", taskId=").append(taskId);
		sb.append(", tagId=").append(tagId);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
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
		TaskTags other = (TaskTags) that;
		return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
				&& (this.getTagId() == null ? other.getTagId() == null : this.getTagId().equals(other.getTagId()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.629+03:00", comments = "Source Table: TASK_TAGS")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
		result = prime * result + ((getTagId() == null) ? 0 : getTagId().hashCode());
		return result;
	}
}