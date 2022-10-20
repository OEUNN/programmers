package practice.Test10;

public class Test1017 {
	public static void main(String[] args) {
		int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
		int answer=0;
		
		for(int i=0;i<sizes.length;i++) {
			int turn =0;
			if(sizes[i][0]<sizes[i][1]) {
				turn=sizes[i][0];
				sizes[i][0]=sizes[i][1];
				sizes[i][1]=turn;
			}
//			System.out.println(sizes[i][0]+","+sizes[i][1]);
		}
		int max0=0;
		int max1=0;
		for(int i=0;i<sizes.length;i++) {
			if(sizes[i][0]>max0) {
				max0=sizes[i][0];
			}
			if(sizes[i][1]>max1) {
				max1=sizes[i][1];
			}
		}
		answer=max0*max1;
		System.out.println(answer);
		
	}
}
