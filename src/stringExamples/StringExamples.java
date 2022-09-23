package stringExamples;

public class StringExamples {

    public static void main(String[] args){
        String s = "Hello";
        System.out.println(s+" Esan");


        /**
        try{
            s.append("Hello");
        } catch (Exception e){
            System.out.println(e);
        }
         */

        StringBuffer b = new StringBuffer();
        b.append("Hello ");
        b.append(s);
        System.out.println(b);

    }
}
