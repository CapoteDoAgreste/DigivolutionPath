import java.util.ArrayList;

public class Main {
	
	static String Initial = "Botamon";
	static String Final = "Tsunomon";
	static DigiPath DP = new DigiPath();
	static PathCreate PC = new PathCreate();
	static boolean created = false;
	static ArrayList<String> finalPath = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		DP.Path(Initial,Final);
		
		String newInitial = DigiPath.First(Initial, Final);
		String newFinal = DigiPath.Second(Initial, Final);
		try {
			while(!created) {
				if(DigiPath.beforeDigimon.get(0) != null) {
				String newSeekTarget = DigiPath.beforeDigimon.get(0);
				if(newSeekTarget != null) {
					if(newSeekTarget != newFinal) {
						PathCreate.cacheClear();
						PathCreate.pathInit(newInitial,newFinal,newSeekTarget);
					}else {
						created = true;
					}
				}
			}
			if(DigiPath.beforeDigimon.get(0) == newFinal) {
				created = true;
				
				finalPath.add(newInitial);
				finalPath.addAll(PathCreate.middlePathDigimons);
				finalPath.add(newFinal);
				System.out.println(finalPath);
			}
		}
		}catch(Exception e) {
			created = true;
			
			finalPath.add(newFinal);
			finalPath.addAll(PathCreate.middlePathDigimons);
			finalPath.add(newInitial);
			System.out.println(finalPath);
			
			
		}
		
	}
	
	
	
	


}
