package blog.decorate;

/**
 * Created by nextGood on 2017/9/22.
 */
public class ConcreteDecorateA extends Decorate {

    public ConcreteDecorateA(Component component) {
        super(component);
    }

    @Override
    public void show(String value) {
        super.show(value);
        showA(value);
    }

    public void showA(String value) {
        System.out.println(value.length());
    }
}
