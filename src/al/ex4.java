package al;

import java.io.*;

public class ex4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		String ans=bf.readLine();
		
		int Adrian=0;//a b c
		int Bruno=0;//b a b c
		int Goran=0;//c c a a b b
		
		//BAACC
		for(int i=0;i<ans.length();i++) {
			if((i+1)%3==1) {
				if(ans.charAt(i)=='A') {
					Adrian++;
				}
			}else if((i+1)%3==2) {
				if(ans.charAt(i)=='B') {
					Adrian++;
				}
			}else if((i+1)%3==0) {
				if(ans.charAt(i)=='C') {
					Adrian++;
				}
			}
		}//for
		
		for(int i=0;i<ans.length();i++) {
			if((i+1)%4==1) {
				if(ans.charAt(i)=='B') {
					Bruno++;
				}
			}else if((i+1)%4==2) {
				if(ans.charAt(i)=='A') {
					Bruno++;
				}
			}else if((i+1)%4==3) {
				if(ans.charAt(i)=='B') {
					Bruno++;
				}
			}else if((i+1)%4==0) {
				if(ans.charAt(i)=='C') {
					Bruno++;
				}
			}
		}//for
		
		for(int i=0;i<ans.length();i++) {
			if((i+1)%6==1) {
				if(ans.charAt(i)=='C') {
					Goran++;
				}
			}else if((i+1)%6==2) {
				if(ans.charAt(i)=='C') {
					Goran++;
				}
			}else if((i+1)%6==3) {
				if(ans.charAt(i)=='A') {
					Goran++;
				}
			}else if((i+1)%6==4) {
				if(ans.charAt(i)=='A') {
					Goran++;
				}
			}else if((i+1)%6==5) {
				if(ans.charAt(i)=='B') {
					Goran++;
				}
			}else if((i+1)%6==0) {
				if(ans.charAt(i)=='B') {
					Goran++;
				}
			}
		}//for
		
		if(Adrian>Goran && Adrian>Bruno) {
			System.out.println(Adrian);
			System.out.println("Adrian");
		}else if(Goran>Bruno && Goran>Adrian) {
			System.out.println(Goran);
			System.out.println("Goran");
		}else if(Bruno>Adrian&&Bruno>Goran) {
			System.out.println(Bruno);
			System.out.println("Bruno");
		}else if(Adrian==Goran && Goran>Bruno){
			System.out.println(Adrian);
			System.out.println("Adrian");
			System.out.println("Goran");
		}else if(Adrian==Bruno && Bruno>Goran) {
			System.out.println(Adrian);
			System.out.println("Adrian");
			System.out.println("Bruno");
		}else if(Bruno==Goran && Goran>Adrian){
			System.out.println(Bruno);
			System.out.println("Bruno");
			System.out.println("Goran");
		}else if(Adrian==Bruno && Bruno==Goran) {
			System.out.println(Adrian);
			System.out.println("Adrian");
			System.out.println("Bruno");
			System.out.println("Goran");
		}
		
		bw.flush();
		bw.close();
	}

}
