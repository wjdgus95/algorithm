package al;

import java.io.*;

public class ex10 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[26];
		
		for(int i=0;i<26;i++) {
			arr[i]=-1;
		}//for
		
		String s = bf.readLine();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(arr[c-'a']==-1)arr[c-'a']=i;
			//System.out.print(arr[c-'a']+" ");
		}//for
		
		//System.out.println();
		for(int i=0;i<26;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
