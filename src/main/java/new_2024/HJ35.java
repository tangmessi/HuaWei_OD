package new_2024;

import java.util.*;

/***
 * @ClassName: HJ35
 * @Description: 二位数组
 * @Auther: tanggy3
 * @Date: 14:55 2024/1/12
 * @version : V1.0
 */
public class HJ35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            test(a);
        }
    }


    /**
     * 这里用二维数组就很好解决，先根据坐标按顺序填充值，然后再遍历二维数组
     * @param num
     */
    public static void test(int num) {
        int[][] arr = new int[num][num];
        int sum = 1;
        int tmp = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < tmp; j++) {
                arr[tmp - j - 1][j] = sum;
                sum++;
            }
            tmp++;
        }
        //遍历二维数组
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (0 != arr[i][j]) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
