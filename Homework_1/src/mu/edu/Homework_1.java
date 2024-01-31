package mu.edu;

public class Homework_1 {

	public static void printInfo(String name, String gitHubID) {
		System.out.println("This group member's name is "+name+" and their GitHub ID is "+gitHubID);
	}

	public static void main(String[] args) {
		String connorGitId = "Conj43";
		String connorName = "Connor Joyce";
		String kymaniGitId = "bulbousduke";
		String kymaniName = "Kymani Scott";		

		
		printInfo(connorName, connorGitId);

		printInfo(kymaniName, kymaniGitId);

		
		String drewGitId = "Drew_Dis1";
		String drewName = "Drew Distler";
		
		
		printInfo(drewName, drewGitId);


	}
	
	
	
	
	

}