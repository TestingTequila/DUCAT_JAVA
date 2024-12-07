package Day5;

public class SwitchStatement
{
    public static void main(String[] args)
    {
        int marks =55;
        switch (marks)
        {
            case 100:
                System.out.println("Amazing...you have scored perfect marks..");
                break;
            case 92:
                System.out.println("Outstanding...you have scored perfect marks..");
                break;
            case 84:
                System.out.println("Very Good...you have scored perfect marks..");
                break;
            case 77:
                System.out.println("Good...you have scored perfect marks..");
                break;
            default:
                System.out.println("You have scored below 70...try next time");
                break;
        }
    }
}
