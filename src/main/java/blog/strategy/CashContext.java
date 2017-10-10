package blog.strategy;

/**
 * 优惠子类统一实现入口
 * Created by nextGood on 2017/9/21.
 */
public class CashContext implements CashSuper {

    CashSuper cashSuper;

    public CashContext(String cashType, Integer number_1, Integer number_2) throws Exception {
        try {
            if ("rebate".equals(cashType)) {
                cashSuper = new CashRebate(number_1);
            } else if ("return".equals(cashType)) {
                cashSuper = new CashReturn(number_1, number_2);
            } else if ("credit".equals(cashType)) {
                cashSuper = new CashReturn(number_1, number_2);
            } else {
                throw new Exception("参数格式不符合规范。");
            }
        } catch (NullPointerException e) {
            throw new Exception("参数不能为null");
        } catch (Exception e) {
            throw new Exception("参数内容不符合规范。");
        }
    }

    @Override
    public Double getResult(Double money) {
        return cashSuper.getResult(money);
    }
}