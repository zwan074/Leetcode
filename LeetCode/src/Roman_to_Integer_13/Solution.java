package Roman_to_Integer_13;

import java.util.HashMap;

public class Solution {
	
	static HashMap< String,Integer> iToR = new HashMap<String,Integer>();
	
	public static void buildRomanDict() {
		
		iToR.put("0",0);
		iToR.put("I",1);
		iToR.put("IV",4);
		iToR.put("V",5);
		iToR.put("IX",9);
		iToR.put("X",10);
		iToR.put("XL",40);
		iToR.put("L",50);
		iToR.put("XC",90);
		iToR.put("C",100);
		iToR.put("CD",400);
		iToR.put("D",500);
		iToR.put("CM",900);
		iToR.put("M",1000);

	}
	
	
	
	public static int romanToInt(String s) {
        
		StringBuilder ss = new StringBuilder();
		ss.append(s);
		buildRomanDict();
		
		int num = 0 ;
		if (s.contains("IV")) {
			ss.replace(s.indexOf("IV"),s.indexOf("IV")+2,"00" ) ;
			num += iToR.get("IV");}
		
		if (s.contains("IX")) {
			ss.replace(s.indexOf("IX"),s.indexOf("IX")+2,"00"  ) ;
			num += iToR.get("IX");}
		
		if (s.contains("XL")) {
			ss.replace(s.indexOf("XL"),s.indexOf("XL")+2,"00"  ) ;
			num +=  iToR.get("XL");}
		
		if (s.contains("XC")) { 
			ss.replace(s.indexOf("XC"),s.indexOf("XC")+2,"00"  ) ;
			num +=  iToR.get("XC");}
		
		if (s.contains("CD")) {
			ss.replace(s.indexOf("CD"),s.indexOf("CD")+2,"00"  ) ;
			num +=  iToR.get("CD");}
		
		if (s.contains("CM")) { 
			ss.replace(s.indexOf("CM"),s.indexOf("CM")+2, "00"  ) ;
			num +=  iToR.get("CM");	}
		
		for (int i = 0 ; i < ss.length() ; i++) num += 	iToR.get(ss.substring(i,i+1));
		
		return num;		
    }
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV") );

	}

}
