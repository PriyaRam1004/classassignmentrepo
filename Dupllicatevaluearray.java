package week1.day1;

import java.util.Arrays;
import java.util.Iterator;

public class Dupllicatevaluearray {

	public static void main(String[] args) {
int[] num= {2,5,7,7,5,2,9};
Arrays.sort(num);
for (int i = 0; i < num.length-1; i++) {
	if(num[i]==num[i+1]) {
		System.out.println("The Duplicate value is: " +num[i+1]);
	}
}

	}

}
