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
	public static boolean containsSOS(List<String> messageME ) {
		String jeffy = "... --- ...";
		String m = "";
		for(int i = 0; i < messageME.size(); i++ ) {
			m = messageME.get(i).trim();
			if(jeffy.equals(m)) {
				return true;
			}
			else {
			}
		}
		
		return false;
	}
	
	public static List <Double> sortScores(List <Double> RUOYA) {
		for(int i = 0; i < RUOYA.size(); i++) {
			for(int j = i+1; j < RUOYA.size(); j++) {
				if(RUOYA.get(i) > RUOYA.get(j)) {
					Double temp = RUOYA.get(i);
					RUOYA.set(i, RUOYA.get(j));
					RUOYA.set(j, temp );
					
				}
				else {
				}
			}
			
		}
		return RUOYA;
	}
	public static List <String> sortDNA (List <String> ben){
		for(int i = 0; i < ben.size(); i++) {
			for(int j = i+1; j < ben.size(); j++) {
				if(ben.get(i) > ben.get(j)) {
					String temp = ben.get(i);
					ben.set(i, ben.get(j));
					ben.set(j, temp );
					
				}
				else {
				}
			}
			
		}
		return ben;
		
	
	}
	//Add other methods here
}