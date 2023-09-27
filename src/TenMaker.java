import java.util.Scanner;
public class TenMaker {

    public static void main(String[] args) {

        Scanner number = new Scanner (System.in);
        System.out.println("Enter a whole number: ");
        int number1 = number.nextInt();

        System.out.println("Enter another whole number to add to the 1st number: ");
        int number2 = number.nextInt();

        makes10(number1 + number2);
    }
    public static void makes10(int result){
        if(result == 10){
        System.out.println("Congratulations! " + result + " equals 10!");
        }
        else{
        System.out.println("You're lame. " + result + " does not equal 10.");
        }

    }
}
