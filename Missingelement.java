package week1.day1;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
int[] num= {2,1,3,5,6};
Arrays.sort(num);
for (int i = 0; i < num.length; i++) {
	if(num[i]+1 !=num[i]+1) {
		System.out.println("The Missing Element is: " +num[i]+1);
		break;
	}
}
	}

}
