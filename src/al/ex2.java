package al;
import java.util.*;

public class ex2 {
	//20 7 23 19 10 15 25 8 13
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum=0;
		int ch1=0;int ch2=0;

		for(int i=0;i<9;i++) {
			list.add(sc.nextInt());
			sum=sum+list.get(i);
		}

		for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++) {
				
				if((sum-list.get(i)-list.get(j))==100) {
					//System.out.println(list.get(i)+" "+list.get(j));	
					//System.out.println(i+" "+j);
					ch1=i;ch2=j;
				}
			}
		}//for

		ch2--;
		list.remove(ch1);
		list.remove(ch2);
		
		list.sort(null);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+" ");
		}

	}

}
