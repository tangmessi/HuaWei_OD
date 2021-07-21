import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 密码{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String tem;
        while((tem = bufferedReader.readLine())!=null){
            List<Character> newString = new ArrayList<>();
            for(int i = 'a'; i <= 'z'; i++){
                for(int j = 0; j < tem.length(); j++){
                    int k = tem.charAt(j);
                    if(k == i || k == i-32){
                        newString.add(tem.charAt(j));
                    }
                }
            }
            for(int k = 0; k < tem.length(); k++){
                char charTem = tem.charAt(k);
                if((charTem<'a' && charTem>'Z') || (charTem<'A' || charTem>'z')){
                    newString.add(k,charTem);
                }
            }
            for (Character character : newString) {
                System.out.print(character);
            }
            System.out.println("");

            
        }
    }
}