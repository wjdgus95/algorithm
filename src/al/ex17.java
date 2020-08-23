package al;

import java.util.*;
import java.io.*;

public class ex17 {
	public static BufferedReader bf;
	public static BufferedWriter bw;
	
	public static void hanoi(int n,int a,int b,int c) throws IOException{
		if(n==1) {
//			System.out.println(a+" "+c);
			bw.write(a+""+" "+c+"\n");
			return;
		}
		else {
			hanoi(n-1,a,c,b);
//			System.out.println(a+" "+c);
			bw.write(a+""+" "+c+"\n");
			hanoi(n-1,b,a,c);
		}

	}
	public static void main(String[] args) throws IOException{

		bf = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		int res=1;
		
		for(int i=1;i<=n;i++) {
			res=res*2;
		}
//		BigInteger bi = new BigInteger("2");
//      BigInteger c = bi.pow(n).subtract(BigInteger.ONE);
        System.out.println(res-1);

		hanoi(n,1,2,3);
		bw.close();
	}

}
