package old;//有一只兔子，从出生后第3个月起每个月都生一只兔子，
//小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 斐波那契37 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine())!=null){
            int month = Integer.parseInt(str);
            int a = 1;
            int b = 1;
            while(month>=3){
                int tem =0;
                tem = a;
                a =b;
                b +=tem;
                month--;
            }
            System.out.println(b);
        }
    }
}
