import java.io.*;
import java.util.*;

public class HW_HJ19_1 {
    public static void main(String[] args) throws IOException {
        //标准输入流程
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str ;
        ArrayList<String> list1 = new ArrayList<>();//存放初始输入
        ArrayList<String> list2 = new ArrayList<>();//存放分割好的16+数字

        //读取多行输入到list1
        while ((str = bf.readLine())!=null){
            list1.add(str);
        }

        //控制字符到16位；
        String [] tem;
        String TemFor18Char;
        String [] ListFS;
        int FSL;
        int TemNum;
        for (String i:list1) {
            tem = i.split("\\\\");
            TemNum = tem.length -1;
            ListFS = tem[TemNum].split(" ");
            FSL = ListFS[0].length();
            if (FSL>16){
                ListFS[0] = ListFS[0].substring(FSL-16);
            }
            TemFor18Char = ListFS[0]+" "+ListFS[1];
            list2.add(TemFor18Char);
        }


        //计算错误出现次数
        int conut = 1;
        LinkedHashMap<String,Integer> ErrorMap = new LinkedHashMap<>();
        for (String string : list2) {
            if(!ErrorMap.containsKey(string)){
                ErrorMap.put(string, conut);
            }
            else{
                ErrorMap.put(string, ErrorMap.get(string)+1);
            }
        }

        //转化为list输出
        String temstr;
        ArrayList<String> HMList = new ArrayList<String>();
        for (String string : ErrorMap.keySet()) {
            temstr = string + " " + ErrorMap.get(string);
            HMList.add(temstr);
        }

        //输出最后8个错误记录
        int ErrorNum=HMList.size();
        if (ErrorNum>8) {
            for (int i = (ErrorNum - 8); i < ErrorNum; i++) {
                System.out.println(HMList.get(i));
            }
        } else {
            for (String string : HMList) {
                System.out.println(string);
            }
        }
    }
}