package q4s.tutorials.mybatis.dynsql.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import q4s.tutorials.mybatis.BaseEntity;

public class Tags extends BaseEntity implements Serializable {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source field: TAGS.TAG_ID")
	private String tagId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source Table: TAGS")
	private static final long serialVersionUID = 1L;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source Table: TAGS")
	public Tags(String tagId) {
		this.tagId = tagId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source Table: TAGS")
	public Tags() {
		super();
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source field: TAGS.TAG_ID")
	public String getTagId() {
		return tagId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source field: TAGS.TAG_ID")
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source Table: TAGS")
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", tagId=").append(tagId);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source Table: TAGS")
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
		Tags other = (Tags) that;
		return (this.getTagId() == null ? other.getTagId() == null : this.getTagId().equals(other.getTagId()));
	}

	@Override
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-23T13:10:31.603+03:00", comments = "Source Table: TAGS")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getTagId() == null) ? 0 : getTagId().hashCode());
		return result;
	}
}