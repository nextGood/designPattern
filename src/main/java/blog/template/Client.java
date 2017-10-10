package blog.template;

/**
 * 客户端
 * Created by nextGood on 2017/10/9.
 */
public class Client {

    public static void main(String[] args) {
        double capital = 5230.52;
        IAccount moneyMarketAccount = new MoneyMarketAccount();
        Double interest = moneyMarketAccount.calculateInterest(capital);
        System.out.println("货币市场账号利息为：" + interest);
        Double amount = moneyMarketAccount.calculateAmount(capital);
        System.out.println("货币市场账号总额为：" + amount);
    }
}