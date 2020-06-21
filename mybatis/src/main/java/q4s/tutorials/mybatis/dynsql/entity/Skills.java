package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Skills extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source field: SKILLS.SKILL_ID")
	private Long skillId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source field: SKILLS.CODE")
	private String code;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.598+03:00", comments = "Source field: SKILLS.TITLE")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.598+03:00", comments = "Source field: SKILLS.DESCRIPTION")
	private String description;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.598+03:00", comments = "Source Table: SKILLS")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source Table: SKILLS")
	public Skills(Long skillId, String code, String title, String description) {
		this.skillId = skillId;
		this.code = code;
		this.title = title;
		this.description = description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source Table: SKILLS")
	public Skills() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source field: SKILLS.SKILL_ID")
	public Long getSkillId() {
		return skillId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source field: SKILLS.SKILL_ID")
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source field: SKILLS.CODE")
	public String getCode() {
		return code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.597+03:00", comments = "Source field: SKILLS.CODE")
	public void setCode(String code) {
		this.code = code;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.598+03:00", comments = "Source field: SKILLS.TITLE")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.598+03:00", comments = "Source field: SKILLS.TITLE")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.598+03:00", comments = "Source field: SKILLS.DESCRIPTION")
	public String getDescription() {
		return description;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.598+03:00", comments = "Source field: SKILLS.DESCRIPTION")
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.598+03:00", comments = "Source Table: SKILLS")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", skillId=").append(skillId);
		sb.append(", code=").append(code);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source Table: SKILLS")
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
		Skills other = (Skills) that;
		return (this.getSkillId() == null ? other.getSkillId() == null : this.getSkillId().equals(other.getSkillId()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.599+03:00", comments = "Source Table: SKILLS")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		return result;
	}
}