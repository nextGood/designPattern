package decorate;

/**
 * Created by nextGood on 2017/9/22.
 */
public class Test {

    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.show("me");

        ConcreteDecorateA concreteDecorateA = new ConcreteDecorateA(concreteComponent);
        ConcreteDecorateB concreteDecorateB = new ConcreteDecorateB(concreteDecorateA);
        concreteDecorateB.show("B");
    }
}
