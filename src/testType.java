import java.util.HashMap;
import java.util.ArrayList;

public class testType {
	public static void main(String[] args) {
		String str1 = new String("1");
		String str2 = new String("2");
		String str3 = new String("3");
		String str4 = new String("4");
		String str5 = new String("5");
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str5);
		
		int i = 0;
		while (i < 3) {
			list.remove(0);
			System.out.println(list.size());
			i++;
		}
		
		System.out.print(list);
	}
}
