import java.io.FileNotFoundException;

public class Test02 {
    public static void main(String[] args) throws Exception {

        // 阶乘：一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        // 递归：
        // 1）方法自己的逻辑中调用自己
        // 2）递归逻辑中一定要有跳出递归逻辑
        // 3）递归方法在调用自身时传递的参数之间要有规律
        //    1 + 3 + 5 + 7 + 9 + 11
        //    1 + 3423 + 432432 + 432423 + 43242
        //int i = result(5);
        //System.out.println(i);

        /*
        try {

        } catch (Exception e) {

        } catch (IOException e1) {

        } catch (FileNotFoundException e2) {

        }
        */

        result(1);
        int i = 3;

        switch (i) {
            default:

            case 1 :
                System.out.println(i);
                break;
            case 2 :
                System.out.println(i);
                break;
            case 3 :
                System.out.println(i);
                break;
        }
    }

    public static int result(int i) throws Exception {
        if ( i == 1 ) {
            return 1;
        } else {
            return i * result(i-1);
        }
    }

}
