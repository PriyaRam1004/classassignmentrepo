package week1.day1;

import java.util.Arrays;
import java.util.Iterator;

public class Intersectionarray {

	public static void main(String[] args) {
int[] num= {4,5,6,7};
int[] num1= {3,5,8,4};
Arrays.sort(num);
Arrays.sort(num1);
for (int i = 0; i < num.length; i++) {
	for (int j = 0; j < num1.length; j++) {
		if(num[i]==num1[j]) {
			System.out.println("The intersection Numbers Are: " +num1[j]);
		}
	}
}
}

}
