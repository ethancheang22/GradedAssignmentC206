import static org.junit.Assert.*;
import java.util.ArrayList;

//done by handsome man scrum master ethan
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
//	private AddTimetable addTT;
//	private AddTuition addTui;
//	private Registration addReg;
//	private StudentRegistration addStuReg;
//
//	private ArrayList<AddTimetable> timetableList;
//	private ArrayList<AddTuition> tuitionList;
//	private ArrayList<Registration> regList;
//	private ArrayList<StudentRegistration> stuRegList;
	private AddTimetable tt1;
	private AddTimetable tt2;
	private AddTimetable tt3;
	
	private ArrayList<AddTimetable> timetableList;
	
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
	
		tt1 = new AddTimetable("TT001", 450, "27/10/22 09:00", "27/10/22 10:30", "Face-to-Face");
		tt2 = new AddTimetable("TT002", 500, "28/10/22 09:00", "28/10/22 10:30", "Face-to-Face");
		tt3 = new AddTimetable("TT003", 550, "29/10/22 09:00", "29/10/22 10:30", "Face-to-Face");
		
		timetableList = new ArrayList<AddTimetable>();
	}
		// prepare test data
//		addTT = new AddTimetable("1", 0, null, null, null);
//		addTui = new AddTuition(0, "2", null, null, null, null, null, null);
//		addReg = new Registration("3", null, null, null, null, 0);
//		addStuReg = new StudentRegistration("4", null, null, null, null, null, null);
//
//		timetableList = new ArrayList<AddTimetable>();
//		tuitionList = new ArrayList<AddTuition>();
//		regList = new ArrayList<Registration>();
//		stuRegList = new ArrayList<StudentRegistration>();
		
	
	@Test
	public void testAddTimetable() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Timetable arraylist to add to", timetableList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		C206_CaseStudyTest.AddTimetable(timetableList, tt1);
		assertEquals("Check that Camcorder arraylist size is 1", 1, timetableList.size());
		assertSame("Check that Camcorder is added", tt1, timetableList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		C206_CaseStudyTest.AddTimetable(timetableList, tt2);
		assertEquals("Check that Timetable arraylist size is 2", 2, timetableList.size());
		assertSame("Check that Timetable is added", tt2, timetableList.get(1));
	}
//
//	@Test
//	public void testAddRegistration() {
//		// Item list is not null, so that can add a new item - boundary
//		assertNotNull("Check if there is valid registration arraylist to add to", regList);
//
//		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
//		// The item just added is as same as the first item of the list
//		C206_CaseStudyTest.AddRegistration(regList, addReg);
//		assertEquals("Check that regoistration arraylist size is 1", 1, regList.size());
//		assertSame("Check that Camcorder is added", addReg, regList.get(0));
//
//	}
	

	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
