package blog.duck;

/**
 * mallard duck
 * Created by nextGood on 2017/9/22.
 */
public class MallardDuck extends AbsDuck {

    @Override
    public void quack() {
        System.out.println("mallard duck quack");
    }

    @Override
    public void fly() {
        System.out.println("mallard duck fly");
    }

    @Override
    public void run() {
        commonRun();
    }
}
