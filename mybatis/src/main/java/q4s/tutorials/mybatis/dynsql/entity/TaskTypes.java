package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class TaskTypes extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source field: TASK_TYPES.TYPE_ID")
	private Long typeId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source field: TASK_TYPES.CODE")
	private String code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.TITLE")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.DESCRIPTION")
	private String description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source Table: TASK_TYPES")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source Table: TASK_TYPES")
	public TaskTypes(Long typeId, String code, String title, String description) {
		this.typeId = typeId;
		this.code = code;
		this.title = title;
		this.description = description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source Table: TASK_TYPES")
	public TaskTypes() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source field: TASK_TYPES.TYPE_ID")
	public Long getTypeId() {
		return typeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source field: TASK_TYPES.TYPE_ID")
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.631+03:00", comments = "Source field: TASK_TYPES.CODE")
	public String getCode() {
		return code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.CODE")
	public void setCode(String code) {
		this.code = code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.TITLE")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.TITLE")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source field: TASK_TYPES.DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source Table: TASK_TYPES")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", typeId=").append(typeId);
		sb.append(", code=").append(code);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source Table: TASK_TYPES")
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
		TaskTypes other = (TaskTypes) that;
		return (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.632+03:00", comments = "Source Table: TASK_TYPES")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		return result;
	}
}