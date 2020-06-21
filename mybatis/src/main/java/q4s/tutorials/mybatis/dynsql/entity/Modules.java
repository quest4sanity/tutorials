package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Modules extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.547+03:00", comments = "Source field: MODULES.MODULE_ID")
	private Long moduleId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.PROJECT_ID")
	private Long projectId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.CODE")
	private String code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.TITLE")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source field: MODULES.DESCRIPTION")
	private String description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source field: MODULES.STUFF")
	private String stuff;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source Table: MODULES")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.547+03:00", comments = "Source Table: MODULES")
	public Modules(Long moduleId, Long projectId, String code, String title, String description, String stuff) {
		this.moduleId = moduleId;
		this.projectId = projectId;
		this.code = code;
		this.title = title;
		this.description = description;
		this.stuff = stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.547+03:00", comments = "Source Table: MODULES")
	public Modules() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.547+03:00", comments = "Source field: MODULES.MODULE_ID")
	public Long getModuleId() {
		return moduleId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.MODULE_ID")
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.PROJECT_ID")
	public Long getProjectId() {
		return projectId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.PROJECT_ID")
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.CODE")
	public String getCode() {
		return code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.CODE")
	public void setCode(String code) {
		this.code = code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.548+03:00", comments = "Source field: MODULES.TITLE")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source field: MODULES.TITLE")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source field: MODULES.DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source field: MODULES.DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source field: MODULES.STUFF")
	public String getStuff() {
		return stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source field: MODULES.STUFF")
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source Table: MODULES")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", moduleId=").append(moduleId);
		sb.append(", projectId=").append(projectId);
		sb.append(", code=").append(code);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.549+03:00", comments = "Source Table: MODULES")
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
		Modules other = (Modules) that;
		return (this.getModuleId() == null ? other.getModuleId() == null
				: this.getModuleId().equals(other.getModuleId()))
				&& (this.getProjectId() == null ? other.getProjectId() == null
						: this.getProjectId().equals(other.getProjectId()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()))
				&& (this.getStuff() == null ? other.getStuff() == null : this.getStuff().equals(other.getStuff()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.55+03:00", comments = "Source Table: MODULES")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getModuleId() == null) ? 0 : getModuleId().hashCode());
		result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		result = prime * result + ((getStuff() == null) ? 0 : getStuff().hashCode());
		return result;
	}
}