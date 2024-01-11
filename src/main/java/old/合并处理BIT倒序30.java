package old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class 合并处理BIT倒序30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temLine;
        while (!(temLine = br.readLine()).equals("0")) {
            String[] lineList = temLine.split(" ");
            StringBuffer stringBuffer = new StringBuffer();

            //去除空格合成新字符串
            for (String string : lineList) {
                stringBuffer.append(string);
            }

            //临时字符串，用于存放排序好的字符串
            StringBuffer strTem  = new StringBuffer();

            //创建奇数索引列表
            List<Character> oddList = new ArrayList<>();

            //创建偶数索引列表
            List<Character> evenList = new ArrayList<>();

            //遍历去除空格的字符串，分别按照奇数偶数存放，0也是偶数
            for (int i = 0; i < stringBuffer.length(); i++) {
                //int j = i+1;
                if (i%2 ==0) {
                    evenList.add(stringBuffer.charAt(i));
                }
                else{
                    oddList.add(stringBuffer.charAt(i));
                }
            }

            //对奇数偶数列表进行排序
            Collections.sort(oddList);
            Collections.sort(evenList);

            //排序好的字符重新插入对应的奇数偶数位置
            int oddLength = oddList.size();
            int evenLength = evenList.size();
            if (oddLength==evenLength) {
                for (int i = 0; i < oddLength; i++) {
                    strTem.append(evenList.get(i));
                    strTem.append(oddList.get(i));
                }
            }
            //偶数字符大于奇数时注意最后一个偶数的处理
            else {
                for (int i = 0; i < oddLength; i++) {
                    strTem.append(evenList.get(i));
                    strTem.append(oddList.get(i));
                }
                strTem.append(evenList.get(evenLength-1));
            }

            //笨办法啊但是快，提前准备好0——F转换后的字符
            String helper = "084C2A6E195D3B7F";
            StringBuffer strFinal = new StringBuffer();

            //遍历临时字符串，处理十六进制
            for (int i = 0; i < strTem.length(); i++) {
                int temCharNum = strTem.charAt(i);
                if (temCharNum<='9'&&temCharNum>='0') {
                    strFinal.append(helper.charAt(temCharNum-48));
                }
                else if(temCharNum>='a'&&temCharNum<='f'){
                    strFinal.append(helper.charAt(temCharNum-97+10));
                }
                else if(temCharNum>='A'&&temCharNum<='F'){
                    strFinal.append(helper.charAt(temCharNum-65+10));
                }
                //其他字符直接插入
                else {
                    strFinal.append(strTem.charAt(i));
                }
            }
            System.out.println(strFinal);
        }
    }
}
