package q929E;

import java.util.HashSet;
import java.util.Set;

public class solution {
	
	
	public int numUniqueEmails(String[] emails) {
		
		Set<String> s = new HashSet<>();
		
		for (String e : emails) {
			
			String local = e.substring(0,e.indexOf('@'));
			String rest = e.substring(e.indexOf('@'), e.length());
			
			if (local.contains("+")) local = local.substring(0, local.indexOf('+'));
			local = local.replaceAll("\\." , "");
			System.out.println(local + rest);
			s.add(local + rest);
			
		}
		
		
		
		
		return s.size();
        
    }

}
