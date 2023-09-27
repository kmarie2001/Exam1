import java.util.Scanner;
public class BeverageSelector {

    public static void main(String[] args){

        Scanner beverage = new Scanner (System.in);
        System.out.println("What would you like to drink today? Enter a number" +
        "to make your selection. (1)Water (2)Coke (3)Coffee");

        int beverageChoice = beverage.nextInt();


        if(beverageChoice == 1){
        System.out.println("Let me grab you a water.");
        }
        else if(beverageChoice == 2){
        System.out.println("Let me grab you a coke.");
        }
        else if(beverageChoice == 3){
        System.out.println("Let me grab you a coffee.");
        }
    }
}
