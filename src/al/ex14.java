package al;
import java.util.*;
public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int sum=0;
		
		while(n-->0) {
			
			int m=sc.nextInt();
			if(m==0) {
				stack.pop();
			}else{
				stack.push(m);
			}
			
		}//while
		
		while(stack.size()!=0) {
			sum=sum+stack.pop();
		}
		
		System.out.println(sum);
	}

}
