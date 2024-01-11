package old;//实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。
//输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
//注意每个输入文件有多组输入，即多个字符串用回车隔开

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 删除最少字符23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String StrIn;
        while ((StrIn = br.readLine())!=null) {
            HashMap<String,Integer> HMWord = new HashMap<>();
            int WordNum = StrIn.length();


            //放入map，并标记频率
            for (int i = 0; i < WordNum; i++) {
                int count = 1;
                String OneStr = StrIn.substring(i, i+1);
                if(HMWord.containsKey(OneStr)){
                    count = HMWord.get(OneStr)+1;
                    HMWord.put(OneStr, count);
                }
                else{
                    HMWord.put(OneStr, count);
                }
            }

            //把所有的频率也就是value放入list1数组
            ArrayList<Integer> list1 = new ArrayList<>();
            int j =0;
            for (int i : HMWord.values()) {
                list1.add(i);
            }

            //对list1排序,对ArrayList排序用Collections.sort(list1);！！
            Collections.sort(list1);
            int min = list1.get(0);

            //当key对应的value为min时加入删除列表
            ArrayList<String> DELlist = new ArrayList<>();
            for (String str1 : HMWord.keySet()) {
                //对map得到key对应的value用get！！
                if (HMWord.get(str1)==min) {
                    DELlist.add(str1);
                }
                else{
                    continue;
                }
            }

            //遍历删除列表替换原来字符串
            for (String str2 : DELlist) {
                StrIn=StrIn.replaceAll(str2, "");
            }
            System.out.println(StrIn);
            br.close();
        }
    }
}
