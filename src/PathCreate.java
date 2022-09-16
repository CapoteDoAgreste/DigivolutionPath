import java.util.ArrayList;

public class PathCreate {
	static String InitialDigimon;
	static String FinalDigimon;
	static ArrayList<String> middlePathDigimons = new ArrayList<String>();
	static DigiPath DP = new DigiPath();
	static int Index = 0;
	
	static void pathInit(String Initial,String Final, String Middle) {
		
		/*
		 * The logic used in that script is take the initial, final and digimon previous to the final when the initial seek has made,
		 * before that, a new seek will be make with the initial and the previous(newFinal), next that a new previous the script will got it
		 * and repeat what i said, it will only stop when the middlePath was concluded.
		 */
		
		
		//Register the digimon on the path
		pathRegister(Middle);
		System.out.print(Middle+" adicionado em "+middlePathDigimons);
			
		cacheClear();
		DigiPath.beforeDigimon.clear();
		System.out.println("Middle: "+Middle);
		String newFirstt = DigiPath.First(Initial, Middle);
		String newSecondd = DigiPath.Second(Initial, Middle);
		if(newFirstt == newSecondd) newSecondd = Middle;
		System.out.println("First: "+newFirstt);
		System.out.println("Second: "+newSecondd);
			DP.Path(newFirstt, newSecondd);
	}
	
	static void pathRegister(String Middle) {
			middlePathDigimons.add(Middle);
		
		
	}
	
	static void cacheClear() {
		DigiPath.SearchCacheBaby.clear();
		DigiPath.SearchCacheInTraining.clear();
		DigiPath.SearchCacheRookie.clear();
		DigiPath.SearchCacheChampion.clear();
		DigiPath.SearchCacheUltimate.clear();
		DigiPath.SearchCacheMega.clear();
		DigiPath.SearchCacheUltra.clear();
		DigiPath.SearchCacheArmor.clear();
		DigiPath.SearchCacheNone.clear();
	}

}
