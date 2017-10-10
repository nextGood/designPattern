package blog.proxy;

/**
 * 代理对象角色
 * Created by nextGood on 2017/9/29.
 */
public class ProxyObject extends AbstractObject {

    private RealObject realObject;

    public ProxyObject() {
    }

    public ProxyObject(RealObject realObject) {
        this.realObject = realObject;
    }

    @Override
    public void operate() {
        if ("vip".equals(realObject.getRight())) {
            realObject.operate();
        } else {
            System.out.println(realObject.getName() + " not vip");
        }
    }
}
