package warmup1;

import java.util.Scanner;

public class or35 {
	
	public static boolean or35(int n) {
		  if(n%5==0||n%3==0) {
					  return true;
				  }else {
					  return false;
				  }
		}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println(or35(num));
	}

}
