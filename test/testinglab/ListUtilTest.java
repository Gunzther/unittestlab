package testinglab;

import static org.junit.Assert.assertEquals;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test for ListUtil
 * 
 * @author Gunthee Tawewatmongkol
 */
public class ListUtilTest {
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testOneUnique() {
		List<?> list1 = Arrays.asList('a', 'a', 'a', 'a');
		List<?> list2 = Arrays.asList("one");
		assertEquals(1, ListUtil.countUnique(list1));
		assertEquals(1, ListUtil.countUnique(list2));
	}
	
	@Test
	public void testListOfThreeItemsInSameType() {
		List<?> list1 = Arrays.asList('a', 'a', 'b', 'b', 'c');
		List<?> list2 = Arrays.asList("one", "one", "two", "three");
		assertEquals(3, ListUtil.countUnique(list1));
		assertEquals(3, ListUtil.countUnique(list2));
	}
	
	@Test
	public void testListOfItemsInDifferentTypes() {
		List<?> list1 = Arrays.asList('a', 'a', 'b', 1, 1, 2, 3);
		List<?> list2 = Arrays.asList('a', 'a', 'b', 1, 2, "one");
		assertEquals(5, ListUtil.countUnique(list1));
		assertEquals(5, ListUtil.countUnique(list2));
	}
	
	@Test
	public void testListOfSameValueItemsInDifferentTypes() {
		List<?> list = Arrays.asList(1, '1', "1");
		assertEquals(3, ListUtil.countUnique(list));
	}
	
	@Test
	public void testEmptyList() {
		List<?> list = new ArrayList<>();
		assertEquals(0, ListUtil.countUnique(list));
	}
	
	@Test
	public void testNullElementInCountunique() {
		List<?> list = Arrays.asList(null, null);
		assertEquals(1, ListUtil.countUnique(list));
	}
	
	@Test (expected = NullPointerException.class)
	public void testNullList() {
		List<?> list = null;
		ListUtil.countUnique(list);
	}
	
	@Test
	public void testFirstPositionElement() {
		String[] array1 = {"A", "B", "D", "Z", "C"};
		Integer[] array2 = {3, 2, 5, 1, 0};
		assertEquals(0, ListUtil.binarySearch(array1, "A"));
		assertEquals(0, ListUtil.binarySearch(array2, 0));
	}
	
	@Test
	public void testThirdPositionElement() {
		String[] array1 = {"A", "B", "D", "Z", "C"};
		Integer[] array2 = {3, 2, 5, 1, 0};
		assertEquals(2, ListUtil.binarySearch(array1, "D"));
		assertEquals(2, ListUtil.binarySearch(array2, 2));
	}
	
	@Test
	public void testMiddleElementOfFiveItemsArray() {
		Character[] array1 = {'A', 'A', 'A', 'A', 'A'};
		Integer[] array2 = {1, 1, 1, 1, 1};
		assertEquals(2, ListUtil.binarySearch(array1, 'A'));
		assertEquals(2, ListUtil.binarySearch(array2, 1));
	}
	
	@Test
	public void testNoElementInArray() {
		Character[] array = {'A', 'B', 'C'};
		assertEquals(-1, ListUtil.binarySearch(array, 'D'));
	}
	
	@Test
	public void testEmptyArray() {
		String[] array = new String[10];
		assertEquals(-1, ListUtil.binarySearch(array, "something"));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNullElementInBinary() {
		String[] array = {"A", "B", "D", "Z", "C"};
		ListUtil.binarySearch(array, null);
	}
	
	@Test (expected = NullPointerException.class)
	public void testNullArray() {
		String[] array = null;
		ListUtil.binarySearch(array, "A");
	}
}
