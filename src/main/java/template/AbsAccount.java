package template;

import java.math.BigDecimal;

/**
 * Created by nextGood on 2017/10/9.
 */
public abstract class AbsAccount implements IAccount {

    @Override
    public Double calculateInterest(Double capital) {
        Double interestRate = doCalculateInterestRate();
        //由于Java的简单类型不能够精确的对浮点数进行运算，BigDecimal提供精确的浮点数运算，包括加减乘除和四舍五入
        return new BigDecimal(capital).multiply(new BigDecimal(interestRate)).doubleValue();
    }

    @Override
    public Double calculateAmount(Double capital) {
        //由于Java的简单类型不能够精确的对浮点数进行运算，BigDecimal提供精确的浮点数运算，包括加减乘除和四舍五入
        return new BigDecimal(capital).add(new BigDecimal(calculateInterest(capital))).doubleValue();
    }

    /**
     * 获取不同帐号类型的利息，由子类实现
     *
     * @return
     */
    public abstract Double doCalculateInterestRate();
}