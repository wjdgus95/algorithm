package al;
import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] nan = new int[9];
		
		for(int i=0;i<9;i++) {
			nan[i]=sc.nextInt();
		}
		//20 7 23 19 10 15 25 8 13
		for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++) {
				if(100-nan[i]-nan[j]==100) {
					System.out.println(nan[i]+" "+nan[j]);
				}
			}//for1
		}//for2
		
	}

}
