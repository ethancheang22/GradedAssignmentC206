import java.util.ArrayList;

public class C206_CaseStudy {

	// member 1: Ian (admin - student)
	// member 2: Maegan (admin - registration)
	// member 3: Ethan (admin - tuition_id)
	// member 4: Alvin (admin - tuition)
//a
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AddTuition> addTuitionList = new ArrayList<AddTuition>();
		
		addTuitionList.add(new AddTuition(1, "a", "a", "a", "a", "a", "a", "a"));
		
		int option = 0;
		
		while(option != 4) {
			AddTuitionmenu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == 1) {
				C206_CaseStudy.viewAllAddTuition(addTuitionList);
				
			}else if(option == 2) {
		
				int z = Helper.readInt("Enter tuition code to check if it exists > ");
				for(int i = 0; i<addTuitionList.size(); i++) {
					
					if(addTuitionList.get(i).getTuitioncode() == z) {
						System.out.println();
						System.out.println("Tuition ID already exists");
						
					}else {
						System.out.println("ID do not exists, eligible for creation");
						AddTuition cc = inputAddTuition();
						C206_CaseStudy.addAddTuition(addTuitionList, cc);
						System.out.println("Tuition Added");
						break;
					}
				}
			}else if(option == 3) {
				C206_CaseStudy.DeleteAddTuition(addTuitionList);
			
				
			}else if(option == 4) {
				System.out.println("Thank you for using tuition centre. Goodbye!");
			}else {
				System.out.println("Invalid choice");
			}
		}
		
		
		
	}
	public static void AddTuitionmenu() {
		Helper.line(40, "=");
		System.out.println("Welcome to Tuition Centre");
		Helper.line(40, "=");
		System.out.println("1. View all tuition");
		System.out.println("2. Add tuition ");
		System.out.println("3. Delete tuition");
		System.out.println("4. Quit");
		
	}	
	
	public static String retrieveAllAddTuition(ArrayList<AddTuition> addTuitionList) {
		String output = "";
		
		for(int i = 0; i<addTuitionList.size(); i++) {
			
		//output += String.format("%-84s\n", addTuitionList.get(i).toString());
			output += String.format("%-15d %-10s %-15s %-15s %-15s %-15s %-15s %-15s \n", addTuitionList.get(i).getTuitioncode(),addTuitionList.get(i).getTuitiontitle(),addTuitionList.get(i).getGroupname(),addTuitionList.get(i).getTutitionDescription(),addTuitionList.get(i).getDuration(),addTuitionList.get(i).getTeacher(),addTuitionList.get(i).getrequisite(),addTuitionList.get(i).getDateTime());
		}
		return output;
	}
	
	public static void viewAllAddTuition(ArrayList<AddTuition> addTuitionList) {
		String output = String.format("%-15s %-10s %-15s %-15s %-15s %-15s %-15s %-15s \n",
				"Tuition ","Title" ,"Groupname" ,"Description" ,"Duration" ,"Teacher" ,"Requisite" ,"Year Started");
		output += retrieveAllAddTuition(addTuitionList);
		System.out.println(output);
	}

	public static AddTuition inputAddTuition() {
		int l = Helper.readInt("Enter Tuition Code > ");
		String x = Helper.readString("Enter Tuition Title > ");
		String c = Helper.readString("Enter Groupname > ");
		String v = Helper.readString("Enter Description > ");
		String b = Helper.readString("Enter Duration > ");
		String n = Helper.readString("Enter Teacher name > ");
		String m = Helper.readString("Enter Requisite > ");
		String p = Helper.readString("Enter Year Started > ");
		
		AddTuition cc = new AddTuition(l,x,c,v,b,n,m,p);
		return cc;
	}
		// TODO Auto-generated method stub	

	public static void addAddTuition(ArrayList<AddTuition> addTuitionList, AddTuition cc) {
		addTuitionList.add(cc);
	}
	
	
	public static void deleteAddTuition(ArrayList<AddTuition> addTuitionList) {
		int l = Helper.readInt("Enter Tuition Code");
		for (int i = 0; i< addTuitionList.size(); i++ ) {
			if(addTuitionList.get(i).getTuitioncode() == l) {
				addTuitionList.remove(i);
				System.out.println("Tuition code deleted");
				
			}else {
				System.out.println("No such Tuition code to be delete");
				break;
				
			}
		}
		
	}
	public static boolean doDeleteAddTuition(ArrayList<AddTuition>addTuitionList, int x) {
		
		boolean deleted = false;
		
		for(int i = 0; i< addTuitionList.size(); i++) {
			
			int p = addTuitionList.get(i).getTuitioncode();
			
			if(x == p && addTuitionList.get(i).getTuitioncode() == p) {
				
				addTuitionList.remove(i);
				
				deleted = true;
			}
		}
		return deleted;
	}
	public static void DeleteAddTuition(ArrayList<AddTuition> addTuitionList) {
		C206_CaseStudy.viewAllAddTuition(addTuitionList);
		int x = Helper.readInt("Enter Tuition Code > ");
		Boolean deleted = doDeleteAddTuition(addTuitionList, x);
		if(deleted == false) {
			System.out.println("Invalid tuition code");
		}else {
			System.out.println("Tuition " + x + " Deleted");
		}
}
}
