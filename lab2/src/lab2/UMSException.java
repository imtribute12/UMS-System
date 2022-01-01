package lab2;

import java.lang.Exception;

public class UMSException extends Exception{
	private AdministrativeStaff reponsible;

	public AdministrativeStaff getReponsible() {
		return reponsible;
	}

	public void setReponsible(AdministrativeStaff reponsible) {
		this.reponsible = reponsible;
	}
}
