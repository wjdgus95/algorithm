package al;

import java.io.*;
import java.util.*;

public class ex18 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		ArrayList<Character> list = new ArrayList<>();
		
		Stack<Integer> s = new Stack<>();

		int num[] = new int[n];
		int ans[] = new int[n];
		
		for(int i=0;i<n;i++) {
			num[i]=i+1;
		}//for

		for(int i=0;i<n;i++) {
			ans[i] = Integer.parseInt(bf.readLine());
		}
		
		int k=0;
		for (int i = 1; i <= n; i++) {
			s.push(i);
			list.add('+');
			
			while(!s.isEmpty() && s.peek()==ans[k]) {
				s.pop();
				k++;
				list.add('-');
			}
			
		}//for
		
		if(!s.isEmpty()) {
			bw.write("NO");
		}else {
//			System.out.println(list.size());
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}
		
		bw.close();

	}

}
