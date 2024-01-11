package old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 字符串按照字母排序 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String tem;
        while ((tem = bufferedReader.readLine()) != null) {
            List<String> newString = new ArrayList<>();
            for (int i = 'a'; i < 'z'; i++) {
                for (int j = 0; j < tem.length(); j++) {
                    int k = tem.charAt(j);
                    if (k == i || k == i - 32) {
                        newString.add(String.valueOf(tem.charAt(j)));
                    }
                }
            }
            for (int m = 0; m < tem.length(); m++) {
                char charTem = tem.charAt(m);
                if ((charTem < 'A' || charTem > 'z') || (charTem > 'Z' && charTem < 'a')) {
                    newString.add(m, String.valueOf(charTem));
                }
            }
            for (String string : newString) {
                System.out.print(string);
            }
            System.out.println("");
        }

    }
}

