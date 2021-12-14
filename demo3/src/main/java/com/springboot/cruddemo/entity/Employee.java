package com.springboot.cruddemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="department_code")
	private int departmentCode;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="employe_status")
	private String employeStatus;
	

    @ManyToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH},
            optional = false)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    public Employee() {

    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getEmployeStatus() {
		return employeStatus;
	}

	public void setEmployeStatus(String employeStatus) {
		this.employeStatus = employeStatus;
	}

	public Location getDepartment() {
		return location;
	}

	public void setDepartment(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", departmentCode=" + departmentCode + ", departmentName=" + departmentName
				+ ", employeStatus=" + employeStatus + ", department=" + location + "]";
	}

   
}
