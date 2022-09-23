package stringExamples;

public class StringExamples {

    public static void main(String[] args){
        String s = "Hello";
        System.out.println(s+" Esan");

        StringBuffer b = new StringBuffer();
        b.append("Hello ");
        b.append(s);
        System.out.println(b);

    }
}
