
/*
如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2 个附件。
附件不再有从属于自己的附件。王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：
用整数 1 ~ 5 表示，第 5 等最重要。他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。
他希望在不超过 N 元（可以等于 N 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。
设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k 件物品，
编号依次为 j 1 ， j 2 ，……， j k ，则所求的总和为：
v[j 1 ]*w[j 1 ]+v[j 2 ]*w[j 2 ]+ … +v[j k ]*w[j k ] 。（其中 * 为乘号）
请你帮助王强设计一个满足要求的购物单。
*/
import java.util.Scanner;

public class 背包0_1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();//拥有的钱
        int n = sc.nextInt();//希望购买物品个数
        if(n<=0||money<=0) System.out.println(0);
        good[] Something = new good[n+1];//创建一个空间为n+1得good类型的数组
        for (int i = 1; i <= n; i++) {
            int v = sc.nextInt();//物品的价格
            int p = sc.nextInt();// p 表示该物品的重要度（ 1 ~ 5 ）
            int q = sc.nextInt();// q 表示该物品是主件还是附件
            Something[i] = new good(v,p,q);//Something数组里得第i个为实例化得good对象

            //当物品为附件的情况
            if(q>0){
                //q如果大于零那就是代表这个东西是第q个东西的附件
                if(Something[q].a1==0){
                    Something[q].setA1(i);
                //当q.a1不为0时代表了，已经有一个附件了，这时候要添加为第二个附件
                }else {
                    Something[q].setA2(i);
                }
            }
        }

        int[][] TwoDimensionalArray = new int[n+1][money+1];
        //加一是为了下一步跳过的时候，不填充数据默认为零，相当于多了一行一列
        //创建二维数组TwoDimensionalArray
        for (int i = 1; i <= n; i++) {
            //四种购买情况，对应不同的价格
            int v=0,v1=0,v2=0,v3=0,tempdp=0,tempdp1=0,tempdp2=0,tempdp3=0;

            v = Something[i].v;

            tempdp = Something[i].p*v; //只有主件时候的购买性价比

            if(Something[i].a1!=0){//主件加附件1
                //Something[Something[i].a1].v通过附件的标识来确定主件
                v1 = Something[Something[i].a1].v+v;
                //每一个东西对应了一个实例化的good,所以通过Something[Something[i].a1]来确定附件的价格
                //不能通过直接Something[i]
                tempdp1 = tempdp + Something[Something[i].a1].v*Something[Something[i].a1].p;
            }

            if(Something[i].a2!=0){//主件加附件2
                v2 = Something[Something[i].a2].v+v;
                tempdp2 = tempdp + Something[Something[i].a2].v*Something[Something[i].a2].p;
            }

            if(Something[i].a1!=0&&Something[i].a2!=0){//主件加附件1和附件2
                v3 = Something[Something[i].a1].v+Something[Something[i].a2].v+v;
                tempdp3 = tempdp + Something[Something[i].a1].v*Something[Something[i].a1].p + Something[Something[i].a2].v*Something[Something[i].a2].p;
            }

            for(int j=1; j<=money; j++){
                //当物品i是附件时,相当于跳过,等于上一个网格
                //不填充数据时候默认为零
                TwoDimensionalArray[i][j] = TwoDimensionalArray[i-1][j];
                if(Something[i].q > 0) {   
                    continue;
                }
                else {
                    //这个网格的性价比与上一个买这个主件后网格的性价比做比较，大的更新
                    //比较四次相当于四种方式里面比较最具性价比的方式
                    if(j>=v&&v!=0) TwoDimensionalArray[i][j] = Math.max(TwoDimensionalArray[i][j],TwoDimensionalArray[i-1][j-v]+tempdp);
                    if(j>=v1&&v1!=0) TwoDimensionalArray[i][j] = Math.max(TwoDimensionalArray[i][j],TwoDimensionalArray[i-1][j-v1]+tempdp1);
                    if(j>=v2&&v2!=0) TwoDimensionalArray[i][j] = Math.max(TwoDimensionalArray[i][j],TwoDimensionalArray[i-1][j-v2]+tempdp2);
                    if(j>=v3&&v3!=0) TwoDimensionalArray[i][j] = Math.max(TwoDimensionalArray[i][j],TwoDimensionalArray[i-1][j-v3]+tempdp3);
                }
            }
        }
        /* 
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= money; j++) {
                System.out.printf("%6d", TwoDimensionalArray[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------");
        */
        System.out.println(TwoDimensionalArray[n][money]);
        sc.close();
    }


    /**
     * 定义物品类
     */
    private static class good{
        public int v;  //物品的价格
        public int p;  //物品的重要度
        public int q;  //物品的主附件ID

        public int a1=0;   //附件1ID
        public int a2=0;   //附件2ID

        public good(int v, int p, int q) {
            this.v = v;
            this.p = p;
            this.q = q;
        }

        public void setA1(int a1) {
            this.a1 = a1;
        }

        public void setA2(int a2) {
            this.a2 = a2;
        }
    }
}
/*
6 5 
1 1 0
2 3 1
2 2 0
5 5 0
1 2 4
*/