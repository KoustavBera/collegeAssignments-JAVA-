import java.util.Scanner;
public class a7q4 { 
	public static double min (double[] array) {
		//let array[0] be minimum
		double min= array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
			}
		return min;
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
	System.out.println("min:"+min(array));
}
}
