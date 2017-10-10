package blog.strategy;

/**
 * 满返优惠实现类
 * Created by nextGood on 2017/9/21.
 */
public class CashReturn implements CashSuper {

    public Integer number_1;
    public Integer number_2;

    public CashReturn(Integer number_1, Integer number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    @Override
    public Double getResult(Double money) {
        if (money >= number_1) {
            return money - number_2;
        }
        return money;
    }
}
