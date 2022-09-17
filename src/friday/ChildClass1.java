package friday;

public class ChildClass1 extends ParentClass{
    public ChildClass1(){
        super();
        System.out.println("New child created");

    }
    public void engine(){
        System.out.println("Engine Capacity should be:");
        super.engine();
    }
    public static void main(String[] args){
        ChildClass1 mychild = new ChildClass1();
        mychild.a = 5;
        mychild.greetings();
        System.out.println(mychild.a);
        mychild.engine();

    }
}
