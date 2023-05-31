import java.util.ArrayList;

public class DigiPath {
	static DigiDtabase db = new DigiDtabase();
	static ArrayList<String> States = new ArrayList<String>();
	static ArrayList<String> SearchCacheBaby = new ArrayList<String>();
	static ArrayList<String> SearchCacheInTraining = new ArrayList<String>();
	static ArrayList<String> SearchCacheRookie = new ArrayList<String>();
	static ArrayList<String> SearchCacheNone = new ArrayList<String>();
	static ArrayList<String> SearchCacheChampion = new ArrayList<String>();
	static ArrayList<String> SearchCacheUltimate = new ArrayList<String>();
	static ArrayList<String> SearchCacheMega = new ArrayList<String>();
	static ArrayList<String> SearchCacheUltra = new ArrayList<String>();
	static ArrayList<String> SearchCacheArmor = new ArrayList<String>();
	static ArrayList<String> beforeDigimon = new ArrayList<String>();
	static int CI = 0;// Cache Index
	static int NS = 0;// Number of seeks
	static int HS = -1;// Horizontal Seek
	static int t = 0;
	static int VP = 0;

	public void Path(String InitialDigimon, String FinalDigimon) {
		// Setting the basic variables, like states, possible digivolutions and states
		db.DigiTypeSet();
		db.DigiEvolutionSet();
		States.add("Baby");
		States.add("In-Training");
		States.add("Rookie");
		States.add("Champion");
		States.add("Ultimate");
		States.add("Mega");
		States.add("Ultra");
		States.add("Armor");

		System.out.println(String.format("Iniciando por %s ate %s", InitialDigimon, FinalDigimon));
		// That script works better when the First digimon have a minor state than the
		// Second
		String Firstt = InitialDigimon;
		String Secondd = FinalDigimon;

		InitialDigimon = First(Firstt, Secondd);
		FinalDigimon = Second(Firstt, Secondd);
		System.out.println(String.format("Iniciando por %s ate %s", InitialDigimon, FinalDigimon));

		boolean found = false;

		int ID = getID(InitialDigimon);
		System.out.println(ID);
		String STATE = getState(ID);
		System.out.println(STATE);

		found = seek(ID, STATE, FinalDigimon);
		VP += 1;
		System.out.println("Times Searched = " + VP);

		if (InitialDigimon == FinalDigimon) {
			FinalDigimon = Secondd;
		}
		boolean fou = false;

		while (!found && !fou) {
			switch (STATE) {
				case "Baby":
					for (int i = 0; i < SearchCacheInTraining.size(); i++) {
						String newDigimon = SearchCacheInTraining.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Found through " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}
					break;

				case "In-Training":
					for (int i = 0; i < SearchCacheBaby.size(); i++) {
						String newDigimon = SearchCacheBaby.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Found through " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}

					if (!found) {
						for (int i = 0; i < SearchCacheRookie.size(); i++) {
							String newDigimon = SearchCacheRookie.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Found through " + newDigimon);
								beforeDigimon.add(newDigimon);
							}
						}
					}
					break;

				case "Rookie":
					for (int i = 0; i < SearchCacheInTraining.size(); i++) {
						String newDigimon = SearchCacheInTraining.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Found through " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}

					if (!found) {
						for (int i = 0; i < SearchCacheChampion.size(); i++) {
							String newDigimon = SearchCacheChampion.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Found through " + newDigimon);
								beforeDigimon.add(newDigimon);
							}
						}
					}
					break;

				case "Champion":
					for (int i = 0; i < SearchCacheRookie.size(); i++) {
						String newDigimon = SearchCacheRookie.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Found through " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}

					if (!found) {
						for (int i = 0; i < SearchCacheUltimate.size(); i++) {
							String newDigimon = SearchCacheUltimate.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Found through " + newDigimon);
								beforeDigimon.add(newDigimon);
							}
						}
					}
					break;

				case "Ultimate":
					for (int i = 0; i < SearchCacheChampion.size(); i++) {
						String newDigimon = SearchCacheChampion.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Encontrado atraves do " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}

					if (!found) {
						for (int i = 0; i < SearchCacheMega.size(); i++) {
							String newDigimon = SearchCacheMega.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Encontrado atraves do " + newDigimon);
								beforeDigimon.add(newDigimon);
							}
						}
					}
					break;

				case "Mega":
					for (int i = 0; i < SearchCacheUltimate.size(); i++) {
						String newDigimon = SearchCacheUltimate.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Found through " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}

					if (!found) {
						for (int i = 0; i < SearchCacheUltra.size(); i++) {
							String newDigimon = SearchCacheUltra.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Found through " + newDigimon);
								beforeDigimon.add(newDigimon);
							}
						}
					}
					break;

				case "Ultra":
					for (int i = 0; i < SearchCacheMega.size(); i++) {
						String newDigimon = SearchCacheMega.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Encontrado atraves do " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}
					for (int i = 0; i < SearchCacheUltimate.size(); i++) {
						if (!found) {
							String newDigimon = SearchCacheUltimate.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Found through " + newDigimon);
								beforeDigimon.add(newDigimon);
								break;
							}
						}
					}

				case "None":
					for (int i = 0; i < SearchCacheRookie.size(); i++) {
						String newDigimon = SearchCacheRookie.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Encontrado atraves do " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}

					if (!found) {
						for (int i = 0; i < SearchCacheNone.size(); i++) {
							String newDigimon = SearchCacheNone.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Found through " + newDigimon);
								beforeDigimon.add(newDigimon);
							}
						}
					}

					if (!found) {
						for (int i = 0; i < SearchCacheInTraining.size(); i++) {
							String newDigimon = SearchCacheInTraining.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Found through " + newDigimon);
								beforeDigimon.add(newDigimon);
							}
						}
					}
					break;

				case "Armor":
					for (int i = 0; i < SearchCacheRookie.size(); i++) {
						String newDigimon = SearchCacheRookie.get(i);
						ID = getID(newDigimon);
						STATE = getState(ID);
						System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

						found = seek(ID, STATE, FinalDigimon);
						if (found) {
							fou = true;
							System.out.println("Found through " + newDigimon);
							beforeDigimon.add(newDigimon);
						}
					}

					if (!found) {
						for (int i = 0; i < SearchCacheChampion.size(); i++) {
							String newDigimon = SearchCacheChampion.get(i);
							ID = getID(newDigimon);
							STATE = getState(ID);
							System.out.println(String.format("Going from %s to %s", newDigimon, FinalDigimon));

							found = seek(ID, STATE, FinalDigimon);
							if (found) {
								fou = true;
								System.out.println("Found through " + newDigimon);
								beforeDigimon.add(newDigimon);
							}
						}
					}
					break;

			}
			VP += 1;
			System.out.println("Times searched = " + VP);
		}
		if (found) {
			System.out.println("Found!");
		}
		System.out.println(SearchCacheChampion);
	}

