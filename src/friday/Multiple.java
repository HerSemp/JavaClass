package friday;


public class Multiple implements MyInt,MyInt2{
    public Multiple(){

    }
    public static void main(String[] args){
        // Creating object and printing
        Multiple mi = new Multiple();
        double result1 = mi.add(12.8, 2.0);
        double result2 = mi.sub(result1,1);
        mi.name("Hamza");
        System.out.println(result1+" & "+result2);
        System.out.println("Name: "+mi.name("Hamza"));

    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public String name(String hisName) {
        return hisName;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }
}
