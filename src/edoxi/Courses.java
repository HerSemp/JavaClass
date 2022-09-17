package edoxi;
//import edoxi.Instructor;
public class Courses implements Scholarship{
    //Declaring attributes
    String CourseTitle;
    double fee;
    boolean offline;
    boolean online;
    //Constructor
    AdminStaff hr;
    CEO ceo;
    public Courses(String CourseTitle, double fee, boolean offline, boolean online){
        //Assigning values
         this.CourseTitle = CourseTitle;
         this.fee = fee;
         this.offline = offline;
         this.online = online;
    }
    public static void main(String[] args){

    }


}
