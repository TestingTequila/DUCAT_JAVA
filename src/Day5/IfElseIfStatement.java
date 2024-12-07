package Day5;

public class IfElseIfStatement
{

    public static void main(String[] args) {

        int marks =55;
        if(marks<=100 && marks>90)
        {
            System.out.println("Outstanding....");
        }
        else if (marks<=90 && marks>80)
        {
            System.out.println("Very Good...");
        }

        else if (marks<=80 && marks>70)
        {
            System.out.println("Good...");
        }
        else if (marks<=70 && marks>60)
        {
            System.out.println("Average...");
        }
        else
        {
            System.out.println("You have scored below 70 marks....try next time");
        }



        {

        }
    }
}
