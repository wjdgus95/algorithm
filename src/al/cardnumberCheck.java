package al;

public class cardnumberCheck {

	public static void main(String[] args) {
		
		String cardNumber="21378";
		
		String answer="";
		int len=cardNumber.length();
		int[] cardNum=new int[105];
		int res=0;
		String num="";
		
		for(int i=0;i<len;i++) {
			cardNum[i]=Integer.parseInt(cardNumber.charAt(i)+"");
		}
		
		if(len%2 ==0) {//짝수 개수의 숫자를 가지고 있으므로 홀수 위치에 2곱함
			for(int i=0;i<len;i++) {
				if(i==0 || i%2==0) {
					num=num+Integer.toString(cardNum[i]*2);
				}else {
					num=num+Integer.toString(cardNum[i]);
				}
			}
		}else {//홀수 개수의 숫자를 가지고 있으므로 짝수의 위치에 2 곱함
			for(int i=0;i<len;i++) {
				if(i>0 && i%2!=0) {
					num=num+Integer.toString(cardNum[i]*2);
				}else {
					num=num+Integer.toString(cardNum[i]);
				}
			}
		}//if
		
		for(int i=0;i<num.length();i++) {
			res=res+Integer.parseInt(num.charAt(i)+"");
		}
		
		if(res%10==0) {
			answer="VALID";
		}else {
			answer="INVALID";
		}
		
		System.out.println(answer);
	}

}
