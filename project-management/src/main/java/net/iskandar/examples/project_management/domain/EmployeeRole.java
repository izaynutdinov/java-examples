package net.iskandar.examples.project_management.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_ROLES")
public class EmployeeRole extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="EMPLOYEE_ID", nullable=false, updatable=false)
	private Employee employee;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="ROLE_ID", nullable=false, updatable=false)
	private Role role;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}
