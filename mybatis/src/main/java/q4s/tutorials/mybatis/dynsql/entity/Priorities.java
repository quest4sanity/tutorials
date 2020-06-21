package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Priorities extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.554+03:00", comments = "Source field: PRIORITIES.PRIORITY_ID")
	private Long priorityId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.555+03:00", comments = "Source field: PRIORITIES.CODE")
	private String code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.555+03:00", comments = "Source field: PRIORITIES.TITLE")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source field: PRIORITIES.DESCRIPTION")
	private String description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source Table: PRIORITIES")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.554+03:00", comments = "Source Table: PRIORITIES")
	public Priorities(Long priorityId, String code, String title, String description) {
		this.priorityId = priorityId;
		this.code = code;
		this.title = title;
		this.description = description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.554+03:00", comments = "Source Table: PRIORITIES")
	public Priorities() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.555+03:00", comments = "Source field: PRIORITIES.PRIORITY_ID")
	public Long getPriorityId() {
		return priorityId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.555+03:00", comments = "Source field: PRIORITIES.PRIORITY_ID")
	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.555+03:00", comments = "Source field: PRIORITIES.CODE")
	public String getCode() {
		return code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.555+03:00", comments = "Source field: PRIORITIES.CODE")
	public void setCode(String code) {
		this.code = code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.555+03:00", comments = "Source field: PRIORITIES.TITLE")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source field: PRIORITIES.TITLE")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source field: PRIORITIES.DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source field: PRIORITIES.DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source Table: PRIORITIES")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", priorityId=").append(priorityId);
		sb.append(", code=").append(code);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source Table: PRIORITIES")
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
		Priorities other = (Priorities) that;
		return (this.getPriorityId() == null ? other.getPriorityId() == null
				: this.getPriorityId().equals(other.getPriorityId()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.556+03:00", comments = "Source Table: PRIORITIES")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getPriorityId() == null) ? 0 : getPriorityId().hashCode());
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		return result;
	}
}