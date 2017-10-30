package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++ ) {
			String k = eggs.get(i);
			if(k.equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int d = 0;
		for(int i = 0; i < oysters.size(); i++) {
			boolean q = oysters.get(i);
			if(q) {
			d += 1;
			}
			
		}
		return d;
	}
	public static double findTallest(List<Double> peeps) {
		double d = 0;
		for(int i = 0; i < peeps.size(); i++) {
			double b = peeps.get(i);
			if(b > d) {
				d = b;
			}
			else {
				
			}
		}
		
		return d;
	}
	public static String findLongestWord(List<String> words) {
		String a = "";
		String d = "";
		for(int i = 0; i < words.size(); i++) {
			 d = words.get(i);
			if(d.length() > a.length()) {
				a = d;
			}
			else {
				
			}
		}
		return a;
	}
	public static String containsSOS(List<String> message1, List<String> message2 ) {
	
		
		return "ff";
	}
	
	//Add other methods here
}