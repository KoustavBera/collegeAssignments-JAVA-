import java.util.Scanner;
public class a7q5 { 
	public static double max(double[] array) {
		//let array[0] be minimum
		double max= array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			}
		return max;
	}
	public static double secondMax(double []array) {
		double max=max(array);
	
		for(int i=0;i<array.length;i++) {
		if(array[i]==max) {
			array[i]=Integer.MIN_VALUE;
		}
		}
		double secondMax=max(array);
		return secondMax;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double array[]=new double[10];
	System.out.println("enter the array elements");
	for(int i=0;i<10;i++) {
		array[i]=sc.nextDouble();
	}
	System.out.println("array:");
	for(int i=0;i<10;i++) {
		System.out.print(array[i]+", ");
	}
	System.out.println();
	System.out.println("max: "+max(array));
	System.out.println("second max: "+secondMax(array));
}
}
