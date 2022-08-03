import java.util.ArrayList;

public class C206_CaseStudy {

	// Member 1: Ian (admin - student)
	// Member 2: Maegan (admin - registration)
	// Member 3: Ethan (admin - tuition_id)
	// Member 4: Alvin (admin - tuition)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AddTimetable> A2List = new ArrayList<AddTimetable>();
		A2List.add(new AddTimetable(5, 1.5, "b", "b", "b"));

		int option = 0;

		while (option != 4) {
			RegisterTuitionTimetable();
			option = Helper.readInt("Enter option > ");
			if (option == 1) {
				for (int x = 0; x < A2List.size(); x++) {
					String output = String.format("%-15s %-10s %-15s %-10s %10s \n", "Timetable ID", "Price",
							"startDateTime", "endDateTime", "Mode");
					output += String.format("%-15d %-10.2f %-15s %-10s %10s \n", A2List.get(x).getTimeableId(),
							A2List.get(x).getPrice(), A2List.get(x).getStartDateTime(), A2List.get(x).getEndDateTime(),
							A2List.get(x).getMode());

					System.out.println(output);
				}
			} else if (option == 2) {
				int x = Helper.readInt("Enter Timetable ID > ");
				double y = Helper.readDouble("Enter Price > ");
				String c = Helper.readString("Enter Start Time > ");
				String v = Helper.readString("Enter end DateTime > ");
				String n = Helper.readString("Enter Mode > ");
				A2List.add(new AddTimetable(x, y, c, v, n));
				System.out.println("Timetable added \n");

			} else if (option == 3) {
				int z = Helper.readInt("Enter ID to delete > ");
				for (int x = 0; x < A2List.size(); x++) {
					if (A2List.get(x).getTimeableId() == z) {
						A2List.remove(x);
					}
				}
			} else if (option == 4) {
				System.out.println("Goodbye");
			}
		}

	}

	public static void RegisterTuitionTimetable() {
		System.out.println("Welcome to tuition Centre");
		Helper.line(40, "=");
		System.out.println("1. View All tuition timetable");
		System.out.println("2. Add for timetable");
		System.out.println("3. Delete timetable");
		System.out.println("4. Quit");

	}
}
