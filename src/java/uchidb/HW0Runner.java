package uchidb;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * @author aelmore
 */
public class HW0Runner implements Containers<Integer, String> {


	//TODO you likely will need to add member variable
	private Map<String, Integer> localMap;

	private static HW0Runner inst = new HW0Runner();
	private HW0Runner(){};
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		return inst;
	}
	
	// Create and return a set that stores the array of T objects
	// You do not need to create your own set implementation and 
	// can use an existing set class.
	public Set<Integer> initSet(Integer[] tArray) {
		return new HashSet<Integer>(Arrays.asList(tArray));
	}
	
	// Create and return a list that stores an the array of T objects
	// You do not need to create your own list implementation and 
	// can use an existing list class.
	public List<Integer> initList(Integer[] tArray) {
		return new ArrayList<Integer>(Arrays.asList(tArray));
	}
	
	// Create and return an empty map that will use type S as keys, and T as values
	// You do not need to create your own map implementation and 
	// can use an existing map class.
	public Map<String,Integer> initEmptyMap() {
		return new HashMap<String,Integer>();
	}
	
	// Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<String,Integer> mapToStoreInClass) {
		localMap = mapToStoreInClass;
	}
	
	// Add a key value to the stored/local map with a boolean indicating whether to overwrite existing value
	// The return value indicates if you added the key value pair to the map
	// You do not need to check if the value changed or not (e.g. no need to compare values)
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		if (localMap.containsKey(key)) {
			if (overwriteExistingKey) {
				localMap.put(key, value);
				return true;
			} else {
				return false;
			}
		} else {
			localMap.put(key, value);
			return true;
		}
	}
	
	// Return a value from the stored/local map based on the key
	public Integer getValueFromMap(String key) {
		return localMap.get(key);
		
	}
	
	// An overloaded function to get a value from the store/local map, but with a default value
	// if the key is not present in the map.
	public Integer getValueFromMap(String key, Integer defaultValue) {
		if (localMap.containsKey(key)) {
			return localMap.get(key);
		} else {
			return defaultValue;
		}
	}

	public static void main(String[] args){
		
	}
}
