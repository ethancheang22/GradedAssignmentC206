import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	//maegan
	private Addregistration addReg;
	//alvin
	private AddTuition addTui;
	//Ian
	private StudentRegistration addStu;
	
	//maegan
	private ArrayList<Addregistration>registrationList;
	//alvin
	private ArrayList<AddTuition> tuitionList;
	//Ian
	private ArrayList<StudentRegistration> studentList;
	

	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		
		//maegan
		addReg = new Addregistration(001, "A1234", "layA1234@gmail.com", "Pending", "31/07/22 09:15AM", 1001);
		//alvin
		addTui = new AddTuition(1, "a", "a", "a", "a", "a", "a", "a");
		//Ian
		addStu = new StudentRegistration("Ian", "Male", 98765432, "Ian213@gmail.com", "02/11/2001", "Singapore", "English");
		
		//maegan
		registrationList = new ArrayList<Addregistration>();
		//alvin
		tuitionList = new ArrayList<AddTuition>();
		//Ian
		studentList = new ArrayList<StudentRegistration>();
		
	
	}
	//Ian
	public void testStudentRegistration() {
		assertNotNull("Check if there is valid Registration arraylist to add to", tuitionList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		mainStudentRegistration.addStudentRegistration(studentList, addStu);
		assertEquals("Check that arraylist size is 1", 1, studentList.size());
		assertSame("Check that StudentRegistration is added", addStu, studentList.get(0));

//		// Add another item. test The size of the list is 2? -normal
//		// The item just added is as same as the second item of the list
		mainStudentRegistration.addStudentRegistration(studentList, addStu);
		assertEquals("Check that arraylist size is 2", 2, studentList.size());
		assertSame("Check that StudentRegistration is added", addStu, studentList.get(1));
	}
		public void testretrieveAllAddStudentRegistration() {
			// Test if Item list is not null but empty - boundary
			assertNotNull("Test if there is valid StudentRegistration arraylist to retrieve registration from", studentList);
		
			//test if the list of AddTuition retrieved from the SourceCentre is empty - boundary
			String allStudentRegistration= mainStudentRegistration.retrieveAllStudentRegistration(studentList);
			String testOutput = "";
			assertEquals("Test that the retrieved Chromebooklist is empty?", testOutput, allStudentRegistration);
		
			//Given an empty list, after adding 2 item, test if the size of the list is 1 - normal
			mainStudentRegistration.addStudentRegistration(studentList, addStu);
			assertEquals("Test that the StudentRegistration arraylist size is 1", 1 , registrationList.size());
		
			//test if the expected output string same as the list of tuitionList retrieved from the SourceCentre
			allStudentRegistration = mainStudentRegistration.retrieveAllStudentRegistration(studentList);
			testOutput = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Ian", "Male", 98765432, "Ian213@gmail.com", "02/11/2001", "Singapore", "English");
			assertEquals("Test that ViewAllAddStudentRegistration",testOutput,allStudentRegistration);

	}
		@Test
		public void testdoDeleteStudentRegistration() {
		 //Item list is not null, so that can delete a item - boundary
		assertNotNull("Test if there is valid tuitionList arraylist to be deleted to",studentList);
		
		
		// Given a list with one item, after deleting, the size of the list is 0 - normal
		mainStudentRegistration.doDeleteStudentRegistration(studentList, null);
		assertEquals("Check that arraylist size is 0", 0, studentList.size());
		
		
	}
	
	//Maegan
	@Test
	public void testAddregistration() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Registration arraylist to add to", registrationList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		RegistrationMain.addAddRegistration(registrationList, addReg);
		assertEquals("Check that arraylist size is 1", 1, registrationList.size());
		assertSame("Check that Addregistration is added", addReg, registrationList.get(0));

//		// Add another item. test The size of the list is 2? -normal
//		// The item just added is as same as the second item of the list
		RegistrationMain.addAddRegistration(registrationList, addReg);
		assertEquals("Check that arraylist size is 2", 2, registrationList.size());
		assertSame("Check that Addregistration is added", addReg, registrationList.get(1));

	}
	
	@Test
	public void testretrieveAllAddRegistration() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Addregistration arraylist to retrieve registration from", registrationList);
	
		//test if the list of AddTuition retrieved from the SourceCentre is empty - boundary
		String allRegistration= RegistrationMain.retrieveAllAddRegistration(registrationList);
		String testOutput = "";
		assertEquals("Test that the retrieved Chromebooklist is empty?", testOutput, allRegistration);
	
		//Given an empty list, after adding 2 item, test if the size of the list is 1 - normal
		RegistrationMain.addAddRegistration(registrationList, addReg);
		assertEquals("Test that the addTuition arraylist size is 1", 1 , registrationList.size());
	
		//test if the expected output string same as the list of tuitionList retrieved from the SourceCentre
		allRegistration = RegistrationMain.retrieveAllAddRegistration(registrationList);
		testOutput = String.format("%-15s %-10s %-15s %-15s %-15s %-15d \n",001, "A1234", "layA1234@gmail.com", "Pending", "31/07/22 09:15AM", 1001);
		assertEquals("Test that ViewAllAddRegistration",testOutput,allRegistration);
		
	}
	
	@Test
	public void testdoDeleteAddRegistation() {
		//Item list is not null, so that can delete a item - boundary
		assertNotNull("Test if there is valid registrationList arraylist to be deleted to",registrationList);
	
	
		// Given a list with one item, after deleting, the size of the list is 0 - normal
		RegistrationMain.doDeleteAddRegistation(registrationList, 0);
		assertEquals("Check that arraylist size is 0", 0, registrationList.size());
	
	}

	//Alvin
	@Test
	public void testAddTuition() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Tuition arraylist to add to", tuitionList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudy.addAddTuition(tuitionList, addTui);
		assertEquals("Check that arraylist size is 1", 1, tuitionList.size());
		assertSame("Check that addTuition is added", addTui, tuitionList.get(0));

