// Ian

import java.util.ArrayList;

public class mainStudentRegistration {
	public static void main(String[] args) {
		ArrayList<StudentRegistration> StudentRegistrationList = new ArrayList<StudentRegistration>();
		  
		  StudentRegistrationList.add(new StudentRegistration("Ian", "Male", 98765432, "Ian213@gmail.com", "13-01-2004", "Singapore", "English"));
		  
		  int option = 0;
		  
		  while (option != 4) {
			  StudentRegistrationmenu();
			  option = Helper.readInt("Enter your option > ");
			  
			  if (option == 1) {
				    // View all items
				    mainStudentRegistration.viewAllStudentRegistration(StudentRegistrationList);
				   }
				   else if (option == 2) {
					   String y = Helper.readString("Enter Student Email to check if it exists > ");
					   for(int i = 0; i<StudentRegistrationList.size(); i++) {
							
							if(StudentRegistrationList.get(i).getemail() == y) {
								System.out.println();
								System.out.println("Student Email already exists");
								
							}else {
								System.out.println("Student Email do not exists, eligible for creation");
								StudentRegistration se = inputStudentRegistration();
								mainStudentRegistration.addStudentRegistration(StudentRegistrationList, se);
								System.out.println("Student Added");
								break;
							}
					   }
				   }
					else if (option == 3) {
						mainStudentRegistration.deleteStudentRegistration(StudentRegistrationList);
				         }
				   else if (option == 4) {
				    System.out.println("Thank you for using tuition centre. Goodbye!");
				   }
				   else {
				    System.out.println("Invalid option");
				   }
			   }
		  }
	public static void StudentRegistrationmenu() {
		   System.out.println("STUDENT REGISTRATION");
		   System.out.println("1. View all Student");
		   System.out.println("2. Register/Add Student ");
		   System.out.println("3. Delete Student ");
		   System.out.println("4. Quit");
		   Helper.line(80, "-");
	}
	public static String retrieveAllStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList) {
		String output = "";
		
		for(int i = 0; i<StudentRegistrationList.size(); i++) {
			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", StudentRegistrationList.get(i).getname(), StudentRegistrationList.get(i).getgender(),
					StudentRegistrationList.get(i).getmobile(),StudentRegistrationList.get(i).getemail(), StudentRegistrationList.get(i).getdateofbirth(), StudentRegistrationList.get(i).getcountryofresidence(),
					StudentRegistrationList.get(i).getinterest());
		}
		return output;
	}
	public static void viewAllStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList) {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "name", "gender", 
			     "mobile", "email", "dateofbirth", "countryofresidence", "interest");
		output += retrieveAllStudentRegistration(StudentRegistrationList);
		System.out.println(output);
	}
	public static StudentRegistration inputStudentRegistration() {
		   String name = Helper.readString("Enter name > ");
		   String gender = Helper.readString("Enter gender > ");
		   int mobile = Helper.readInt("Enter mobile > ");
		   String email = Helper.readString("Enter email > ");
		   String dateofbirth = Helper.readString("Enter date of birth > ");
		   String countryofresidence = Helper.readString("Enter country of residence > ");
		   String interest = Helper.readString("Enter interest > ");
		   
		   StudentRegistration se = new StudentRegistration(name,gender, mobile, email, dateofbirth, countryofresidence, interest);
		   return se;
	}
	public static void addStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList, StudentRegistration se) {
		StudentRegistrationList.add(se);
	}
	public static void deleteStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList) {
		String Studentemail = Helper.readString("Enter Student Email");
		for (int i = 0; i< StudentRegistrationList.size(); i++ ) {
			if(StudentRegistrationList.get(i).getemail() == Studentemail) {
				StudentRegistrationList.remove(i);
				System.out.println("Student deleted");
				
			}else {
				System.out.println("No such Student email to be delete");
				break;
				
			}
		}
	}
public static boolean doDeleteStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList, String j) {
		
		boolean deleted = false;
		
		for(int i = 0; i< StudentRegistrationList.size(); i++) {
			
			String m = StudentRegistrationList.get(i).getemail();
			
			if(j == m && StudentRegistrationList.get(i).getemail() == m) {
				
				StudentRegistrationList.remove(i);
				
				deleted = true;
			}
		}
		return deleted;
	}
public static void DeleteStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList) {
		mainStudentRegistration.viewAllStudentRegistration(StudentRegistrationList);
		String x = Helper.readString("Enter Student Email > ");
		Boolean deleted = doDeleteStudentRegistration(StudentRegistrationList, x);
		if(deleted == false) {
			System.out.println("Invalid Student Email");
		}else {
			System.out.println("Student " + x + " Deleted");
		}
}

}



