package Day5;

public class ForLoop
{
    public static void main(String[] args) {

        System.out.println("====Printing Name 10 times=======");

        for (int i =1;i<=10;i++)
        {
            System.out.println("Shubham");
        }

        System.out.println("====Print the number from 1-10=============");


        for (int j=1;j<=10;j++)
        {
            System.out.println(j);

        }

        System.out.println("====Print the number from 10-1=============");


        for (int k=10;k>0;k--)
        {
            System.out.println(k);
        }

        System.out.println("=====Print the table of 2 ==================");

        for (int m =2;m<=20;m = m +2)
        {
            System.out.println(m);
        }

        System.out.println("=====Print the table of 2- Alternative Method ==================");

        for (int n =1;n<=10;n++)
        {
            System.out.println(n*2);//2, 4....
        }
    }
}
