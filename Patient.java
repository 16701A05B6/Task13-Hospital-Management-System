package model;

public class Patient {
  private int id;
  private String name;
  private int age;
  private String mobileno;
  
public Patient(int id, String name, int age, String mobileno) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.mobileno = mobileno;
}

public Patient() {
	// TODO Auto-generated constructor stub
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
}

