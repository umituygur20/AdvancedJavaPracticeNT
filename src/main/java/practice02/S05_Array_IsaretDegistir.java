package practice02;

import java.util.Arrays;

public class S05_Array_IsaretDegistir {
    public static void main(String[] args) {
  /*
        Array içerisindeki elementlerin işaretlerini (+-) değiştiren bir kod yazınız.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
    */

        int num [] = {1,2,-3,4,-5,-6 };
        int arr [] = new int[num.length];

        int idx=0;
        for (int w:num){
            arr [idx] = w*-1;
            idx++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
