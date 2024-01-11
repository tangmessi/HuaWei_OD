package old;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine())!=null){
            System.out.println(str);
        }

        Scanner sc =new Scanner(System.in);
        while (!sc.hasNext("0")) {
            System.out.println(sc.nextInt());
        }
    }
}
