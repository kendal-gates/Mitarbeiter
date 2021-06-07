public class Person {
    
    private String name;
	private String firstName;
	private int birthYear;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    protected void tellMeAboutYourself() {
        System.out.println("Hello, my name is " + getFirstName() + " "+ getName() + " and I started working at the company since " + Mitarbeiter.getHiredDate() + " making that " + Mitarbeiter.yearsOfService() + " years working here.");
    }

}
