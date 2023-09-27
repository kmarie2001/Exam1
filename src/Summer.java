import java.util.Scanner;
public class Summer {
    public static void main(String[] args){

        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");

        double value = number.nextDouble();
        double sum = 0;

        System.out.println("When you would like to stop entering numbers"
        + " and receive the sum, enter 0");

        while(value != 0) {
        sum = sum + value;
        System.out.println("Enter another number: ");
        value = number.nextDouble();

        while(value == 0){
        System.out.println("The sum of your numbers is " + sum);
        break;
        }
        }
    }
}