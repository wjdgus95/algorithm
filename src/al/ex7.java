package al;
import java.util.*;
public class ex7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		int a[]=new int[n];
		int b[]=new int[n];

		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}//for
		
		for(int i=0;i<n;i++) {
			int rank=0;
			for(int j=0;j<n;j++) {
				if(a[i]<a[j] && b[i]<b[j]) {
					rank++;
				}
			}
			num.add(rank+1);
		}
		
		for(int i=0;i<num.size();i++) {
			System.out.print(num.get(i)+" ");
		}
		
	}

}
