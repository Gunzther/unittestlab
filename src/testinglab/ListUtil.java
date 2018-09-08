package testinglab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Count the number of distinct elements in a list.
 * 
 * @author Gunthee Tawewatmongkol
 * 
 */
public class ListUtil {
	
	 /**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * If the list contain null values, they will count as a unique element.
     *
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list) {
    	if (list == null) throw new NullPointerException("List must not be null");
    	List<Object> temp = new ArrayList<>();
    	for(Object x : list) {
    		if(!temp.contains(x)) temp.add(x);
    	}
		return temp.size();
	}
    
    /**
     * Sort the items in an array.
     * Find the index of the element in an array by binary search process.
     * The array may be empty but not null.
     * If the array contain null values, they will count as a unique element.
     * 
     * @param array an array of elements
     * @param element to search for
     * @return the index of the element in this array, or -1 if this array does not contain the element.
     */
    public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element) {
    	if ( array == null ) throw new NullPointerException("Array must not be null");
    	if ( element == null ) throw new IllegalArgumentException("Search element must not be null");
    	Arrays.sort(array);
    	int start = 0;
    	int end = array.length - 1;
    	
    	while(start <= end) {
    		int midPos = (start + end)/2;
    		int compare = element.compareTo(array[midPos]);
    		
    		if ( compare == 0 ) return midPos;
    		else if ( compare > midPos ) start = midPos + 1;
    		else end = midPos - 1;
    	}
		return -1;
    }
}
