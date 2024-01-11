package old;

import java.util.Scanner;

public class 喝3饮料22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (!sc.hasNext("0"))  {
            int InStr = sc.nextInt();
            if (InStr>=2)
            System.out.println(InStr/2);
        }
        sc.close();
    }
}
