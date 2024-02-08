import java.util.Scanner;
public class a7q8 {
	public static void printArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+(i==arr.length-1?".":", "));
		}
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
	System.out.println("1 for Display the array elements ");
	System.err.println("2 for Insert an element at specific position");
	System.out.println("3 for Delete an element at a given position");
	System.out.println("enter choice");
	int x=sc.nextInt();
	switch(x) {
	case 1:
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+", ");
			System.out.println();break;
		}
	case 2:
		System.out.println("enter the position you want to insert an element");
		int pos=sc.nextInt();
		System.out.println("enter the element you wanna insert");
		int newElement=sc.nextInt();
		int[] clown=new int[n+1];
		//making space
		for(int i=n;i>=pos;i--) {
			clown[i]=array[i-1];
		}
		//inserting new element
		clown[pos]=newElement;
		//filling remaining space
		for(int i=0;i<pos;i++) {
			clown[i]=array[i];
		}
		printArray(clown);
		break;
	case 3:
		System.out.println("enter the position you want to delete an element");
		int pos2=sc.nextInt();
		int[] clown2=new int[n-1];
		
		for(int i=pos2;i<n-1;i++) {
			clown2[i]=array[i+1];
		}
		for(int i=0;i<pos2;i++) {
			clown2[i]=array[i];
		}
		printArray(clown2);
		break;
		default:
			System.out.println("error");
	}
}
}
