/**
 *
 * Implementierung Mitarbeiter (MA)
 * Die Klasse implementiert das Verhalten von MA in
 * accounting, production und advertising
 * 
 * @author P.Schmidt
 *
 */

public class Mitarbeiter {
	
	private String name;
	private String firstName;
	private int birthYear;
	
	public String workID;
	public String department;
	public String role;
	
	/**
	 * Konstruktor Klasse
	 * 
	 * @param name 			: Familienname des MA
	 * @param firstName 	: Vorname des MA 
	 * @param birthYear 	: Geburtsjahr MA
	 * @param workID		: MA-Nr, intern
	 * @param department	: Abteilung
	 * @param role			: Job
	 */
	
	public Mitarbeiter(String name, String firstName, int birthYear, String workID, String department, String role) {
		this.name = name;
		this.firstName = firstName;
		this.birthYear = birthYear;
		this.workID = workID;
		this.department = department;
		this.role = role;
				
	}

	/**
	 * Getter
	 * @return name  // Familienname MA
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter
	 * @param name // Familienname MA
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Getter
	 * @return fistName // Vorname MA
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter
	 * @param firstName // Vorname MA
	 * Vorname
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter
	 * @return birthYear // Geburtsjahr MA
	 */
	public int getBirthYear() {
		return birthYear;
	}
	
	
	/**
	 * Setter
	 * @param birthYear // Geburtsjahr MA
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * Methode zur Fallunterscheidung
	 * @param flag // zB #manufacturing
	 */
	public void doYourWork(String flag) {
		
		switch (flag) {
		case "#manufacturing":
			this.assembleCar();
			break;
		case "#accounting":
			this.checkAccount();
			break;			
		case "#advertising":
			this.postingOnSocialMedia();
			break;
		default:
			this.doSomething();
			break;
		}		
		
	}
		
	/**
	 *  Ausgabe1 // Verhalten Luch
	 */
	public void hasLunch() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm having lunch!");		
	}
	
	/**
	 *  Ausgabe2 //  Verhalten Arbeitsbeginn
	 */

	public void startsWork() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm starting my work!");		
	}
	
	
	/**
	 *  Ausgabe --> accounting
	 */
	private void checkAccount() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm checking a customer's account!");		
	}
	
	/**
	 *  Ausgabe --> production
	 */
	private void assembleCar() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm assembling a car!");		
	}

	/**
	 *  Ausgabe --> advertising
	 */
	
	private void postingOnSocialMedia() {
		System.out.println("Hi, I'm " + firstName + " " + name + " and I'm posting a phothograph on IG!");		
	}

	/**
	 *  Ausgabe --> Default
	 */
	private void doSomething() {
		System.out.println("Hi, I'm doing something.");		
	}


}
