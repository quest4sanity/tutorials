package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the REVISION_STATES database table.
 * 
 */
@Entity
@Table(name="REVISION_STATES")
@NamedQuery(name="RevisionState.findAll", query="SELECT r FROM RevisionState r")
public class RevisionState extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STATE_ID", unique=true, nullable=false)
	private long stateId;

	@Column(nullable=false, length=32)
	private String code;

	@Column(length=2000)
	private String description;

	@Column(nullable=false, length=128)
	private String title;

	//bi-directional many-to-one association to RevisionHist
	@OneToMany(mappedBy="revisionState")
	private List<RevisionHist> revisionHists;

	public RevisionState() {
	}

	public long getStateId() {
		return this.stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<RevisionHist> getRevisionHists() {
		return this.revisionHists;
	}

	public void setRevisionHists(List<RevisionHist> revisionHists) {
		this.revisionHists = revisionHists;
	}

	public RevisionHist addRevisionHist(RevisionHist revisionHist) {
		getRevisionHists().add(revisionHist);
		revisionHist.setRevisionState(this);

		return revisionHist;
	}

	public RevisionHist removeRevisionHist(RevisionHist revisionHist) {
		getRevisionHists().remove(revisionHist);
		revisionHist.setRevisionState(null);

		return revisionHist;
	}

}