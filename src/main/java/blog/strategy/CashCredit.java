package blog.strategy;

/**
 * 积分优惠实现类
 * Created by nextGood on 2017/9/21.
 */
public class CashCredit implements CashSuper {

    public Integer number_1;
    public Integer number_2;

    public CashCredit(Integer number_1, Integer number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    @Override
    public Double getResult(Double money) {
        return null;
    }
}
