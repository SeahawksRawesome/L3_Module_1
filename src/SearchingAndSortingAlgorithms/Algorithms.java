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
	
	//Add other methods here
}