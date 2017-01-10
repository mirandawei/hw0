package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner {


	//TODO you likely will need to add member variable
	public Map<Integer, String> localMap;
	// instance?
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		return null;
	}
	
	// Create and return a set that stores the array of T objects
	// You do not need to create your own set implementation and 
	// can use an existing set class.
	public Set<Integer> initSet(Integer[] tArray) {
		Set<Integer> rv = new HashSet<Integer>(Arrays.asList(tArray));
		return rv;
	}
	
	// Create and return a list that stores an the array of T objects
	// You do not need to create your own list implementation and 
	// can use an existing list class.
	public List<Integer> initList(Integer[] tArray) {
		List<Integer> rv = Arrays.asList(tArray);
		return rv;
	}
	
	// Create and return an empty map that will use type S as keys, and T as values
	// You do not need to create your own map implementation and 
	// can use an existing map class.
	public Map<String,Integer> initEmptyMap() {
		Map<String,Integer> rv = new HashMap<String,Integer>();
		return rv;
	}
	
	// Store the map in a local field variable -- often called a setter 
	public void storeMap(Map<String,Integer> mapToStoreInClass) {
		Map<String, Integer> localMap = mapToStoreInClass;
	}
	
	// Add a key value to the stored/local map with a boolean indicating whether to overwrite existing value
	// The return value indicates if you added the key value pair to the map
	// You do not need to check if the value changed or not (e.g. no need to compare values)
	public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
		if (localMap.containsKey(key)) {
			if (overwriteExistingKey) {
				localMap.put(key, value);
				return true;
			}
		} else {
			return false;
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
