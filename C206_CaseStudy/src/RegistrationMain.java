//done Maegan

import java.util.ArrayList;

public class RegistrationMain {

  public static void main(String[] args) {
    
    ArrayList<Addregistration>addRegistrationList = new ArrayList<Addregistration>();
    
    addRegistrationList.add(new Addregistration(001, "A1234", "layA1234@gmail.com", "Pending", "31/07/22 09:15AM", 1001));
    
    int option = 0;
    
    while (option != 4) {
    	AddRegistrationmenu();
      option = Helper.readInt("option > ");
      
      if(option == 1) {
    	  RegistrationMain.viewAllAddRegistration(addRegistrationList);
      }
      else if(option == 2) {
  		
			int z = Helper.readInt("Enter registration ID to check if it exists > ");
			for(int i = 0; i<addRegistrationList.size(); i++) {
				
				if(addRegistrationList.get(i).getRegistrationNum() == z) {
					System.out.println();
					System.out.println("Registration number already exists");
					
				}else {
					System.out.println("ID do not exists, eligible for creation");
					Addregistration ar = inputAddRegistration();
					RegistrationMain.addAddRegistration(addRegistrationList, ar);
					System.out.println("Registraion Added");
					break;
				}
			}
		}else if(option == 3) {
			RegistrationMain.deleteAddRegistration(addRegistrationList);
		
			
		}else if(option == 4) {
			System.out.println("Thank you for using tuition centre. Goodbye!");
		}else {
			System.out.println("Invalid choice");
		}
    }

  }
  public static void AddRegistrationmenu() {
    System.out.println("REGISTRATION ");
    System.out.println("1. View all registration");
      System.out.println("2. Add registration");
      System.out.println("3. Delete registration");
      System.out.println("4. Quit");
      Helper.line(80, "-");
  }
  
  public static String retrieveAllAddRegistration(ArrayList<Addregistration> addRegistrationList) {
		String output = "";
		
		for(int i = 0; i<addRegistrationList.size(); i++) {
			
			output += String.format("%-15s %-10s %-15s %-15s %-15s %-15d \n", 
					addRegistrationList.get(i).getRegistrationNum(),
					addRegistrationList.get(i).getTuitionId(),
					addRegistrationList.get(i).getEmail(),addRegistrationList.get(i).getStatus(),
					addRegistrationList.get(i).getDateTime(),addRegistrationList.get(i).getRegistrationId());
		}
		return output;
	}
 
	
	public static void viewAllAddRegistration(ArrayList<Addregistration> addRegistrationList) {
		String output = String.format("%-15s %-10s %-15s %-15s %-15s %-15d \n",
				"Registration Number","Tuition Id" ,"Email" ,"Status" ,"DateTime" ,"Regtration Id");
		output += retrieveAllAddRegistration(addRegistrationList);
		System.out.println(output);
	}

	public static Addregistration inputAddRegistration() {
		int num = Helper.readInt("Enter Registration Number> ");
		String idT = Helper.readString("Enter Tution ID > ");
		String email = Helper.readString("Enter Email > ");
		String status = Helper.readString("Enter Status > ");
		String dateTime = Helper.readString("Enter DateTime > ");
		int idR = Helper.readInt("Enter Registration ID > ");

		
		Addregistration ar = new Addregistration(num, idT, email, status, dateTime, idR);
		return ar;
	}


	public static void addAddRegistration(ArrayList<Addregistration> addRegistrationList, Addregistration ar) {
		addRegistrationList.add(ar);
	}
	
	
	public static void deleteAddRegistration(ArrayList<Addregistration> addRegistrationList) {
		String num = Helper.readString("Enter Registration Number");
		for (int i = 0; i< addRegistrationList.size(); i++ ) {
			if(addRegistrationList.get(i).getRegistrationNum() == 1) {
				addRegistrationList.remove(i);
				System.out.println("Registration number deleted");
				
			}else {
				System.out.println("No such Registration to be delete");
				break;
				
			}
		}
		
	}
	public static boolean doDeleteAddRegistation(ArrayList<Addregistration> addRegistrationList, int x) {
		
		boolean deleted = false;
		
		for(int i = 0; i< addRegistrationList.size(); i++) {
			
			int m = addRegistrationList.get(i).getRegistrationId();
			
			if(x == m && addRegistrationList.get(i).getRegistrationId() == m) {
				
				addRegistrationList.remove(i);
				
				deleted = true;
			}
		}
		return deleted;
	}
	public static void DeleteAddRegistration(ArrayList<Addregistration> addRegistrationList) {
		RegistrationMain.viewAllAddRegistration(addRegistrationList);
		int x = Helper.readInt("Enter Tuition Code > ");
		Boolean deleted = doDeleteAddRegistation(addRegistrationList, x);
		if(deleted == false) {
			System.out.println("Invalid Registration Number");
		}else {
			System.out.println("Registration " + x + " Deleted");
		}
}

}