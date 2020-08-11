package al;
import java.util.*;
public class ex9 {
	//666포함하는 n번째 숫자
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		
		while(n>0) {			
			if(String.valueOf(cnt).contains("666")) {
				n--;
			}			
			cnt++;
		}//while
		
		System.out.println(cnt-1);
	}

}
