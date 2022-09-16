import java.util.ArrayList;

public class Main {
	
	static String Initial = "Growlmon";
	static String Final = "Sukamon";
	static DigiPath DP = new DigiPath();
	static PathCreate PC = new PathCreate();
	static boolean created = false;
	static ArrayList<String> finalPath = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		/*		Disclaimer
		 * Initially that code will show only one digivolution line.
		 * Because that only beforeDigimon.get(0) is being called.
		 */
		
		
		//Initial search, looking if the requested digivolution is possible, and getting the previous digimon
		DP.Path(Initial,Final);
		
		//Changing the order of digimons, from the minor state for the major
		String newInitial = DigiPath.First(Initial, Final);
		String newFinal = DigiPath.Second(Initial, Final);
		try {
			while(!created) {
				if(DigiPath.beforeDigimon.get(0) != null) {
					//Getting the previous digimon
					String newSeekTarget = DigiPath.beforeDigimon.get(0);
					if(newSeekTarget != null) {
						if(newSeekTarget != newFinal) {
							//Clearing the cache and initiating the path construction
							PathCreate.cacheClear();
							PathCreate.pathInit(newInitial,newFinal,newSeekTarget);
						}else {
							created = true;
						}
				}
			}
			if(DigiPath.beforeDigimon.get(0) == newFinal) {
				created = true;
				//Adding to the constructed path the digimon initial and final digimon
				finalPath.add(newInitial);
				finalPath.addAll(PathCreate.middlePathDigimons);
				finalPath.add(newFinal);
				System.out.println(finalPath);
			}
		}
		}catch(Exception e) {
			//When all in middle path are encountered, an ArrayIndexOutOfBoundsException error appear, 
			//the exception make the script finish the path, adding the initial and final digimon
			created = true;
			
			if(newFinal == newInitial) {
				newFinal = Final;
			}
			
			//Adding to the constructed path the digimon initial and final digimon
			finalPath.add(newFinal);
			finalPath.addAll(PathCreate.middlePathDigimons);
			finalPath.add(newInitial);
			System.out.println(finalPath);
			
			
		}
		
	}
	
	
	
	


}
