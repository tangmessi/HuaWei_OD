/*
请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。

所有的IP地址划分为 A,B,C,D,E五类

A类地址1.0.0.0~126.255.255.255;

B类地址128.0.0.0~191.255.255.255;

C类地址192.0.0.0~223.255.255.255;

D类地址224.0.0.0~239.255.255.255；

E类地址240.0.0.0~255.255.255.255


私网IP范围是：

10.0.0.0～10.255.255.255

172.16.0.0～172.31.255.255

192.168.0.0～192.168.255.255
*/


import java.io.*;

public class IPDeal18 {
    public static void main(String[] args) throws IOException {
        System.out.println("开始");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=0,c=0,d=0,e=0,err=0,pri=0;
        String str;
        while((str=bf.readLine())!=null){
            System.out.println(str);
        }
        //System.out.println("list1");
    }
}
/*
10.70.44.68~255.254.255.0
1.0.0.1~255.0.0.0
192.168.0.2~255.255.255.0
19..0.~255.255.255.0
*/
