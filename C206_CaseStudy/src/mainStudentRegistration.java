//Ian
import java.util.ArrayList;

public class mainStudentRegistration {
	public static void main(String[] args) {
		ArrayList<StudentRegistration> StudentRegistrationList = new ArrayList<StudentRegistration>();

		StudentRegistrationList.add(new StudentRegistration("Ian", "Male", 98765432, "Ian213@gmail.com", "13-01-2004",
				"Singapore", "English"));

		int option = 0;

		while (option != 4) {

			mainStudentRegistration.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				mainStudentRegistration.viewAllStudentRegistration(StudentRegistrationList);
			} else if (option == 2) {
				mainStudentRegistration.setHeader("ADD");

				StudentRegistration student = inputStudentRegistration();
				mainStudentRegistration.addStudentRegistration(StudentRegistrationList, student);
				System.out.print("Student added");
			} else if (option == 3) {
				String v = Helper.readString("Enter Student name to remove student >");
				for (int x = 0; x < StudentRegistrationList.size(); x++) {
					if (StudentRegistrationList.get(x).getStudentRegistration() == v) {
						StudentRegistrationList.remove(x);
						System.out.println("Student removed");
						System.out.println();
					}
				}

			} else if (option == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}
	}

	public static void menu() {
		mainStudentRegistration.setHeader("Tuition Centre");
		System.out.println("1. View all Student");
		System.out.println("2. Register/Add Student ");
		System.out.println("3. Delete Student ");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	// ================================= Option 1 View (Read)
	// =================================
	public static String retrieveAllStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList) {
		String output = "";

		for (int i = 0; i < StudentRegistrationList.size(); i++) {
			output += String.format("%-200s\n", StudentRegistrationList.get(i).toString());
		}
		return output;
	}

	public static void viewAllStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList) {
		mainStudentRegistration.setHeader("Student List");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "name", "gender", "mobile",
				"email", "dateofbirth", "countryofresidence", "interest");

		output += retrieveAllStudentRegistration(StudentRegistrationList);
		System.out.println(output);
	}

	// ================================= Option 2 Add (CRUD -
	// Create)=================================
	public static StudentRegistration inputStudentRegistration() {
		String name = Helper.readString("Enter name > ");
		String gender = Helper.readString("Enter gender > ");
		int mobile = Helper.readInt("Enter mobile > ");
		String email = Helper.readString("Enter email > ");
		String dateofbirth = Helper.readString("Enter date of birth > ");
		String countryofresidence = Helper.readString("Enter country of residence > ");
		String interest = Helper.readString("Enter interest > ");

		StudentRegistration student = new StudentRegistration(name, gender, mobile, email, dateofbirth,
				countryofresidence, interest);
		return student;
	}

	public static void addStudentRegistration(ArrayList<StudentRegistration> StudentRegistrationList,
			StudentRegistration student) {

		StudentRegistrationList.add(student);
	}
}