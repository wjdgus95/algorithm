package al;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex22 {

	public static void main(String[] args) throws IOException {
		//11866
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());		
		int m = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q=new LinkedList();
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<=n;i++) {
			q.offer(i);
		}
		
		sb.append("<");
		
		while(true) {
			if(q.size() <= 1)break;
			
			for(int i=1;i<m;i++) {
				q.offer(q.poll());
			}
			
			sb.append(q.poll()+", ");
		}
		
		sb.append(q.poll()+">");
		System.out.println(sb);
	}

}
