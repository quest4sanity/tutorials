package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TAGS database table.
 * 
 */
@Entity
@Table(name="TAGS")
@NamedQuery(name="Tag.findAll", query="SELECT t FROM Tag t")
public class Tag extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TAG_ID", unique=true, nullable=false, length=32)
	private String tagId;

	//bi-directional many-to-many association to Task
	@ManyToMany(mappedBy="tags")
	private List<Task> tasks;

	public Tag() {
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}