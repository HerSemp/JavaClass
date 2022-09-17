package friday;

public class NestedClass {
    public static class InnerClass{
        public InnerClass(){

        }
        static void message(){
            System.out.println("Printing from Inner class");
        }
    }
    public NestedClass(){

    }
    public static void main(String[] args){
        InnerClass obj = new InnerClass();
        obj.message();

    }
}
