package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Revisions extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.58+03:00", comments = "Source field: REVISIONS.REV_ID")
	private Long revId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.58+03:00", comments = "Source field: REVISIONS.PROJECT_ID")
	private Long projectId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.MINOR_VER")
	private Integer minorVer;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.CODE")
	private String code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.STUFF")
	private String stuff;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source Table: REVISIONS")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.58+03:00", comments = "Source Table: REVISIONS")
	public Revisions(Long revId, Long projectId, Integer minorVer, String code, String stuff) {
		this.revId = revId;
		this.projectId = projectId;
		this.minorVer = minorVer;
		this.code = code;
		this.stuff = stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.58+03:00", comments = "Source Table: REVISIONS")
	public Revisions() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.58+03:00", comments = "Source field: REVISIONS.REV_ID")
	public Long getRevId() {
		return revId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.58+03:00", comments = "Source field: REVISIONS.REV_ID")
	public void setRevId(Long revId) {
		this.revId = revId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.PROJECT_ID")
	public Long getProjectId() {
		return projectId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.PROJECT_ID")
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.MINOR_VER")
	public Integer getMinorVer() {
		return minorVer;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.MINOR_VER")
	public void setMinorVer(Integer minorVer) {
		this.minorVer = minorVer;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.CODE")
	public String getCode() {
		return code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.CODE")
	public void setCode(String code) {
		this.code = code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.STUFF")
	public String getStuff() {
		return stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source field: REVISIONS.STUFF")
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source Table: REVISIONS")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", revId=").append(revId);
		sb.append(", projectId=").append(projectId);
		sb.append(", minorVer=").append(minorVer);
		sb.append(", code=").append(code);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.581+03:00", comments = "Source Table: REVISIONS")
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
		Revisions other = (Revisions) that;
		return (this.getRevId() == null ? other.getRevId() == null : this.getRevId().equals(other.getRevId()))
				&& (this.getProjectId() == null ? other.getProjectId() == null
						: this.getProjectId().equals(other.getProjectId()))
				&& (this.getMinorVer() == null ? other.getMinorVer() == null
						: this.getMinorVer().equals(other.getMinorVer()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getStuff() == null ? other.getStuff() == null : this.getStuff().equals(other.getStuff()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.582+03:00", comments = "Source Table: REVISIONS")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getRevId() == null) ? 0 : getRevId().hashCode());
		result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
		result = prime * result + ((getMinorVer() == null) ? 0 : getMinorVer().hashCode());
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getStuff() == null) ? 0 : getStuff().hashCode());
		return result;
	}
}