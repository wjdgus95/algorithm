package al;
import java.util.*;
public class ex5 {

	public static void main(String[] args) {
		char [][] W= {
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'}
		};
		
		char [][] B= {
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'}
		};
		int cnt1=0;
		int cnt2=0;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int a=n-8;
		int b=m-8;
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> num2 = new ArrayList<Integer>();

		char [][]arr=new char[n][m];
		
		for(int i=0;i<n;i++) { // 행 단위로 입력
			String row = sc.next();
			
			for(int j=0;j<m;j++) {
				arr[i][j] = row.charAt(j);
			}
		}
		
		/*for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(arr[i][j]!=W[i][j]) cnt1++;
			}
		}//for
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(arr[i][j]!=B[i][j]) cnt2++;
			}
		}//for*/
		
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				
				for(int k=i;k<i+8;k++) {
					for(int l=j;l<j+8;l++) {
						if(arr[k][l]!=W[k-i][l-j]) cnt1++;						
					}
				}
				num.add(cnt1);
				cnt1=0;
			}
		}//for
		
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				
				for(int k=i;k<i+8;k++) {
					for(int l=j;l<j+8;l++) {
						if(arr[k][l]!=B[k-i][l-j]) cnt2++;						
					}
				}
				num2.add(cnt2);
				cnt2=0;
			}
		}//for
		num.sort(null);
		/*for(int i=0;i<num.size();i++) {
			System.out.print(num.get(i)+" ");
		}
		System.out.println();*/
		num2.sort(null);
		/*for(int i=0;i<num.size();i++) {
			System.out.print(num2.get(i)+" ");
		}
		System.out.println();*/
		System.out.println(Math.min(num.get(0),num2.get(0)));
		//System.out.println(cnt1+" "+cnt2);
	}

}
