package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class ProjectStates extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.STATE_ID")
	private Long stateId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.CODE")
	private String code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.TITLE")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.DESCRIPTION")
	private String description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source Table: PROJECT_STATES")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source Table: PROJECT_STATES")
	public ProjectStates(Long stateId, String code, String title, String description) {
		this.stateId = stateId;
		this.code = code;
		this.title = title;
		this.description = description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source Table: PROJECT_STATES")
	public ProjectStates() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.STATE_ID")
	public Long getStateId() {
		return stateId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.STATE_ID")
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.CODE")
	public String getCode() {
		return code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.CODE")
	public void setCode(String code) {
		this.code = code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.TITLE")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.569+03:00", comments = "Source field: PROJECT_STATES.TITLE")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source field: PROJECT_STATES.DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source field: PROJECT_STATES.DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source Table: PROJECT_STATES")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", stateId=").append(stateId);
		sb.append(", code=").append(code);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source Table: PROJECT_STATES")
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
		ProjectStates other = (ProjectStates) that;
		return (this.getStateId() == null ? other.getStateId() == null : this.getStateId().equals(other.getStateId()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.57+03:00", comments = "Source Table: PROJECT_STATES")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getStateId() == null) ? 0 : getStateId().hashCode());
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		return result;
	}
}