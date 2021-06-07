import java.util.Calendar;
import java.util.GregorianCalendar;

public class Mitarbeiter extends Person {

	private String workID;
	private String department;
	private String role;
	private static int hiredDate;

	public Mitarbeiter(String name, String firstName, int birthYear, String workID, String department, String role,
			int hiredDate) {
		setName(name);
		setFirstName(firstName);
		setBirthYear(birthYear);
		this.workID = workID;
		this.department = department;
		this.role = role;
		Mitarbeiter.hiredDate = hiredDate;
	}
	public static int yearsOfService() {
		Calendar calendar = new GregorianCalendar();
		return calendar.get(Calendar.YEAR) - getHiredDate();
	}

	/**
	 * @return the workID
	 */
	public String getWorkID() {
		return workID;
	}

	/**
	 * @param workID the workID to set
	 */
	public void setWorkID(String workID) {
		this.workID = workID;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the hiredDate
	 */
	public static int getHiredDate() {
		return hiredDate;
	}

	/**
	 * @param hiredDate the hiredDate to set
	 */
	public void setHiredDate(int hiredDate) {
		Mitarbeiter.hiredDate = hiredDate;
	}

	/**
	 * Methode zur Fallunterscheidung
	 * 
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
	 * Ausgabe1 // Verhalten Lunch
	 */
	public void hasLunch() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm having lunch!");
	}

	/**
	 * Ausgabe2 // Verhalten Arbeitsbeginn
	 */

	public void startsWork() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm starting my work!");
	}

	/**
	 * Ausgabe --> accounting
	 */
	private void checkAccount() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm checking a customer's account!");
	}

	/**
	 * Ausgabe --> production
	 */
	private void assembleCar() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm assembling a car!");
	}

	/**
	 * Ausgabe --> advertising
	 */

	private void postingOnSocialMedia() {
		System.out.println("Hi, I'm " + getFirstName() + " " + getName() + " and I'm posting a phothograph on IG!");
	}

	/**
	 * Ausgabe --> Default
	 */
	private void doSomething() {
		System.out.println("Hi, I'm doing something.");
	}

}
