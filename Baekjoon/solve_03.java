//나머지 백준 3052

import java.util.*;
public class Main{
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		
		int[] arr=new int[10];
		for(int i=0; i<10; i++) {arr[i]=sc.nextInt()%42;}
		sc.close();
		for(int i=0; i<10; i++) {
			for(int j=i+1; j<10; j++) {
				if(arr[i]==arr[j]) {arr[j]=-1;}
			}
		}
		int count =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {count ++;}
		}
		System.out.println(count);
		
		
	}
}
