package practice.Test0926;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
		int[] arr= {1,1,3,3,0,1,1};
		
		List<Integer> list=new ArrayList<>();
		list.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]){
				list.add(arr[i]);
			}
		}
		int[] answer =new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
			System.out.print(answer[i]+" ");
		}
		

	}



}
