package week1.day1;

public class Palindrome {

	public static void main(String[] args) {

		int num=343;
		int temp;
		temp=num;
		int rev=0;
		for(;num!=0;num=num/10) {
			rev=rev*10+num%10;
			if(temp==rev) {
				System.out.println(temp +"number is palindrom");
			}
			else {
				System.out.println(temp +"number is not palindrom");
			}
		}
		
	}

}
