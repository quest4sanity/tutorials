package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class RevisionHist extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.REV_ID")
	private Long revId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.DAT")
	private Date dat;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.DATTO")
	private Date datto;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.STATE_ID")
	private Long stateId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.MANAGER_ID")
	private Long managerId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.STUFF")
	private String stuff;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source Table: REVISION_HIST")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.585+03:00", comments = "Source Table: REVISION_HIST")
	public RevisionHist(Long revId, Date dat, Date datto, Long stateId, Long managerId, String stuff) {
		this.revId = revId;
		this.dat = dat;
		this.datto = datto;
		this.stateId = stateId;
		this.managerId = managerId;
		this.stuff = stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.585+03:00", comments = "Source Table: REVISION_HIST")
	public RevisionHist() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.REV_ID")
	public Long getRevId() {
		return revId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.REV_ID")
	public void setRevId(Long revId) {
		this.revId = revId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.DAT")
	public Date getDat() {
		return dat;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.DAT")
	public void setDat(Date dat) {
		this.dat = dat;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.DATTO")
	public Date getDatto() {
		return datto;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.586+03:00", comments = "Source field: REVISION_HIST.DATTO")
	public void setDatto(Date datto) {
		this.datto = datto;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.STATE_ID")
	public Long getStateId() {
		return stateId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.STATE_ID")
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.MANAGER_ID")
	public Long getManagerId() {
		return managerId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.MANAGER_ID")
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.STUFF")
	public String getStuff() {
		return stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source field: REVISION_HIST.STUFF")
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source Table: REVISION_HIST")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", revId=").append(revId);
		sb.append(", dat=").append(dat);
		sb.append(", datto=").append(datto);
		sb.append(", stateId=").append(stateId);
		sb.append(", managerId=").append(managerId);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.587+03:00", comments = "Source Table: REVISION_HIST")
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
		RevisionHist other = (RevisionHist) that;
		return (this.getRevId() == null ? other.getRevId() == null : this.getRevId().equals(other.getRevId()))
				&& (this.getDat() == null ? other.getDat() == null : this.getDat().equals(other.getDat()))
				&& (this.getDatto() == null ? other.getDatto() == null : this.getDatto().equals(other.getDatto()))
				&& (this.getStateId() == null ? other.getStateId() == null
						: this.getStateId().equals(other.getStateId()))
				&& (this.getManagerId() == null ? other.getManagerId() == null
						: this.getManagerId().equals(other.getManagerId()))
				&& (this.getStuff() == null ? other.getStuff() == null : this.getStuff().equals(other.getStuff()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.588+03:00", comments = "Source Table: REVISION_HIST")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getRevId() == null) ? 0 : getRevId().hashCode());
		result = prime * result + ((getDat() == null) ? 0 : getDat().hashCode());
		result = prime * result + ((getDatto() == null) ? 0 : getDatto().hashCode());
		result = prime * result + ((getStateId() == null) ? 0 : getStateId().hashCode());
		result = prime * result + ((getManagerId() == null) ? 0 : getManagerId().hashCode());
		result = prime * result + ((getStuff() == null) ? 0 : getStuff().hashCode());
		return result;
	}
}