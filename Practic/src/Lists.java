import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> a= new ArrayList<>();
		List<Integer> b= new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(7);
		b.add(8);
		b.add(9);
		b.add(10);
		
		arr.add(a);
		arr.add(b);
		
		System.out.println(arr.size());
		System.out.println(arr.get(0).get(0));
		
		

	}

}
