package al;
import java.util.*;
public class ex11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			
			String str=sc.next();
			
			for(int j=0;j<str.length();j++) {
				for(int k=0;k<m;k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}//for
		
	}

}
