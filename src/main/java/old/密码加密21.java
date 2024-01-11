package old;

import java.util.Scanner;
import java.util.regex.*;

/*声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，
如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。*/
public class 密码加密21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String StrIn = sc.nextLine();
        Pattern p1 = Pattern.compile("[A-Z]");
        Pattern p2 = Pattern.compile("[a-z]");
        Pattern p3 = Pattern.compile("[^\\w]|\\d");
        int length = StrIn.length();
        for (int i = 0; i < length; i++) {
            String word = StrIn.substring(i, i+1);
            Matcher m1 = p1.matcher(word);
            Matcher m2 = p2.matcher(word);
            Matcher m3 = p3.matcher(word);

            //处理大写
            if (m1.find()==true) {
                String word1 = word.toLowerCase();
                char char1 = word1.charAt(0);
                int byteAscii1 = (int) char1 ;
                int byteAscii2;
                if (byteAscii1 == 122){
                    byteAscii2 = 97;
                }
                else {
                    byteAscii2 = byteAscii1+1;
                }
                char OutWord = (char) byteAscii2;
                System.out.print(OutWord);
            }

            //处理小写
            //A.contains(B),表示A里是否包含B
            else if (m2.find()==true){
                if ("abc".contains(word)){
                    System.out.print(2);
                }
                else if ("def".contains(word)){
                    System.out.print(3);
                }
                else if ("ghi".contains(word)){
                    System.out.print(4);
                }
                else if ("jkl".contains(word)){
                    System.out.print(5);
                }
                else if ("mno".contains(word)){
                    System.out.print(6);
                }
                else if ("pqrs".contains(word)){
                    System.out.print(7);
                }
                else if ("tuv".contains(word)){
                    System.out.print(8);
                }
                else if("wxyz".contains(word)){
                    System.out.print(9);
                }
            }
            else {
                System.out.print(word);
            }
        }
        sc.close();
    }
}
