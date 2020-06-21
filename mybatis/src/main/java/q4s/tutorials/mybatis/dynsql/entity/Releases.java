package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Releases extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.RELEASE_ID")
	private Long releaseId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.REV_ID")
	private Long revId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.RELEASE_VER")
	private Integer releaseVer;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.RELEASE_DATE")
	private Date releaseDate;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source field: RELEASES.STUFF")
	private String stuff;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source Table: RELEASES")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.574+03:00", comments = "Source Table: RELEASES")
	public Releases(Long releaseId, Long revId, Integer releaseVer, Date releaseDate, String stuff) {
		this.releaseId = releaseId;
		this.revId = revId;
		this.releaseVer = releaseVer;
		this.releaseDate = releaseDate;
		this.stuff = stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.574+03:00", comments = "Source Table: RELEASES")
	public Releases() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.RELEASE_ID")
	public Long getReleaseId() {
		return releaseId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.RELEASE_ID")
	public void setReleaseId(Long releaseId) {
		this.releaseId = releaseId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.REV_ID")
	public Long getRevId() {
		return revId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.REV_ID")
	public void setRevId(Long revId) {
		this.revId = revId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.RELEASE_VER")
	public Integer getReleaseVer() {
		return releaseVer;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.RELEASE_VER")
	public void setReleaseVer(Integer releaseVer) {
		this.releaseVer = releaseVer;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.575+03:00", comments = "Source field: RELEASES.RELEASE_DATE")
	public Date getReleaseDate() {
		return releaseDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source field: RELEASES.RELEASE_DATE")
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source field: RELEASES.STUFF")
	public String getStuff() {
		return stuff;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source field: RELEASES.STUFF")
	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source Table: RELEASES")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", releaseId=").append(releaseId);
		sb.append(", revId=").append(revId);
		sb.append(", releaseVer=").append(releaseVer);
		sb.append(", releaseDate=").append(releaseDate);
		sb.append(", stuff=").append(stuff);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source Table: RELEASES")
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
		Releases other = (Releases) that;
		return (this.getReleaseId() == null ? other.getReleaseId() == null
				: this.getReleaseId().equals(other.getReleaseId()))
				&& (this.getRevId() == null ? other.getRevId() == null : this.getRevId().equals(other.getRevId()))
				&& (this.getReleaseVer() == null ? other.getReleaseVer() == null
						: this.getReleaseVer().equals(other.getReleaseVer()))
				&& (this.getReleaseDate() == null ? other.getReleaseDate() == null
						: this.getReleaseDate().equals(other.getReleaseDate()))
				&& (this.getStuff() == null ? other.getStuff() == null : this.getStuff().equals(other.getStuff()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.576+03:00", comments = "Source Table: RELEASES")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getReleaseId() == null) ? 0 : getReleaseId().hashCode());
		result = prime * result + ((getRevId() == null) ? 0 : getRevId().hashCode());
		result = prime * result + ((getReleaseVer() == null) ? 0 : getReleaseVer().hashCode());
		result = prime * result + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
		result = prime * result + ((getStuff() == null) ? 0 : getStuff().hashCode());
		return result;
	}
}