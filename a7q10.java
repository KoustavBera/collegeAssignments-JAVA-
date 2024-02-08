import java.util.Scanner;
public class a7q10 {
	public static int[] eliminateDuplicates(int[] array) {
	int[] ans=new int[10];
	int index=0;
	for(int i=0;i<10;i++) {
		if( ! isDuplicate(ans,array[i])) {
			ans[index++]=array[i];
		}
	}
	return ans;
	}

	public static boolean isDuplicate(int[]ans,int value) {
	for(int j=0;j<ans.length;j++) {
		if(ans[j]==value) {
			return true;
	}
	}
	return false;
	}
	
	public static void main(String [] args) {
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
		System.out.println("\n array after");
		int[] ans=eliminateDuplicates(array);
		for(int i=0;i<10;i++) {
			if(ans[i]!=0)
			System.out.print(ans[i]+", ");
		}
		System.out.print(".");
	}
	}

