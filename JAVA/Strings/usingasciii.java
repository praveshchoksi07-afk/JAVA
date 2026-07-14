import java.util.*;
public class usingasciii {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(ch[i]>='a'&& ch[i]<='z'){
                System.out.println((char)(ch[i]-32));
            }
        }
    }

}
