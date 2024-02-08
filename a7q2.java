import java.util.Scanner;
public class a7q2 {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n");
	int n;
		int[] count=new int[100];
	do {
		n=sc.nextInt();
		count[n]++;
	}while(n!=0);
	
	for(int i=0;i<100;i++) {
		if(count[i]>0) {
			System.out.println(i+" occurs "+count[i]+(count[i]>1?"times.":"time."));
		}
	}
}
}
