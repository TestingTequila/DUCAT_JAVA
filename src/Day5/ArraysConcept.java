package Day5;

import java.util.Arrays;

public class ArraysConcept {
    public static void main(String[] args) {

        int x =10;
        System.out.println(x);
        //12, 24,45,67,78,99
        int[] numbers = {12, 24, 45, 67, 78, 99};

        System.out.println("===============WHILE LOOP===============");
        int i=0;
        while (i<numbers.length)
        {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("==============FOR LOOP===============");

        for (int j=0;j<numbers.length;j++)
        {
            System.out.println(numbers[j]);
        }

        System.out.println("==========Advanced For Loop===========");
        for(int num : numbers)
        {
            if(num==78)
            {

            }
            else {
                System.out.println(num);
            }
        }

        System.out.println("================Only for Display purpose===========");
        System.out.println(Arrays.toString(numbers));
    }
}
