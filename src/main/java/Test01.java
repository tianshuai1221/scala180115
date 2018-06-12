import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test01 {
    public static void main(String[] args) throws Exception {
//        Thread t1 = new Thread();
//        Thread t2 = new Thread();
//
//        t1.start();
//        t2.start();
//
//        t1.sleep(1000); // 正在,运行的线程（main线程）休眠。
//        t2.wait(1000); // t2线程等待

        //System.out.println(User.i);

        // 不可变字符串
        //String s = " a b ";
        //s = s.trim();
        //System.out.println("!"+s+"!");
        /*
        User user = new User();
        user.setUsername("123");

        User user1 = new User();

        request.setAttribute("user", User);
        out.println(user);
        */
        //int i, y = 2;
        //System.out.println(i);
        /*
        int i = 1;
        i = (i++); // (_a <= i++); i = _a
        System.out.println(i);
        */
        /*
        // 同步
        synchronized () {
            synchronized() {

            }
        }

        // JUC
        ReentrantReadWriteLock lock = new  ReentrantReadWriteLock();
        lock.writeLock().lock();
        */

        // 空指针异常出现的原因
        // 1）调用为null对象的成员属性或成员方法
        // 2）自动拆箱时，如果包装类为null，会出现空指针异常
        // 3) 增强for循环，集合为null
        //Student s = new Student();
        //s = null;
        //System.out.println(s.name);

        //Integer i = null;
        //int i1 = i * 100;
        //print(i);

        List list = null;
        for (Object obj : list) {
            System.out.println(obj);
        }

    }

    public static void print( int i ) {
        System.out.println(i);
    }
}
class Student {
    public static String name = "zhangsan";
}