package al;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex21 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue q=new LinkedList();
		int n = Integer.parseInt(br.readLine());
		
		int cnt=n;
		
		for(int i=0;i<n;i++) {
			q.offer(i+1);
		}
		
		int k=1;
		while(true) {
			
			if(cnt==1)break;
			
			if(k%2 != 0) {
				q.poll();
				cnt--;
			}else {
				q.offer(q.poll());
			}
			
			k++;
		}//while
		
		System.out.println(q.peek());
	}

}
