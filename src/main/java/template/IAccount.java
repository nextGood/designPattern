package template;

/**
 * Created by nextGood on 2017/10/9.
 */
public interface IAccount {

    /**
     * 计算利息
     *
     * @param capital 本金
     * @return
     */
    Double calculateInterest(Double capital);

    /**
     * 计算总额
     *
     * @param capital 本金
     * @return
     */
    Double calculateAmount(Double capital);

}