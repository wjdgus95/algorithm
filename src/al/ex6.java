package al;
import java.util.*;
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		int n=sc.nextInt();
		int sum=0;
		
		int arr[][]=new int[n][2];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}//for
		
		int date=0;
		for(int i=0;i<n;i++) {
			date=i;
			while(date<n) {
				if(arr[date][0]<=n-date) {
					sum=sum+arr[date][1];
				}else {
					break;
				}
				date=date+arr[date][0];
			}
			num.add(sum);
			sum=0;
		}//for		
		
		
		for(int i=0;i<num.size();i++) {
			System.out.print(num.get(i)+" ");
		}
		System.out.println();
		num.sort(null);
		for(int i=0;i<num.size();i++) {
			System.out.print(num.get(i)+" ");
		}
		System.out.println();
		System.out.println(num.get(num.size()-1));

	}

}
