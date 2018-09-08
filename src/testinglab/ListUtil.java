package testinglab;

import java.util.ArrayList;
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
}
