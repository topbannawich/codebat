package warmup1;

public class front3 {
	public String front3(String str) {
		  if(str.length()>2) {
			  String word=str.substring(0, 3);
			  return word+word+word;
		  }else {
			  if(str.length()<3&&str.length()>0) {
				  String word=str.substring(0, str.length());
				  return word+word+word;
			  }else {
				  return "";
			  }
		  }
	}

}
