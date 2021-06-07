

public class App {
    public static void main(String[] args) {
		
		Mitarbeiter ma1 = new Mitarbeiter("Müller", "Max", 1965, "ID001" , "production", "worker",2000);
		Mitarbeiter ma2 = new Mitarbeiter("Popow", "Oleg", 1974, "ID002" , "accounting", "accountant", 2010);
		Mitarbeiter ma3 = new Mitarbeiter("Martinelli", "Silvia", 1985, "ID003" , "advertising", "consultant", 2017);
				
		// ma1.startsWork();
		// ma2.startsWork();
		// ma3.startsWork();

		ma1.tellMeAboutYourself();
		ma2.tellMeAboutYourself();
		ma3.tellMeAboutYourself();
		

		// ma1.hasLunch();
		// ma2.hasLunch();
		// ma3.hasLunch();
		
		ma1.doYourWork("#manufacturing");
		ma2.doYourWork("#accounting");			
		ma3.doYourWork("#advertising");	
		
		System.out.println(ma1.getBirthYear());				
		ma2.setName("Nossow");
		System.out.println(Mitarbeiter.getHiredDate());
		System.out.println(Mitarbeiter.yearsOfService());
		System.out.println(ma2.getName());
    }
}
