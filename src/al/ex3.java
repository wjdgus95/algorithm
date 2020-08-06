package al;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);

		int E=sc.nextInt();
		int S=sc.nextInt();
		int M=sc.nextInt();*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int cnt=1;
		int e=0,s=0,m=0;
		//(1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
		
		while(true) {
			
			/*if((e==E)&&(s==S)&&(m==M)) {
				System.out.println(cnt);
				break;
			}
			e++;
			s++;
			m++;
			
			if(e==16) e=1;
			if(s==29) s=1;
			if(e==20) m=1;
			
			cnt++;*/
			if((cnt-E)%15==0 && (cnt-S)%28==0 &&(cnt-M)%19==0) {
				System.out.println(cnt);
				break;
			}
			cnt++;
			
		}//while
		
	}

}
