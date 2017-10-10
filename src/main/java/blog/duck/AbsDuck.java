package blog.duck;

/**
 * 鸭子抽象类
 * Created by nextGood on 2017/9/22.
 */
public abstract class AbsDuck implements IDuck, IAnimal {

    @Override
    public void swim() {
        System.out.println("common swim");
    }

    @Override
    public void run() {
        System.out.println("common run");
    }

    @Override
    public void eat() {
    }

    public void commonRun() {
        System.out.println("common run on land");
    }
}
