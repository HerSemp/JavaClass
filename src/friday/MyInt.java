package friday;

public interface MyInt {
    static String dou = "My static string";
    abstract double add(double a, double b);


    default String name(String hisName) {
        return hisName;
    }
}
