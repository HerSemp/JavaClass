package edoxi;

public class Staff {
    protected int StaffNumber;
    protected String StaffName;
    protected double Salary;
    protected boolean instructor;
    public Staff(int StaffNumber, String StaffName, double Salary,boolean instructor){
        this.StaffNumber = StaffNumber;
        this.StaffName = StaffName;
        this.Salary = Salary;
        this.instructor = instructor;
    }

    public Staff() {

    }
}
