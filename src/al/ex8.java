package al;
import java.util.*;
public class ex8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}//for
		
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					sum=arr[i]+arr[j]+arr[k];
					if(sum<=m) num.add(sum);
				}
			}
		}//for

		num.sort(null);
		
		System.out.println(num.get(num.size()-1));
		
	}

}
