package prob4;

public class Printer {

	public void println(Object obj){
		if(obj instanceof Integer){
			System.out.println((int)obj);
		}else if(obj instanceof Boolean){
			System.out.println((Boolean)obj);
		}else if(obj instanceof Double){
			System.out.println((Double)obj);
		}else if(obj instanceof String){
			System.out.println((String)obj);
		}
	}
}
