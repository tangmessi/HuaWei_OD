package old;/*1.长度超过8位

2.包括大小写字母.数字.其它符号,以上四种至少三种

3.不能有相同长度大于2的子串重复*/
import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;
public class 密码验证20{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        ArrayList<String> list1 = new ArrayList<>();
        String str;
        while ((str = bf.readLine())!=null) {
            list1.add(str);
        }
        for (String string : list1) {
        }
    }
}
