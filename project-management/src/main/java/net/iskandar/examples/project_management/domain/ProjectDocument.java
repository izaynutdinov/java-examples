package net.iskandar.examples.project_management.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROJECT_DOCUMENTS")
public class ProjectDocument extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="PROJECT_ID", nullable=false, updatable=false)
	private Project project;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="DOCUMENT_ID", nullable=false, updatable=false)
	private Document document;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION", columnDefinition="text")
	private String description;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
