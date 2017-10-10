package duck;

/**
 * Created by nextGood on 2017/9/22.
 */
public class Test {

    public static void main(String[] args) {
        IDuck mallardDuck = new MallardDuck();
        mallardDuck.swim();
        mallardDuck.run();
    }
}
