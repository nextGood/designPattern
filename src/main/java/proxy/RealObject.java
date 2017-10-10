package proxy;

/**
 * 真实对象角色
 * Created by nextGood on 2017/9/29.
 */
public class RealObject extends AbstractObject {

    private String name;
    private String right;

    public RealObject() {
    }

    public RealObject(String name, String right) {
        this.name = name;
        this.right = right;
    }

    @Override
    public void operate() {
        System.out.println(this.name + " operate ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
}