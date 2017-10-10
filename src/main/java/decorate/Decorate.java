package decorate;

/**
 * Created by nextGood on 2017/9/22.
 */
public class Decorate implements Component {

    Component component;

    public Decorate(Component component) {
        this.component = component;
    }

    @Override
    public void show(String value) {
        component.show(value);
    }
}
