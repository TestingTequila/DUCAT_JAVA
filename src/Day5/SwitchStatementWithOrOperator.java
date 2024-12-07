package Day5;

public class SwitchStatementWithOrOperator
{
    public static void main(String[] args) {
        String day = "Saturday";
        switch (day)
        {
            case "Monday":
            case"Tuesday":
            case"Wednesday":
            case"Thursday":
            case"Friday":
                System.out.println("This is working day");
                break;
            case"Saturday":
                case "Sunday":
                    System.out.println("Its weekend...");
                    break;
            default:
                System.out.println("Please enter correct day of week....");
                break;

        }
    }

}
