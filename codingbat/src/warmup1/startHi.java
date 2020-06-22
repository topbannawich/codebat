package warmup1;
import java.util.Scanner;
public class startHi {
	public static boolean startHi(String str) {
		  String[] word=str.split(" ");
		  if(word[0].equals("hi")) {
			  return true;
		  }else {
			  return false;
		  }
		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String word=sc.next();
		System.out.println(startHi(word));
	}

}