	static int getID(String DigiName) {
		int id = -1;
		String Read = null;

		for (int i = 0; i < db.Digimons.length; i++) {
			Read = db.Digimons[i];
			if (DigiName == Read) {
				id = i;
			}
		}
		System.out.println("Searched ID: " + id);
		return id;
	}

	static String getState(int DigiID) {
		String State = db.Digitypes[DigiID][0];
		return State;
	}

	static boolean seek(int CurrentDigimon, String CurrentState, String Target) {
		boolean founded = false;
		boolean seekInitiated = false;
		if (CurrentState == "Baby") {
			seekInitiated = true;
			founded = horizontalSeek(CurrentDigimon, Target, 1);

		}
		if (CurrentState == "Ultra" || CurrentState == "Armor" || CurrentDigimon == 326) {
			seekInitiated = true;
			founded = horizontalSeek(CurrentDigimon, Target, 0);
		}

		if (!seekInitiated) {
			founded = horizontalSeek(CurrentDigimon, Target, 1);
			if (!founded)
				founded = horizontalSeek(CurrentDigimon, Target, 0);

		}

		return founded;
	}

	static boolean horizontalSeek(int CurrentDigimon, String Target, int direction) {
		boolean founded = false;
		for (int i = 0; i < 7; i++) {
			if (db.DigiEvolution[CurrentDigimon][direction][i] != null) {
				String Read = db.DigiEvolution[CurrentDigimon][direction][i];
				int ReadID = getID(Read);
				String ReadState = getState(ReadID);
				boolean exists = false;

				if (Read == Target) {
					founded = true;
				}

				switch (ReadState) {
					case "Baby":
						for (int u = 0; u < SearchCacheBaby.size(); u++) {
							if (SearchCacheBaby.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheBaby.add(Read);
						}
						break;

					case "In-Training":
						for (int u = 0; u < SearchCacheInTraining.size(); u++) {
							if (SearchCacheInTraining.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheInTraining.add(Read);
						}
						break;

					case "Rookie":
						for (int u = 0; u < SearchCacheRookie.size(); u++) {
							if (SearchCacheRookie.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheRookie.add(Read);
						}
						break;

					case "Champion":
						for (int u = 0; u < SearchCacheChampion.size(); u++) {
							if (SearchCacheChampion.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheChampion.add(Read);
						}
						break;

					case "Ultimate":
						for (int u = 0; u < SearchCacheUltimate.size(); u++) {
							if (SearchCacheUltimate.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheUltimate.add(Read);
						}
						break;

					case "Mega":
						for (int u = 0; u < SearchCacheMega.size(); u++) {
							if (SearchCacheMega.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheMega.add(Read);
						}
						break;

					case "Ultra":
						for (int u = 0; u < SearchCacheUltra.size(); u++) {
							if (SearchCacheUltra.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheUltra.add(Read);
						}
						break;

					case "Armor":
						for (int u = 0; u < SearchCacheArmor.size(); u++) {
							if (SearchCacheArmor.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheArmor.add(Read);
						}
						break;

					case "None":
						for (int u = 0; u < SearchCacheNone.size(); u++) {
							if (SearchCacheNone.get(u) == Read) {
								exists = true;
							}
						}
						if (!exists) {
							SearchCacheNone.add(Read);
						}
						break;
				}
			}
		}
		return founded;
	}

	static String First(String FirstDigimon, String SecondDigimon) {

		int IDFirst = getID(FirstDigimon);
		int IDSecond = getID(SecondDigimon);
		String StateFirst = getState(IDFirst);
		String StateSecond = getState(IDSecond);

		int StateFirstID = -1;
		int StateSecondID = -1;

		for (int i = 0; i < States.size(); i++) {
			if (StateFirst == States.get(i)) {
				StateFirstID = i;
			}

			if (StateSecond == States.get(i)) {
				StateSecondID = i;
			}
		}

		if (StateFirstID <= StateSecondID) {
			return FirstDigimon;

		} else {
			return SecondDigimon;
		}

	}

	static String Second(String FirstDigimon, String SecondDigimon) {

		int IDFirst = getID(FirstDigimon);
		int IDSecond = getID(SecondDigimon);
		String StateFirst = getState(IDFirst);
		String StateSecond = getState(IDSecond);

		int StateFirstID = -1;
		int StateSecondID = -1;

		for (int i = 0; i < States.size(); i++) {
			if (StateFirst == States.get(i)) {
				StateFirstID = i;
			}

			if (StateSecond == States.get(i)) {
				StateSecondID = i;
			}
		}

		if (StateSecondID > StateFirstID) {
			return SecondDigimon;
		} else {
			return FirstDigimon;
		}

	}

}
