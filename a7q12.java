import java.util.Scanner;
public class a7q12 {
	public static void swap(int[]array,int i,int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	public static int[] selectionSort(int[] array){
		for(int i=0;i<array.length;i++) {
			int minIndex=0;
		for(int j=i+1;j<array.length-i-1;j++) {
			if(array[i]>array[j]) {
				minIndex=j;
			}
		}
		int temp=array[minIndex];
		array[minIndex]=array[i];
		array[i]=array[minIndex];
		}
		return array;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] array=new int[10];
	System.out.println("enter the array elements");
	for(int i=0;i<10;i++) {
		array[i]=sc.nextInt();
	}
	System.out.println("array before:");
	for(int i=0;i<10;i++) {
		System.out.print(array[i]+(i==array.length-1?".":", "));
	}
	int[]ans= selectionSort(array);
	System.out.println("\n array after");
	for(int i=0;i<10;i++) {
		System.out.print(ans[i]+(i==ans.length-1?".":", "));
	}
}
}

