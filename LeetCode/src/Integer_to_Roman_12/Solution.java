/*

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: 3
Output: "III"

Example 2:

Input: 4
Output: "IV"

Example 3:

Input: 9
Output: "IX"

Example 4:

Input: 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.

Example 5:

Input: 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


 */

package Integer_to_Roman_12;

import java.util.HashMap;

public class Solution {
	static HashMap<Integer, String> iToR = new HashMap<Integer, String>();
	
	public static void buildRomanDict() {
		
		iToR.put(0, "");
		iToR.put(1, "I");
		iToR.put(2, "II");
		iToR.put(3, "III");
		iToR.put(4, "IV");
		iToR.put(5, "V");
		iToR.put(6, "VI");
		iToR.put(7, "VII");
		iToR.put(8, "VIII");
		iToR.put(9, "IX");
		iToR.put(10, "X");
		iToR.put(20, "XX");
		iToR.put(30, "XXX");
		iToR.put(40, "XL");
		iToR.put(50, "L");
		iToR.put(60, "LX");
		iToR.put(70, "LXX");
		iToR.put(80, "LXXX");
		iToR.put(90, "XC");
		iToR.put(100, "C");
		iToR.put(200, "CC");
		iToR.put(300, "CCC");
		iToR.put(400, "CD");
		iToR.put(500, "D");
		iToR.put(600, "DC");
		iToR.put(700, "DCC");
		iToR.put(800, "DCCC");
		iToR.put(900, "CM");
		iToR.put(1000, "M");
		iToR.put(2000, "MM");
		iToR.put(3000, "MMM");
	}
	
	
	
	public static String intToRoman(int num) {
		buildRomanDict();
		if (num > 0 && num <= 10 ) return iToR.get(num);
		else if (num >= 10 && num < 100)  return iToR.get(num-num%10) + iToR.get(num%10); 
		else if (num >= 100 && num < 1000) return iToR.get(num-num%100) + iToR.get(num%100-num%10) + 
				iToR.get(num%10); 
		else if (num>=1000 && num<=3999) return iToR.get(num-num%1000) + iToR.get(num%1000-num%100) + 
				iToR.get(num%100-num%10) + iToR.get(num%10) ; 
		else return "Not a valid number";
		
    }
	public static void main(String[] args) {
		System.out.println(intToRoman(5000));

	}

}
