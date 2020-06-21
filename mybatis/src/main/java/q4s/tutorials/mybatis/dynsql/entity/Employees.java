package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Employees extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.494+03:00", comments = "Source field: EMPLOYEES.EMP_ID")
	private Long empId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.NICKNAME")
	private String nickname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.LNAME")
	private String lname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.FNAME")
	private String fname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.496+03:00", comments = "Source field: EMPLOYEES.MNAME")
	private String mname;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.SKILL_ID")
	private Long skillId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.EMAIL")
	private String email;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.STUFF")
	private String stuff;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.498+03:00", comments = "Source Table: EMPLOYEES")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.488+03:00", comments = "Source Table: EMPLOYEES")
	public Employees(Long empId, String nickname, String lname, String fname, String mname, Long skillId, String email,
			String stuff) {
		this.empId = empId;
		this.nickname = nickname;
		this.lname = lname;
		this.fname = fname;
		this.mname = mname;
		this.skillId = skillId;
		this.email = email;
		this.stuff = stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.494+03:00", comments = "Source Table: EMPLOYEES")
	public Employees() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.494+03:00", comments = "Source field: EMPLOYEES.EMP_ID")
	public Long getEmpId() {
		return empId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.EMP_ID")
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.NICKNAME")
	public String getNickname() {
		return nickname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.NICKNAME")
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.LNAME")
	public String getLname() {
		return lname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.LNAME")
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.495+03:00", comments = "Source field: EMPLOYEES.FNAME")
	public String getFname() {
		return fname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.496+03:00", comments = "Source field: EMPLOYEES.FNAME")
	public void setFname(String fname) {
		this.fname = fname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.496+03:00", comments = "Source field: EMPLOYEES.MNAME")
	public String getMname() {
		return mname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.496+03:00", comments = "Source field: EMPLOYEES.MNAME")
	public void setMname(String mname) {
		this.mname = mname;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.SKILL_ID")
	public Long getSkillId() {
		return skillId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.SKILL_ID")
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.EMAIL")
	public String getEmail() {
		return email;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.EMAIL")
	public void setEmail(String email) {
		this.email = email;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.STUFF")
	public String getStuff() {
		return stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.497+03:00", comments = "Source field: EMPLOYEES.STUFF")
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.498+03:00", comments = "Source Table: EMPLOYEES")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", empId=").append(empId);
		sb.append(", nickname=").append(nickname);
		sb.append(", lname=").append(lname);
		sb.append(", fname=").append(fname);
		sb.append(", mname=").append(mname);
		sb.append(", skillId=").append(skillId);
		sb.append(", email=").append(email);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.498+03:00", comments = "Source Table: EMPLOYEES")
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
		Employees other = (Employees) that;
		return (this.getEmpId() == null ? other.getEmpId() == null : this.getEmpId().equals(other.getEmpId()))
				&& (this.getNickname() == null ? other.getNickname() == null
						: this.getNickname().equals(other.getNickname()))
				&& (this.getLname() == null ? other.getLname() == null : this.getLname().equals(other.getLname()))
				&& (this.getFname() == null ? other.getFname() == null : this.getFname().equals(other.getFname()))
				&& (this.getMname() == null ? other.getMname() == null : this.getMname().equals(other.getMname()))
				&& (this.getSkillId() == null ? other.getSkillId() == null
						: this.getSkillId().equals(other.getSkillId()))
				&& (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
				&& (this.getStuff() == null ? other.getStuff() == null : this.getStuff().equals(other.getStuff()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.498+03:00", comments = "Source Table: EMPLOYEES")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());
		result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
		result = prime * result + ((getLname() == null) ? 0 : getLname().hashCode());
		result = prime * result + ((getFname() == null) ? 0 : getFname().hashCode());
		result = prime * result + ((getMname() == null) ? 0 : getMname().hashCode());
		result = prime * result + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
		result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
		result = prime * result + ((getStuff() == null) ? 0 : getStuff().hashCode());
		return result;
	}
}