package blog.strategy;

/**
 * 折扣优惠实现类
 * Created by nextGood on 2017/9/21.
 */
public class CashRebate implements CashSuper {

    public Integer number_1;

    public CashRebate(Integer number_1) {
        this.number_1 = number_1;
    }

    @Override
    public Double getResult(Double money) {
        if (number_1 <= 0.0) {
            return money;
        }
        return money * number_1 / 100;
    }
}