package blog.simpleFactory;

/**
 * 说明：简单工厂模式
 * 介绍：http://www.cnblogs.com/java-my-life/archive/2012/03/22/2412308.html
 * 时间：2017-09-21
 * 码者：nextGood
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