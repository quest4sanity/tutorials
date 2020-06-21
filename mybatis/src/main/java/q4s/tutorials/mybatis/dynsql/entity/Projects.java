package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Projects extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source field: PROJECTS.PROJECT_ID")
	private Long projectId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source field: PROJECTS.CODE")
	private String code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source field: PROJECTS.MAJOR_VER")
	private Integer majorVer;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.TITLE")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.DESCRIPTION")
	private String description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.STATE_ID")
	private Long stateId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.STUFF")
	private String stuff;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.564+03:00", comments = "Source Table: PROJECTS")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source Table: PROJECTS")
	public Projects(Long projectId, String code, Integer majorVer, String title, String description, Long stateId,
			String stuff) {
		this.projectId = projectId;
		this.code = code;
		this.majorVer = majorVer;
		this.title = title;
		this.description = description;
		this.stateId = stateId;
		this.stuff = stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source Table: PROJECTS")
	public Projects() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source field: PROJECTS.PROJECT_ID")
	public Long getProjectId() {
		return projectId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source field: PROJECTS.PROJECT_ID")
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source field: PROJECTS.CODE")
	public String getCode() {
		return code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source field: PROJECTS.CODE")
	public void setCode(String code) {
		this.code = code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.562+03:00", comments = "Source field: PROJECTS.MAJOR_VER")
	public Integer getMajorVer() {
		return majorVer;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.MAJOR_VER")
	public void setMajorVer(Integer majorVer) {
		this.majorVer = majorVer;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.TITLE")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.TITLE")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.STATE_ID")
	public Long getStateId() {
		return stateId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.STATE_ID")
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.563+03:00", comments = "Source field: PROJECTS.STUFF")
	public String getStuff() {
		return stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.564+03:00", comments = "Source field: PROJECTS.STUFF")
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.564+03:00", comments = "Source Table: PROJECTS")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", projectId=").append(projectId);
		sb.append(", code=").append(code);
		sb.append(", majorVer=").append(majorVer);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", stateId=").append(stateId);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.564+03:00", comments = "Source Table: PROJECTS")
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
		Projects other = (Projects) that;
		return (this.getProjectId() == null ? other.getProjectId() == null
				: this.getProjectId().equals(other.getProjectId()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getMajorVer() == null ? other.getMajorVer() == null
						: this.getMajorVer().equals(other.getMajorVer()))
				&& (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()))
				&& (this.getStateId() == null ? other.getStateId() == null
						: this.getStateId().equals(other.getStateId()))
				&& (this.getStuff() == null ? other.getStuff() == null : this.getStuff().equals(other.getStuff()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.564+03:00", comments = "Source Table: PROJECTS")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getMajorVer() == null) ? 0 : getMajorVer().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		result = prime * result + ((getStateId() == null) ? 0 : getStateId().hashCode());
		result = prime * result + ((getStuff() == null) ? 0 : getStuff().hashCode());
		return result;
	}
}