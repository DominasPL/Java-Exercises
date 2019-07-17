package Test.TestExercise;

public class Main {

    public static void main(String[] args) {


        Basket basket = new Basket();
        Item item = new Item("Watermelon", 10.50);
        Item item1 = new Item("Pineapple", 15.40);
        Item item2 = new Item("Apple", 5.25);

        basket.addItemToBasket(item, 2);
        basket.addItemToBasket(item1, 5);
        basket.addItemToBasket(item2, 20);

        basket.removeItemFromBasket(item1, 5);

//        System.out.println(basket.countBasketValue());

        System.out.println(basket);

    }


}
