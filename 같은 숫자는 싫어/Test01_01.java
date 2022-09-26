package practice.Test0926;

public class Test01_01 {

	public static void main(String[] args) {
		int[] arr= {1,1,3,3,0,1,1};
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[arr.length-1];

		int[] answer=new int[j];
		for(int i=0;i<j;i++) {
			answer[i]=temp[i];
		}
		
	}

}
