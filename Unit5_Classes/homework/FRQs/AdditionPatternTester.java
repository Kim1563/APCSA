package Unit5_Classes.homework.FRQs;

public class AdditionPatternTester {
    public static void main(String[] args) {
        AdditionPattern plus3 = new AdditionPattern(2, 3);

        System.out.println(plus3.currentNumber());
        plus3.next();
        System.out.println(plus3.currentNumber());
        plus3.next();
        plus3.next();
        System.out.println(plus3.currentNumber());
        plus3.prev();
        plus3.prev();
        plus3.prev();
        System.out.println(plus3.currentNumber());
        plus3.prev();
        System.out.println(plus3.currentNumber());
    }
}
