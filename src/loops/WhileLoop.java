package loops;

public class WhileLoop {

    public static void main(String[] args){

        int i = 1;
        while (i<=100){
            if (i%10==0){
                System.out.println("Tens:"+i);
            } else if (i%5==0) {
                System.out.println("Fives: "+i);
            } else {

            }
            i +=1;
        }

        /**
        int j = 100;
        while (1<=j){
            System.out.println("j"+j);
            j -=1;
        }*/
    }
}
