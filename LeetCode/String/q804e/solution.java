package q804e;



public class solution {
	
	
	public boolean judgeCircle(String moves) {
		
		int vert = 0, hor = 0;
		
		for (char c : moves.toCharArray() ) {
			
			if ( c == 'U') vert++;
			else if ( c == 'D') vert--;
			else if ( c == 'R') hor++;
			else if ( c == 'L') hor--;
			
		}
		

		
		return vert == 0 && hor == 0;
        
    }

}
