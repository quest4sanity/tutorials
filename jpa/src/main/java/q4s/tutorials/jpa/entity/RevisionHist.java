package q4s.tutorials.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REVISION_HIST database table.
 * 
 */
@Entity
@Table(name="REVISION_HIST")
@NamedQuery(name="RevisionHist.findAll", query="SELECT r FROM RevisionHist r")
public class RevisionHist extends q4s.tutorials.jpa.BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RevisionHistPK id;

	private String stuff;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="MANAGER_ID", nullable=false)
	private Employee employee;

	//bi-directional many-to-one association to Revision
	@ManyToOne
	@JoinColumn(name="REV_ID", nullable=false, insertable=false, updatable=false)
	private Revision revision;

	//bi-directional many-to-one association to RevisionState
	@ManyToOne
	@JoinColumn(name="STATE_ID", nullable=false)
	private RevisionState revisionState;

	public RevisionHist() {
	}

	public RevisionHistPK getId() {
		return this.id;
	}

	public void setId(RevisionHistPK id) {
		this.id = id;
	}

	public String getStuff() {
		return this.stuff;
	}

	public void setStuff(String stuff) {
		this.stuff = stuff;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Revision getRevision() {
		return this.revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

	public RevisionState getRevisionState() {
		return this.revisionState;
	}

	public void setRevisionState(RevisionState revisionState) {
		this.revisionState = revisionState;
	}

}