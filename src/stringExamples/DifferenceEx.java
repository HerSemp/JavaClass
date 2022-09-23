package stringExamples;

public class DifferenceEx {
    //Difference between Stringbuilder and Stringbuffer

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Hemanth");
        for (int i =0; i<=10000;i++){
            sb.append("India");
        }
        System.out.println("Time for Buffer is: "+(System.currentTimeMillis()-startTime));

        long startTime1 = System.currentTimeMillis();

        StringBuilder sb1 = new StringBuilder("Hemanth");
        for (int j =0; j<=10000;j++){
            sb.append("India");
        }
        System.out.println("Time for Builder is: "+(System.currentTimeMillis()-startTime1));

    }
}
