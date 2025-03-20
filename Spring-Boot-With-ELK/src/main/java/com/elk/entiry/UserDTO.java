package com.elk.entiry;

public class UserDTO {

	private Integer id;
	private String name;
	private String email;
	private String mobile;
	private Integer salary;
	private String job;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", salary=" + salary
				+ ", job=" + job + "]";
	}

	public UserDTO() {
	}

	public UserDTO(Integer id, String name, String email, String mobile, Integer salary, String job) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.salary = salary;
		this.job = job;
	}

}
