import java.util.HashMap;
import java.util.ArrayList;

public class testType {
	private static void modifyInt(int x) {
		x = x + 1;
	}	
	
	private static void modifyString(String str) {
		str = str.substring(5,6);
		System.out.println(str);
	}
	
	private static void modifyHashMap(HashMap map) {
		map.remove(1);
	}
	
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
		list.add(str4);
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
