package blog.simpleFactory;

/**
 * 简单工厂模式
 * 2017-09-21
 */
public class Test {

    public static void main(String[] args) {
        try {
            Operation operation = OperationFactory.createOperation("/");
            double result = operation.getResult(2.0, 3.0);
            System.out.println("The result is " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}