import java.util.*;
public class suminstring {    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        int sum=0;
        for(int i =0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                sum+=Character.getNumericValue(ch[i]);
            }
        }
        System.out.println(sum);
    }
}
