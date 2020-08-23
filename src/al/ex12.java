package al;
import java.util.*;
public class ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
       
        char[] arr;
        String str=sc.next();
        arr= str.toCharArray();
        
        for(int i=0; i<arr.length; ++i){
            if(97<=arr[i] && arr[i]<=122){
                arr[i]=(char)(arr[i]-32);
            }
        }//for
        
        char[] char_arr = new char[1000000];
        char_arr[0]=arr[0];
        
        for(int i=1;i<arr.length;i++) {
        	for(int j=0;j<i;j++) {
        		if(char_arr[j]==arr[i]) {
        			cnt++;
        			break;
        		}
        	}
        	char_arr[cnt]=arr[i];
        }//for
        
        for(int i=0;i<cnt;i++) {
        	System.out.print(char_arr[i]);
        }//for
	}
}