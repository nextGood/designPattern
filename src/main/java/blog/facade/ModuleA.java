package blog.facade;

/**
 * 子系统角色
 * Created by nextGood on 2017/10/10.
 */
public class ModuleA {

    /**
     * 供外部系统使用
     */
    public void test() {
        System.out.println("moduleA");
    }

    /**
     * 内部系统使用，对外系统屏蔽
     */
    public void innerTest() {
        System.out.println("moduleA");
    }
}