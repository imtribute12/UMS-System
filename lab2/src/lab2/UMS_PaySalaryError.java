package lab2;

public class UMS_PaySalaryError extends UMSException {
	
	private Academic academic;
	private String[] causes;

	public Academic getAcademic() {
		return academic;
	}

	public void setAcademic(Academic academic) {
		this.academic = academic;
	}

	public String[] getCauses() {
		return causes;
	}

	public void setCauses(String[] causes) {
		this.causes = causes;
	}
}
