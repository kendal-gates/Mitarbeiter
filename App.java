public class App {
    public static void main(String[] args) {
		
		Mitarbeiter ma1 = new Mitarbeiter("Müller", "Max", 1965, "ID001" , "production", "worker");
		Mitarbeiter ma2 = new Mitarbeiter("Popow", "Oleg", 1974, "ID002" , "accounting", "accountant");
		Mitarbeiter ma3 = new Mitarbeiter("Martinelli", "Silvia", 1985, "ID003" , "advertising", "consultant");
		
		ma1.startsWork();
		ma2.startsWork();
		ma3.startsWork();
		
		ma1.hasLunch();
		ma2.hasLunch();
		ma3.hasLunch();
		
		ma1.doYourWork("#manufacturing");
		ma2.doYourWork("#accounting");			
		ma3.doYourWork("#advertising");	
		
		System.out.println(ma1.getBirthYear());				
		ma2.setName("Nossow");
		System.out.println(ma2.getName());
    }
}
