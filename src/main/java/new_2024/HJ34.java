package new_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/***
 * @ClassName: HJ34
 * @Description:
 * @Auther: tanggy3
 * @Date: 14:37 2024/1/12
 * @version : V1.0
 */
public class HJ34 {
    public static void main(String[] args) {
        int a = 'a';
        char c = 72;
        System.out.println(a);
        System.out.println(c);
        test();
    }

    public static void test() {
        String inPut = "Ihave1nose2hands10fingers";
        ArrayList<Integer> integers = new ArrayList<Integer>(inPut.length());
        //获取到数字数组
        for (int i = 0; i < inPut.length(); i++) {
            int c = inPut.charAt(i);
            integers.add(c);
        }
        /**
         * 排序冒泡
         */
        List<Integer> collect = integers.stream().sorted().collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        collect.forEach((bean) -> {
            char i = (char)bean.intValue();
            stringBuilder.append(i);
        });
        System.out.println(stringBuilder.toString());
    }
}
