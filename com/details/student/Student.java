package com.details.student;

 class Student implements Comparable<Student>{
	private int id;
	private String name;
	private String schoolname;
	
	
	
	public Student(int id, String name, String schoolname) {
		super();
		this.id = id;
		this.name = name;
		this.schoolname = schoolname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", schoolname=" + schoolname + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		if(this.id>o.id)
		return 1;
		else
			return -1;
	}
	
	

}
