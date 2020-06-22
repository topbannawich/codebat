package warmup1;

public class frontBack {
	public String frontBack(String str) {
			if(str.length()>2) {
				String first=str.substring(0, 1);
				String last=str.substring(str.length()-1, str.length());
				String mid=str.substring(1, str.length()-1);
				return last+mid+first;
			}else {
				if(str.length()==1) {
					return str;
				}else if(str.length()==2) {
					return String.valueOf(str.charAt(1))+String.valueOf(str.charAt(0));
				}else {
					return "";
				}
			}
			
	}
}
