import java.util.Scanner;
public class a7q1 {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element of the array");
	int n=sc.nextInt();
	int[] array=new int[n];
	int min=1,max=n,sum=0;
	for(int i=0;i<n;i++) {
		array[i]=(int)(Math.random()*((max-min)+1));
		sum+=array[i];
		}
	
	System.out.println("the elements are:");
	
	for(int i=0;i<n;i++) {
		System.out.print(array[i]+", ");
		}
	System.out.println("the sum is:"+ sum);
	System.out.println("the avg is:"+sum/n);
	System.out.println();
	sc.close();
}
}
