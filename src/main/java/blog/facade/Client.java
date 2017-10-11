package blog.facade;

/**
 * 外观模式
 * <p/>
 * 摘自http://blog.csdn.net/jason0539/article/details/22775311
 * <p/>
 * 实际项目例子：民贷天下-消费金融-征信网关对接闪银、蜜罐、同盾、蚂蚁征信报告接口，Facade类封装这些外部接口并向外提供统一访问入口，
 * Client既不需要亲自调用这些接口也不需要关注接口内部实现细节，甚至不需要关注外部接口的存在，只需跟Facade类交互即可。可以让Client更好地使用网关系统。
 * <p/>
 * Created by nextGood on 2017/10/10.
 */
public class Client {

    public static void main(String[] args) {
        Facade.test();
    }
}