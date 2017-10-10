package blog.simpleFactory;

public class OperationFactory {

    public static Operation createOperation(String operate) throws Exception {
        if ("+".equals(operate)) {
            return new OperationAdd();
        } else if ("-".equals(operate)) {
            return new OperationSub();
        } else if ("*".equals(operate)) {
            return new OperationMul();
        } else if ("/".equals(operate)) {
            return new OperationDiv();
        }
        throw new Exception("输入的操作符不合法。");
    }
}