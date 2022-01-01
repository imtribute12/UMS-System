package lab2;

public class UMS_CourseAddingError extends UMSException{
	private String student_type;
	private String course_type;
	
	public String getStudent_type() {
		return student_type;
	}
	public void setStudent_type(String student_type) {
		this.student_type = student_type;
	}
	public String getCourse_type() {
		return course_type;
	}
	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}
}
