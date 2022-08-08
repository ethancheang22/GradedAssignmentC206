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
    super();
    this.name = name;
    this.gender = gender;
    this.mobile = mobile;
    this.email = email;
    this.dateofbirth = dateofbirth;
    this.countryofresidence = countryofresidence;
    this.interest = interest;
  }
  public String getname() {
   return name;
  }
  public void setname(String name) {
  this.name = name;
}
  
  public String getgender() {
    return gender;
  }
  public void setgender(String gender) {
  this.gender = gender;
}
  
  public int getmobile() {
    return mobile;
  }
  public void setmobile(int mobile) {
  this.mobile = mobile;
}
  public String getemail() {
   return email;
}
  public void setemail(String email) {
  this.email = email;
  }
  public String getdateofbirth() {
    return dateofbirth;
  }
  public void setdateofbirth(String dateofbirth) {
  this.dateofbirth = dateofbirth;
}
  
  public String getcountryofresidence() {
    return countryofresidence;
  }
  public void setcountryofresidence(String countryofresidence) {
  this.countryofresidence = countryofresidence;
}
  public String getinterest() {
   return interest;
  }
  public void setinterest(String interest) {
  this.interest = interest;
}

}

