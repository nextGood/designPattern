package decorate;

/**
 * Created by nextGood on 2017/9/22.
 */
public class ConcreteComponent implements Component {

    @Override
    public void show(String value) {
        System.out.println(value);
    }
}
