package strategy;

/**
 * 测试
 * Created by nextGood on 2017/9/21.
 */
public class Test {

    public static void main(String[] args) {
        try {
            CashContext cashContext = new CashContext("rebate", 95, 0);
            System.out.println(cashContext.getResult(400.00));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}