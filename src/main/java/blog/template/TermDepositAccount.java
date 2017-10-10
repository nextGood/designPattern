package blog.template;

/**
 * 定期存款账号
 * Created by nextGood on 2017/10/9.
 */
public class TermDepositAccount extends AbsAccount {

    @Override
    public Double doCalculateInterestRate() {
        return 0.06;
    }
}