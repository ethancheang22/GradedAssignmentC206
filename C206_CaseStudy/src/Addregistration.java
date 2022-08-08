//done Maegan 
public class Addregistration {

	private int registrationNum;
	private String tuitionId;
	private String email;
	private String status;
	private String dateTime;
	private int registrationId;

	public Addregistration(int registrationNum, String tuitionId, String email, String status, String dateTime,
			int registrationId) {
		super();
		this.registrationNum = registrationNum;
		this.tuitionId = tuitionId;
		this.email = email;
		this.status = status;
		this.dateTime = dateTime;
		this.registrationId = registrationId;
	}

	public int getRegistrationNum() {
		return registrationNum;
	}
	
	public void setRegistrationNum(int registrationNum) {
		this.registrationNum = registrationNum;
	}

	public String getTuitionId() {
		return tuitionId;
	}
	
	public void setTuituinId(String tuitionId) {
		this.tuitionId = tuitionId;
	}

	public String getEmail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}
	
	public void setstatus(String status) {
		this.status = status;
	}

	public String getDateTime() {
		return dateTime;
	}
	
	public void setdateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRestrationId(int registrationId) {
		this.registrationId = registrationId;
	}

}
