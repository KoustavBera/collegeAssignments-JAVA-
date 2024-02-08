import java.util.Scanner;
public class a7q7 {
	public static int decimalToOctal(int n) {
		int i=0,oct=0,realOct=0;
		//octal divison dividend%8
do {
	int rem=n%8;
	oct=oct*10+rem;
	n=n/8;
	
}while(n!=0);
//reverse
while(oct>0) {
	int rem=oct%10;
	realOct=realOct*10+rem;
	oct/=10;
	
}
return realOct;
		}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter decimal no.");
	int n=sc.nextInt();
	System.out.println(decimalToOctal(n));
}
}
