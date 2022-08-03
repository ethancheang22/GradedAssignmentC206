//maegan
import java.util.ArrayList;

public class mainRegistration {

	public static void main(String[] args) {
		
		ArrayList<Registration>registrationList = new ArrayList<Registration>();
		
		registrationList.add(new Registration("001", "A1234", "layA1234@gmail.com", "Pending", "31/07/22 09:15AM", 1001));
		
		int option = 0;
		
		while (option != 4) {
			menu();
			option = Helper.readInt("option > ");
			
			if(option == 1) {
				viewReg(registrationList);
			}
			else if(option == 2) {
				Registration reg= inputReg();
				addReg(registrationList, reg);
				System.out.println("Registration addeed successfully!");
			}
			else if (option == 3) {
				deleteReg(registrationList);
			}
		}

	}
	public static void menu() {
		System.out.println("REGISTRATION FOR TUITION");
		System.out.println("1. View all registration");
	    System.out.println("2. Add registration");
	    System.out.println("3. Delete registration");
	    System.out.println("4. Quit");
	    Helper.line(80, "-");
	}
	
	public static void viewReg(ArrayList<Registration>registrationList) {
	    String output = String.format("%-20s %-20s %-20s %-20s %-30s %-30s\n", 
	    		"REGISTRATION NUMBER", "TUITION ID", "EMAIL", 
	    		"STATUS", "REGISTRATION DATE/TIME", "REGISTRATION ID");
	    for (Registration r : registrationList) {
	        output += String.format("%-20s %-20s %-20s %-20s %-30s %-30d\n", 
	        		r.getRegistrationNum(), r.getTuitionId(), r.getEmail(), r.getStatus(), 
	        		r.getDateTime(), r.getRegistrationId());
	      }
	      System.out.println(output);
	}
	
	public static void addReg(ArrayList<Registration>registrationList, Registration reg) {
		registrationList.add(reg);
	}
	
	public static Registration inputReg() {
		String registrationNum = Helper.readString("Enter registration number > ");
		String tuitionId = Helper.readString("Enter tuition timetable id > ");
	    String email = Helper.readString("Enter student email > ");
	    String status = Helper.readString("Enter status > ");
	    String dateTime = Helper.readString("Enter registration date/time > ");
	    int registrationId = Helper.readInt("Enter registration id > ");
	    
	    Registration reg = new Registration(registrationNum, tuitionId, email, status, dateTime, registrationId);
	    return reg;
	}
	
	public static void deleteReg(ArrayList<Registration>registrationList) {
		int registrationId = Helper.readInt("Enter registrationId to delete > ");
		boolean isDelete = doDeleteReg(registrationList, registrationId);
		
		if(isDelete == true) {
			System.out.println("Registration Id: " + registrationId + " is deleted successfully!");
		}
		else {
			System.out.println("Delete failed!");
		}

	}
	
	public static boolean doDeleteReg(ArrayList<Registration>registrationList, int registrationId) {
		boolean isDelete = false;
		
		for (int i = 0; i < registrationList.size(); i++) {
		      if (registrationId == registrationList.get(i).getRegistrationId()) {
		        registrationList.remove(i);
		        
		        isDelete = true;
		      }
		    }
		    return isDelete;
	}

}
