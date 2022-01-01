package lab2;

public class UMS_AssignmentError extends UMSException{
	
	private String assignmentType;
	private Academic academic;
	//encapsulation
	public String getAssignmentType() {
		return assignmentType;
	}
	public void setAssignment_type(String assignment_type) {
		this.assignmentType = assignment_type;
	}
	public Academic getAcademic() {
		return academic;
	}
	public void setAcademic(Academic academic) {
		this.academic = academic;
	}
}
