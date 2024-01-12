package new_2024;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/***
 * @ClassName: HJ33
 * @Description:
 * @Auther: tanggy3
 * @Date: 9:26 2024/1/12
 * @version : V1.0
 */
public class HJ33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            test1(sc.nextLine());
            test2(sc.nextLine());
        }
        test2("167773121");
    }


    /**
     * ip转换10进制
     */
    static void test1(String ip) {
        String[] split = ip.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            Integer integer = Integer.valueOf(split[i]);
            //将integer转化为二进制
            String binary = Integer.toBinaryString(integer);
            Integer integer1 = Integer.valueOf(binary);
            //将string用0填充到8位

            String format = String.format("%08d", integer1);//这里只能格式化数字类型的，所以需要先转换
            stringBuilder.append(format);

        }

        //31-x
        Integer i = -1;
        ArrayList<Integer> integers = new ArrayList<>();
        do {
            i = stringBuilder.indexOf("1", i + 1);
            integers.add(31 - i);//计算出应该的幂次方
        }
        while (i != -1);

        long sum = 0;
        for (int l = 0; l < integers.size() - 1; l++) {
            Integer integer = integers.get(l);
            //计算2的integer次方
            double pow = Math.pow(2, integer);
            sum += (long) pow;
            //double转int

        }

        System.out.println(sum);//从指定处开始，包含指定处
        System.out.println(stringBuilder.toString());
    }


    /**
     * 10进制转换ip
     */

    static void test2(String value) {
        String s = Long.toBinaryString(Long.valueOf(value));
        Stack<Integer> integers = new Stack<>();
        for (int i = 1; i < 5; i++) {
            int tmp = s.length() - (i - 1) * 8;
            String substring = s.substring(tmp - 8 > 0 ? tmp - 8 : 0, tmp);//从后往前，因为前面补0的问题
            Integer i1 = Integer.parseInt(substring, 2);//快捷转换进制的方法
            integers.push(i1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            Integer pop = integers.pop();
            /**
             * 转换位十进制
             */
            int num = Integer.parseInt(pop.toString(), 10);
            stringBuilder.append(num);
            if (i < 3) {
                stringBuilder.append(".");
            }
        }
        System.out.println(stringBuilder.toString());

    }
}
