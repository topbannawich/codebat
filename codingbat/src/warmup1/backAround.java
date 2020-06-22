package warmup1;

public class backAround {
	public String backAround(String str) {
		String word="";
		  if(str.length()>0) {
			  word=String.valueOf(str.charAt(str.length()));
		  }
		  return word+str+word;
	}

}
