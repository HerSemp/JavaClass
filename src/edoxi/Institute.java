package edoxi;

public class Institute {
    private static final String CEO = "Sharif";

    public Institute(){

    }

    public static void main(String[] args){
        Courses android = new Courses("Android Dev",1200.8,true,false);
        Courses android1 = new Courses("Cybersec",200,true,false);
        Courses android2 = new Courses("Python cou",19209,true,false);
        Courses android3 = new Courses("Networking",1200,true,false);
        Courses android4 = new Courses("Linux cou",1447,true,false);
        Courses android5 = new Courses("CEH Cyber",1298,true,false);

        //Creating Instructor object
        Instructor hemanth = new Instructor();
        hemanth.StaffName = "Hemanth B";
        Instructor gaurav = new Instructor();
        gaurav.StaffName = "gaurav B";
        Instructor jon = new Instructor();
        jon.StaffName = "jon B";

        //Creating Staff object
        AdminStaff hr1 = new AdminStaff("HR","Manager");
        hr1.StaffNumber = 001;
        hr1.StaffName = "Abhilash";
        AdminStaff acc1 = new AdminStaff("Accounts","Treasurer");
        acc1.StaffNumber = 001;
        acc1.StaffName = "Fawaz";

        //Printing Course Content
        System.out.println("Edoxi Training Institute");
        System.out.println("Edoxi Training Institute CEO "+ CEO);
        System.out.println("Course Structure");
        System.out.println("Course Name\t\tFee\t\tOffline\t\tScholarship\t\tInstructor");
        System.out.println(android.CourseTitle+"\t\t" + android.fee+"\t"+android.offline+"\t\t"+android.scholarship()+"\t\t"+hemanth.StaffName);
        System.out.println(android1.CourseTitle+"\t\t" + android1.fee+"\t"+android1.offline+"\t\t"+android1.scholarship()+"\t\t"+hemanth.StaffName);
        System.out.println(android2.CourseTitle+"\t\t" + android2.fee+"\t"+android2.offline+"\t\t"+android2.scholarship()+"\t\t"+jon.StaffName);
        System.out.println(android3.CourseTitle+"\t\t" + android3.fee+"\t"+android3.offline+"\t\t"+android3.scholarship()+"\t\t"+gaurav.StaffName);
        System.out.println(android4.CourseTitle+"\t\t" + android4.fee+"\t"+android4.offline+"\t\t"+android4.scholarship()+"\t\t"+hemanth.StaffName);
        System.out.println(android5.CourseTitle+"\t\t" + android5.fee+"\t"+android5.offline+"\t\t"+android5.scholarship()+"\t\t"+jon.StaffName);


        System.out.println("\n\n");

        //Printing Staff Content
        System.out.println("Staff Structure");
        System.out.println("Staff Name\t\tDepartment\t\tRole");
        System.out.println(hr1.StaffName+"\t\t" + hr1.department+"\t\t\t"+hr1.role);
        System.out.println(acc1.StaffName+"\t\t" + acc1.department+"\t\t\t"+acc1.role);

    }
}
