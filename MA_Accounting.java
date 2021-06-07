public class MA_Accounting extends Mitarbeiter{
    
    /**
     * @param name
     * @param firstName
     * @param birthYear
     * @param workID
     * @param department
     * @param role
     */
    public MA_Accounting(String name, String firstName, int birthYear, String workID, String department, String role, int hiredDate) {
        super(name, firstName, birthYear, workID, department, role, hiredDate);
    }

    @Override
    public void doYourWork(String flag) {
        
        super.doYourWork(flag);
    }
}
