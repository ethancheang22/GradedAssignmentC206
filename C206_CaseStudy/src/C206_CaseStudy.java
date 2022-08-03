import java.util.ArrayList;

public class C206_CaseStudy {

	// member 1: Ian (admin - student)
	// member 2: Maegan (admin - registration)
	// member 3: Ethan (admin - tuition_id)
	// member 4: Alvin (admin - tuition)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AddTuition> A1List = new ArrayList<AddTuition>();
		A1List.add(new AddTuition(1, "a", "a", "a", "a", "a", "a", "a"));
		int option = 0;
	while(option != 4) {
		AddTuition();
		option = Helper.readInt("Enter option > ");

		if (option == 1) {
			for (int i = 0; i < A1List.size(); i++) {
				String output = String.format("%-15s %-10s %-15s %-15s %-15s %-15s %-15s %-15s \n",
						"Tuition ","Title" ,"Groupname" ,"Description" ,"Duration" ,"Teacher" ,"Requisite" ,"Year Started"
						);
				output += String.format("%-15d %-10s %-15s %-15s %-15s %-15s %-15s %-15s \n", A1List.get(i).getTuitioncode(),A1List.get(i).getTuitiontitle(),A1List.get(i).getGroupname(),A1List.get(i).getTutitionDescription(),A1List.get(i).getDuration(),A1List.get(i).getTeacher(),A1List.get(i).getrequisite(),A1List.get(i).getDateTime());

				System.out.println(output);
			}

		}else if(option == 2) {
			int z = Helper.readInt("Enter tuition ID > ");
			String x = Helper.readString("Enter Tuition Title > ");
			String c = Helper.readString("Enter Groupname > ");
			String v = Helper.readString("Enter Description > ");
			String b = Helper.readString("Enter Duration > ");
			String n = Helper.readString("Enter Teacher name > ");
			String m = Helper.readString("Enter Requisite > ");
			String p = Helper.readString("Enter Year Started > ");
			A1List.add(new AddTuition(z,x,c,v,b,n,m,p));
			System.out.println("Tuition Added");
			System.out.println();
			
			
		}else if(option == 3) {
			int v = Helper.readInt("Enter tuition ID to remove tuition > ");
			for(int x = 0; x <A1List.size(); x++) {
				if(A1List.get(x).getTuitioncode() == v) {
					A1List.remove(x);
					System.out.println("Student removed");
					System.out.println();
					
				
					
				}
			}
		}
	}
	}

	public static void AddTuition() {
		System.out.println("Welcome to Tuition Centre");
		Helper.line(40, "=");
		System.out.println("1. View all tuition");
		System.out.println("2. Add tuition ");
		System.out.println("3. Delete tuition");
		System.out.println("4. Quit");
		
	}

	public static void menu() {
		System.out.println("1. Register/Add student");
		System.out.println("2. Register for tuition");
		System.out.println("3. Add tuition timetable ");
		System.out.println("4. Add tuition");
		System.out.println("5. Quit");
	}
}
