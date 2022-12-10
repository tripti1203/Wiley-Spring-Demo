package map_collection;
import java.util.*;
public class MapExample1 {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "King Kochar");
		map.put(102, "Shreya Sharma");
		map.put(103, "Gautam Bhatia");
		map.put(104, "Sarah Bowling");
		map.put(105, "John Smith");
		
		System.out.println(map);
		
		//the value doesn't get ignored it gets override. 
		map.put(105, "Aranya"); 
		map.putIfAbsent(105,"Tripti Kushwaha");
		
		System.out.println("HashMap is empty or not : " + map.isEmpty());
		System.out.println("Size of map : " +  map.size());
		
		int key = 105;
		if(map.containsKey(key))
			System.out.println("Value exists for this key : " + map.get(key));
		else
			System.out.println("Value does't exists for this key");
		
		//return boolean value depending upon map set removed or not.
		boolean removeCheck = map.remove(105,"John Smith");
		System.out.println(removeCheck);
		
		//Store HashMap entry sets to set collection
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		//prints all the keys in the map
		Set<Integer> keySets = map.keySet();
		System.out.println(keySets);
		
		//prints all the values in the map
		Collection<String> valueSets = map.values();
		System.out.println(valueSets);
		
		System.out.println("--------------------");
		
		//Iterating maps using forEach
		System.out.println("Iterating maps using forEach");
		map.forEach((pId,pName)->{
			System.out.println(pId + " : " + pName);
		});
		
		System.out.println("----------------------");
		
		//Iterating maps using forEach using entrySet
		System.out.println("Iterating maps using forEach using entrySet");
		map.entrySet().forEach((entry)->{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});
				
		
		System.out.println("--------------------");
		
		//Iterating using Iterator
		System.out.println("Iterating map using Iterator");
		Iterator<Map.Entry<Integer,String>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,String> entry = itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("----------------------------");
		System.out.println("Here");
		map.entrySet().forEach(null);
		
		System.out.println("--------------------------");
		
		//Iterating hashMap using enhanced loop 
		
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
