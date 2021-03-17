import java.util.Iterator;

public class DemoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="24";
		int sum=0;
		
		String b[] = a.split("");
		for (String c : b) {
			
			System.out.println(c);
			sum=sum+ Integer.parseInt(c);
			
					
		}
	System.out.println(sum);
	}
	

}