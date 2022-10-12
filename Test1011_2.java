package practice.Test10;

import java.util.Arrays;
import java.util.Comparator;

public class Test1011_2 {

	public static void main(String[] args) {
		String[] strings = new String[] {"abce", "abcd", "cdx" };
		int n = 2;
        String[] answer = new String[strings.length];
        
        //Arrays.sort의 매개변수로 Arrays.sort(배열, <? super ?>) 존재한다.
        //String은 Comparable 인터페이스를 구현하고있는 클래스이므로 compare 재정의가 가능하다.
        Arrays.sort(strings, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		if (o1.charAt(n) < o2.charAt(n)) {               
        			return -1;         
        		} else if (o1.charAt(n) == o2.charAt(n)) { 
        			//compareTo는 compare을 재정의 하면 사용가능하다.
        			return o1.compareTo(o2);          
        		} else {               
        			return 1;           
        		}        
        	}     
        });

//        return strings;
	}
}