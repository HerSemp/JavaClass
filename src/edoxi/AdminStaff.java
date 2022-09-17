package edoxi;

public class AdminStaff extends Staff{
    String department;
    String role;
    public AdminStaff(String department, String role){
        super();
        this.department = department;
        this.role = role;
    }
    public static void main(String[] args){
        AdminStaff first = new AdminStaff("HR","recruit");
        first.StaffNumber = 001;
        first.StaffName = "Abhilash";
        first.Salary = 1200;
    }
}
