package labSession;
import java.util.*;
import java.util.Map.Entry;

public class CountryMap {
	
private HashMap<String, String>M1;
	
public CountryMap() {
		M1 = new HashMap<String, String>();
	}

public HashMap<String, String>storeCountryCapital(String CountryName, String capital){
	M1.put(CountryName,  capital);
	return M1;
}

public String retrieveCapital(String CountryName) {
	return M1.get(CountryName);
}

public String retrieveCountry(String capitalName) {
	Set<Entry<String, String>>set = M1.entrySet();
	Iterator<Entry<String, String>> it = set.iterator();
	while(it.hasNext()) {
		Map.Entry<String, String> me = it.next();
		if (me.getValue().equals(capitalName))
			return me.getKey();
	}
	return null;
}

public HashMap<String, String>swapKeyValue(){
	HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			M2.put(me.getValue(), me.getKey());
		}
		return M2;
	}
	
public ArrayList<String> toArrayList(){
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();

		while(it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		return list;
	}

public static void main(String[] args) {
	CountryMap countryMap = new CountryMap();
	
	System.out.println(countryMap.storeCountryCapital("India", "Delhi"));
	System.out.println(countryMap.storeCountryCapital("Japan", "Tokyo"));
	
	
	System.out.println(countryMap.retrieveCapital("India"));
	System.out.println(countryMap.retrieveCapital("Tokyo"));

	HashMap<String, String> M2 = countryMap.swapKeyValue();
	System.out.println(M2);
}
}