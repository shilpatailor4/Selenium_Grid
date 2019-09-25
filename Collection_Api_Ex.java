import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Collection_Api_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		arr.add(16);
		arr.add(17);
		arr.add(17); //duplicate value
		
		System.out.println(arr.get(0));
		
		/*for(int i : arr)
		{
			System.out.println(i);
		}*/
		
		//List
		List<Integer> lst = new ArrayList<>();
		lst.add(12);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		arr.add(16);
		arr.add(17);
		arr.add(17); //duplicate value
		
		System.out.println(lst.get(0));

		/*for(int i : lst) 
		{
			System.out.println(i);
		}*/
		
		//Set
		Set<Integer> number = new HashSet<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(10);
		
		for(int i : number)
		{
			System.out.println(i);
		}
		
		
		//Map
		Map<String, String> m = new HashMap<String, String>();
		m.put("Shery", "8989887");
		m.put("shilpa", "878787");
		m.put("shilpa2", "878785");
		m.put("shilpa1", "878784");
		
		System.out.println(m.get("shilpa"));
		
		Set<String> keys = m.keySet();
		
		for(String i : keys)
		{
			System.out.println(i+":-" +m.get(i));
		}
		
		

	}

}
