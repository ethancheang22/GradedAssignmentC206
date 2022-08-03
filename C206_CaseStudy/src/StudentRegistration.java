//Ian
public class StudentRegistration {

	private String name;
	private String gender;
	private int mobile;
	private String email;
	private String dateofbirth;
	private String countryofresidence;
	private String interest;

	public StudentRegistration(String name, String gender, int mobile, String email, String dateofbirth,
			String countryofresidence, String interest) {

		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.setEmail(email);
		this.dateofbirth = dateofbirth;
		this.countryofresidence = countryofresidence;
		this.interest = interest;
	}

	public String getname() {
		return name;
	}

	public String getgender() {
		return gender;
	}

	public int getmobile() {
		return mobile;
	}

	public String getdateofbirth() {
		return dateofbirth;
	}

	public String getcountryofresidence() {
		return countryofresidence;
	}

	public String getinterest() {
		return interest;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		String output = super.toString();
		output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", name, gender, mobile, email, dateofbirth,
				countryofresidence, interest);
		return output;
	}

	public String getStudentRegistration() {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", name, gender, mobile, email,
				dateofbirth, countryofresidence, interest);
		// TODO Auto-generated method stub
		return output;
	}
}
