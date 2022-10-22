package kodlamaioDemo.entities;

public class Course {
	private int id;
	private int percent;
	private double price;
	private String courseName;
	private String courseScheduleg;
	
	
	public Course() {
		
	}
	
	public Course(int id, int percent, double price, String courseName, String courseScheduleg) {
		this.id = id;
		this.percent = percent;
		this.price = price;
		this.courseName = courseName;
		this.courseScheduleg = courseScheduleg;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseScheduleg() {
		return courseScheduleg;
	}
	public void setCourseScheduleg(String courseScheduleg) {
		this.courseScheduleg = courseScheduleg;
	}
	
	
	
	

}
