package Day5;

public class WhileLoop
{
    public static void main(String[] args) {

        System.out.println("====Printing Name 10 times=======");
        int i =1;
        while (i<=10)
        {
            System.out.println("Shubham");
            i++;
        }

        System.out.println("====Print the number from 1-10=============");

        int j=1;
        while (j<=10)
        {
            System.out.println(j);
            j++;
        }

        System.out.println("====Print the number from 10-1=============");

        int k=10;
        while (k>0)
        {
            System.out.println(k);
            k--;
        }

        System.out.println("=====Print the table of 2 ==================");
        int m =2;
        while (m<=20)
        {
            System.out.println(m);
            m = m +2;
        }

        System.out.println("=====Print the table of 2- Alternative Method ==================");
        int n =1;
        while (n<=10)
        {
            System.out.println(n*2);//2, 4....
            n++;

        }
    }
}
