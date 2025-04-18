package problem2.food.factory;


public class FoodFactoryProducer {
    public static AbstractFoodFactory getFoodFactory(String choice){
        if(choice.equalsIgnoreCase("burger")) return new BurgerFactory();
        else if(choice.equalsIgnoreCase("appetizer")) return new AppetizerFactory();
        else if(choice.equalsIgnoreCase("drink")) return new DrinkFactory();
        return null;
    }
}
