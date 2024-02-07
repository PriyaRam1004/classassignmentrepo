package week1.day1;

public class Fibnnociseries {

	public static void main(String[] args) {
    int a=0,b=1,c=5,d;
    
   for (int i = 2; i <= c; i++) {
	  
	   d=a+b;
	    a=b;
	    b=d;
	    System.out.println("The Fibonooci series are: " +d);
	
}	
	}

}
