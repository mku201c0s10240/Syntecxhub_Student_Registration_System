package student_registeration_system;

public class Student_Register {
	
	private int id,age;
	private String name,email,course;
	
	public Student_Register(int id, String name, String email, int age, String course) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.age=age;
		this.course=course;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getAge() {
		return age;
	}
	public String getCourse() {
		return course;
	}

}
