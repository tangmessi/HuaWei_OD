package new_2024;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/***
 * @ClassName: HJ_31
 * @Description:
 * @Auther: tanggy3
 * @Date: 17:15 2024/1/11
 * @version : V1.0
 */
public class HJ_31 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String strIn = sc.nextLine();
        String regEx = "[^a-zA-Z]+";
        String[] split = strIn.split(regEx);
        Stack<String> stack = new Stack<>();
        Arrays.stream(split).forEach(
                bean -> {
                    stack.push(bean);
                }
        );
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }


    void test(){
        String regEx = "[^a-zA-Z]+";
        Pattern p1 = Pattern.compile(regEx);
        Matcher matcher = p1.matcher("fdsaf45hdfg.grfg.,.ihjkh43KJGKHJgh");
        /**
         * 这里每次调用matcher.find()后正则才会继续往下匹配，
         * 所以这是标准写法可以记录下来
         */
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        String[] split = "fdsaf45hdfg.grfg.,.ihjkh43KJGKHJgh".split(regEx);
        Stack<String> stack = new Stack<>();
        Arrays.stream(split).forEach(
                bean -> {
                    stack.push(bean);//入栈，
                }
        );
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());//出栈
        }
    }
}
