package problem2.main;

import problem2.food.decorator.cheese.Cheese;
import problem2.food.factory.AbstractFoodFactory;
import problem2.food.factory.FoodFactoryProducer;
import problem2.food.foodInterface.Food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AbstractFoodFactory abstractFoodFactory;
        while(true){
            try {
                System.out.println("Welcome!! Please order your meal");
                System.out.print("Enter the burger type (veggi/chicken/beef): ");
                String burger = sc.next();
                abstractFoodFactory = FoodFactoryProducer.getFoodFactory("burger");
                Food food = abstractFoodFactory.getBurger(burger);
                System.out.print("Enter the appetizer type (french-fries/onion-rings/no): ");
                String appetizer = sc.next();
                if(!appetizer.equalsIgnoreCase("no")){
                    abstractFoodFactory  = FoodFactoryProducer.getFoodFactory("appetizer");
                    food = abstractFoodFactory.getAppetizer(appetizer,food);
                }
                System.out.print("Do you want cheese? (yes/no): ");
                String cheese = sc.next();
                if(!cheese.equalsIgnoreCase("no")){
                    food = new Cheese(food);
                }
                System.out.print("Enter the number of drink you want: ");
                int count = sc.nextInt();
                for(int i=0;i<count;i++){
                    System.out.print("Enter the "+(i+1)+"-th drink type (coffee/coke/water): ");
                    String drink = sc.next();
                    abstractFoodFactory  = FoodFactoryProducer.getFoodFactory("drink");
                    food = abstractFoodFactory.getDrink(drink,food);
                }

                System.out.println("Your meal is: "+ food.prepareFood());
                System.out.println("Price: "+food.price()+"$");

            }catch (Exception e){
                System.out.println("something went wrong... try again");
            }

            System.out.println("---------------------------------------------");
        }
    }
}
