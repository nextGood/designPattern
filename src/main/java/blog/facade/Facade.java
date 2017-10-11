package blog.facade;

/**
 * 门面角色，可以有选择性地暴露方法
 * Created by nextGood on 2017/10/10.
 */
public class Facade {

    public static void test() {
        new ModuleA().test();
        new ModuleB().test();
        new ModuleC().test();
    }
}