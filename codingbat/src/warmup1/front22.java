package warmup1;
import java.util.Scanner;
public class front22 {
	public static String front22(String str) {
		String word="";
		  if(str.length()>1) {
			  word=str.substring(0, 2);
		  }else {
			  word=str;
		  }
		  return word+str+word;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String word=sc.next();
		System.out.println(front22(word));
		}

	}


