public class Registration {

	private String registrationNum;
	private String tuitionId;
	private String email;
	private String status;
	private String dateTime;
	private int registrationId;

	public Registration(String registrationNum, String tuitionId, String email, String status, String dateTime,
			int registrationId) {

		this.registrationNum = registrationNum;
		this.tuitionId = tuitionId;
		this.email = email;
		this.status = status;
		this.dateTime = dateTime;
		this.registrationId = registrationId;
	}

	public String getRegistrationNum() {
		return registrationNum;
	}

	public String getTuitionId() {
		return tuitionId;
	}

	public String getEmail() {
		return email;
	}

	public String getStatus() {
		return status;
	}

	public String getDateTime() {
		return dateTime;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRestrationId(int registrationId) {
		this.registrationId = registrationId;
	}

}