//		// Add another item. test The size of the list is 2? -normal
//		// The item just added is as same as the second item of the list
		C206_CaseStudy.addAddTuition(tuitionList, addTui);
		assertEquals("Check that arraylist size is 2", 2, tuitionList.size());
		assertSame("Check that addTuition is added", addTui, tuitionList.get(1));
;
	}
	@Test
		public void testRetrieveAllAddTuition() {
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid AddTuition arraylist to retrieve tuition from", tuitionList);
		
		//test if the list of AddTuition retrieved from the SourceCentre is empty - boundary
		String allTuition= C206_CaseStudy.retrieveAllAddTuition(tuitionList);
		String testOutput = "";
		assertEquals("Test that the retrieved Chromebooklist is empty?", testOutput, allTuition);
		
		//Given an empty list, after adding 2 item, test if the size of the list is 1 - normal
		C206_CaseStudy.addAddTuition(tuitionList, addTui);
		assertEquals("Test that the addTuition arraylist size is 1", 1 , tuitionList.size());
		
		//test if the expected output string same as the list of tuitionList retrieved from the SourceCentre
		allTuition = C206_CaseStudy.retrieveAllAddTuition(tuitionList);
		testOutput = String.format("%-15d %-10s %-15s %-15s %-15s %-15s %-15s %-15s \n", 1 ,"a","a","a","a","a","a","a");
		assertEquals("Test that ViewAllAddTuition",testOutput,allTuition);
	}
	@Test
		public void testdoDeleteAddTuition() {
		 //Item list is not null, so that can delete a item - boundary
		assertNotNull("Test if there is valid tuitionList arraylist to be deleted to",tuitionList);
		
		
		// Given a list with one item, after deleting, the size of the list is 0 - normal
		C206_CaseStudy.doDeleteAddTuition(tuitionList, 0);
		assertEquals("Check that arraylist size is 0", 0, tuitionList.size());
		
		
	}


	@After
	public void tearDown() throws Exception {
		addTui = null;
		addReg = null;
		addStu = null;
		
		tuitionList = null;
		registrationList = null;
		studentList = null;
		
				
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
