package practice.Test0929;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		int n=5;
		int[] arr1= {9,20,28,18,11};
		int[] arr2= {30,1,21,17,28};
		String[] answer=new String[n];
		int[][] result1=new int[n][n];
		int[][] result2=new int[n][n];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=arr1.length-1;j>=0;j--) {
				result1[i][j]=arr1[i]%2;
				arr1[i]=arr1[i]/2;
			}
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=arr2.length-1;j>=0;j--) {
				result2[i][j]=arr2[i]%2;
				arr2[i]=arr2[i]/2;
			}
		}
		//초기화를 해 주어야 한다.
		for(int i=0;i<n;i++) {
			answer[i]="";
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(result1[i][j]==1||result2[i][j]==1) {
					answer[i]+="#";
				}else {
					answer[i]+=" ";
				}
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(answer[i]);
			System.out.println();
		}
	}

}
