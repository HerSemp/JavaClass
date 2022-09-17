package friday;

public class AbstractChild extends MyAbstract{
    int value(int x, int y) {

        return x+y;
    }

    public static void main(String[] args) {

        AbstractChild mi = new AbstractChild();
        int result = mi.value(23,43);

        MyAbstract abschild = mi;


        System.out.println(result);

    }
}
