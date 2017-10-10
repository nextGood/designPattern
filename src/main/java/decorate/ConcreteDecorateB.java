package decorate;

/**
 * Created by nextGood on 2017/9/22.
 */
public class ConcreteDecorateB extends Decorate {

    public ConcreteDecorateB(Component component) {
        super(component);
    }

    @Override
    public void show(String value) {
        super.show(value);
        showB(value);
    }

    public void showB(String value) {
        System.out.println(value.hashCode());
    }
}
