public class StudentRegistration {
  
  private String name;
  private String gender;
  private String mobile;
  private String email;
  private String dateofbirth;
  private String countryofresidence;
  private String interest;
  
  public StudentRegistration(String name, 
      String gender, String mobile, 
      String email, String dateofbirth,
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
  
  public String getmobile() {
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

}


