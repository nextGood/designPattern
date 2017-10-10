package blog.template;

/**
 * 货币市场账号
 * Created by nextGood on 2017/10/9.
 */
public class MoneyMarketAccount extends AbsAccount {

    @Override
    public Double doCalculateInterestRate() {
        return 0.045;
    }
}