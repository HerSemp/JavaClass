package array;


import java.util.ArrayList;

public class ArrayEx {

    public static void main(String[] args) {

        int[] arr;
        arr = new int[]{1, 3, 4, 6, 8, 88};
        //System.out.print(arr[2]);

        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i] + " ");
        }
        String[] spice = {"cad", "pepa", "tchu", "zong"};
        for (int j = 0; j < spice.length; j++) {
           // System.out.println(spice[j] + " ");
        }

        int[] a = {1,2,4,5,6,7};
        int[] b = {25,2,5,6,23};

        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < b.length; i1++) {
                if (a[i] == b[i1]){
                   // System.out.print(b[i1]+",");
                }
                else {

                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = i +5;
            list.add(num);
        }

        //System.out.println(list.get(9));
        for (int item:
             list) {
           // System.out.println(item);
        }
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            names.add("Name"+i);
        }
        System.out.println(names.stream().findFirst());
    }
}
