import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/2/10.
 */
public class TestThis {
    public static void main(String[] args) throws Exception {
        // 提取到被注解的方法Method，这里用到了反射的知识
        Method method = Class.forName("OneClass").getDeclaredMethod("oneMethod");
        // 从Method方法中通过方法getAnnotation获得我们设置的注解
        OneAnnotation oneAnnotation = method.getAnnotation(OneAnnotation.class);

        // 得到注解的俩参数
        System.out.println(oneAnnotation.parameter1());
        System.out.println(oneAnnotation.parameter2());
    }
}
