package al;

import java.io.*;
import java.util.*;
public class ex15 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		
		while(n-- >0) {
			boolean isVPS= true;
			String str=bf.readLine();
			Stack<Character> s= new Stack<>();
			
			for(char ch : str.toCharArray()) {
				if(ch=='(') {
					s.push('(');
				}else if(ch ==')') {
					if(s.isEmpty()) {
						isVPS=false;
						break;
					}else {
						s.pop();
					}
					
					
				}
			}//for
			
			if(!s.isEmpty()) isVPS = false;
			if(isVPS) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}//while
		
		
		
		
	}

}