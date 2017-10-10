package blog.proxy;

/**
 * 测试
 * Created by nextGood on 2017/9/29.
 */
public class Test {

    public static void main(String[] args) {
        RealObject realObject = new RealObject("mike", "vp");
        ProxyObject proxyObject = new ProxyObject(realObject);
        proxyObject.operate();
    }
}