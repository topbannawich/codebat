package warmup1;

public class nearHundred {
	

	public boolean nearHundred(int n) {
		  if(Math.abs(100-n)<=10&&Math.abs(100-n)>=0) {
			  return true;
		  }else if(Math.abs(200-n)<=10&&Math.abs(200-n)>=0) {
			  return true;
		  }else {
			  return false;
		  }
	}

}
