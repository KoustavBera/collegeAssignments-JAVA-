import java.util.Scanner;
public class a7q3 {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n");
	int n=sc.nextInt();
	
	int[] array=new int [n];
	System.out.println("enter "+n+" array elements");
	for(int i=0;i<n;i++) {
		array[i]=sc.nextInt();
	}
	System.out.println("enter the element to be searched");
	int x=sc.nextInt();
	int found=0,count=0;
	for(int i=0;i<n;i++) {
		if(array[i]==x) {
			found=1;
			count++;
		}
		
	}
	if(found==1) {
		System.out.println("element is there bro"+" and it is present "+count+(count>1?" times.":" time"));
	}
	else {
		System.out.println("element not found");
	}
}
}
