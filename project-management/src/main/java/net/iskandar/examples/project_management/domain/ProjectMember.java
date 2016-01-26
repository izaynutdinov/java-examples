package net.iskandar.examples.project_management.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT_MEMBERS")
public class ProjectMember extends BaseEntity {

	@ManyToOne(optional = false)
	@JoinColumn(name = "PROJECT_ID", nullable = false, updatable = false)
	private Project project;

	@ManyToOne(optional = false)
	@JoinColumn(name = "EMPLOYEE_ID", nullable = false, updatable = false)
	private Employee employee;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
