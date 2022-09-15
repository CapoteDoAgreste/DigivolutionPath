import java.util.ArrayList;

public class PathCreate {
	static String InitialDigimon;
	static String FinalDigimon;
	static ArrayList<String> middlePathDigimons = new ArrayList<String>();
	static DigiPath DP = new DigiPath();
	static int Index = 0;
	
	static void pathInit(String Initial,String Final, String Middle) {
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
		DigiPath.SearchCacheUltra.clear();
		DigiPath.SearchCacheArmor.clear();
		DigiPath.SearchCacheNone.clear();
	}

}
