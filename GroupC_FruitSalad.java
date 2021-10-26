package comp1130;

import java.util.Scanner;

public class GroupC_FruitSalad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grape gp = new Grape();
        Orange og = new Orange();
        int counter = 0;

        //while loop begins
        String verify = "Y";
        while (verify.equals("Y")||verify.equals("y"))
        {
            System.out.println("Welcome to Team C Fruit Salad maker! \nPlease enter how many grams of Grapes you want in your salad");
            gp.setWeight(sc.nextFloat());            //Input weight for grapes by user
            System.out.println("How many grams of oranges would you like?");
            og.setWeight(sc.nextFloat());            //Input weight for oranges by user

            //Total math calculation
            float total = gp.getWeight() + og.getWeight();

            //conditions
            if (gp.getWeight() < 0 || og.getWeight() < 0) {
                System.out.println("Weight cannot be negative. Please try again.");
            }
            else {

                if (gp.getWeight() == 0 && og.getWeight() == 0) {
                    System.out.println("You have no ingredients.");
                }
                else {
                    System.out.print("Thank you for you order! Your fruit salad is ready.\nTotal weight of your salad is " + total + "g Ingredients: ");

                    if (gp.getWeight() != 0 && og.getWeight() != 0) {
                        System.out.print("Grape, orange.");
                    }
                    else if (gp.getWeight() == 0) {
                        System.out.print("Oranges.");
                    }
                    else {
                        System.out.print("Grapes."); 
                    }
                }
            }
            System.out.println("\nWould you like to order another salad?(Y/N)");
            verify = sc.next();
            counter++;
            if (verify.equals("N")||verify.equals("n")){
                System.out.println("Thank you for your order!");
                
            }
        }
        System.out.println("You have ordered "+counter+" salads");
        System.out.println("Have a great day ahead:)");
    }


}