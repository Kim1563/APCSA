package Unit2_UsingObjects.homework.WS1;

public class FruitTester {
    public static void main(String[] args){
        Fruit mango = new Fruit("mango", false);
        Fruit pineapple = new Fruit("pineapple", true, 4);

        mango.displayInfo();
        pineapple.displayInfo();

        System.out.println("Your fruit can serve " + mango.getServings() + " person.");
        System.out.println("Your fruit can serve " + pineapple.getServings() + " people.");
    }
}
