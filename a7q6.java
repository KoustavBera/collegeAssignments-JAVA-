import java.util.Scanner;
public class a7q6 {
	public static void swap(int[]array,int l,int r) {
		int temp=array[l];
		array[l]=array[r];
		array[r]=temp;
	}
	public static int[] rev(int[] array) {
		int left=0,right=array.length-1;
		while(left<right) {
			swap(array,left,right);
			left++;
			right--;
		}
				return array;
	}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n");
	int n=sc.nextInt();
	
	int[] array=new int [n];
	System.out.println("enter "+n+" array elements");
	for(int i=0;i<n;i++) {
		array[i]=sc.nextInt();
	}
	System.out.println("array before rev");
	for(int i=0;i<n;i++) {
		System.out.print(array[i]+", ");
	}
	System.out.println("");
	System.out.println("array after swap");
	int[] rev=rev(array);
	for(int i=0;i<n;i++) {
		System.out.print(rev[i]+", ");
	}
}
}
