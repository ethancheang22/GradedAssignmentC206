import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private AddTuition addTui;
	
//Alvin test unitt
	private ArrayList<AddTuition> tuitionList;
	

	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		addTui = new AddTuition(1, "a", "a", "a", "a", "a", "a", "a");

		tuitionList = new ArrayList<AddTuition>();
	
	}

	@Test
	//Alvin
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
		
		
		tuitionList = null;

				
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

}
