// 1、对输入的字符串进行加解密，并输出。
// 2、加密方法为：
// 当内容是英文字母时则用该英文字母的后一个字母替换，
//同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
// 当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
// 其他字符不做变化。
// 3、解密方法为加密的逆过程。

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 密码加密29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temIn;
        while ((temIn = br.readLine())!=null) {
            String temOut = br.readLine();
            List<Character> listIn = new ArrayList<>();
            List<Character> listOut = new ArrayList<>();
            //char chartem=' ';
            for (int i = 0; i < temIn.length(); i++) {
                int charInt = temIn.charAt(i);
                if (charInt>='0'&&charInt<'9'){
                    listIn.add((char) (charInt+1));
                }
                else if(charInt=='9'){
                    listIn.add('0');
                }
                else if(charInt>='A'&&charInt <'Z'){
                    listIn.add((char) (charInt+33));
                }
                else if(charInt =='Z'){
                    listIn.add('a');
                }
                else if(charInt>='a'&&charInt <'z'){
                    listIn.add((char) (charInt-31));
                }
                else if(charInt =='z'){
                    listIn.add('A');
                }
                else {
                    listIn.add(temIn.charAt(i));
                }
            }
            for (int i = 0; i < temOut.length(); i++) {
                int charInt = temOut.charAt(i);
                if (charInt>'0'&&charInt<='9'){
                    listOut.add((char) (charInt-1));
                }
                else if(charInt=='0'){
                    listOut.add('9');
                }
                else if(charInt>'A'&&charInt <='Z'){
                    listOut.add((char) (charInt+31));
                }
                else if(charInt =='A'){
                    listOut.add('z');
                }
                else if(charInt>'a'&&charInt <='z'){
                    listOut.add((char) (charInt-33));
                }
                else if(charInt =='a'){
                    listOut.add('Z');
                }
                else {
                    listOut.add(temOut.charAt(i));
                }
            }
            for (Character character : listIn) {
                System.out.print(character);
            }
            System.out.print("\n");
            for (Character character : listOut) {
                System.out.print(character);
            }
            System.out.print("\n");
            
        }
    }
}
