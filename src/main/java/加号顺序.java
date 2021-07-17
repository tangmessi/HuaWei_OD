public class 加号顺序 {
    public static void main(String[] args) {
        int a = 1;
        //加在前先加在运算，＋在后先计算再加
        System.out.println(a++ + a++);//(5+1)+5 = 11
        System.out.println("a="+a);
        System.out.println(a++ + ++a);//
        System.out.println("a="+a);
        System.out.println(++a + a++);
        System.out.println("a="+a);
        System.out.println(++a + ++a);
        System.out.println("a="+a);
    }
}
