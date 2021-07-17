import java.io.*;
import java.util.ArrayList;

/*1.长度超过8位

2.包括大小写字母.数字.其它符号,以上四种至少三种

3.不能有相同长度大于2的子串重复*/
public class HW_HJ20{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        ArrayList<String> list1 = new ArrayList<>();
        String str;
        while ((str = bf.readLine())!=null) {
            list1.add(str);
        }
        for (String string : list1) {
            System.out.println(string);
        }
    }
}