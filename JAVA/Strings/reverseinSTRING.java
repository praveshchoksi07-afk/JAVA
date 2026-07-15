import java.util.*;
public class reverseinSTRING{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder result=new StringBuilder();
        int i =str.length()-1;
        while(i>=0){
            while(i>=0 && str.charAt(i)==' '){
                i--;
            }
            int end=i;
            while(i>=0 && str.charAt(i)!=' '){
                i--;
            }
            String word= str.substring(i+1,end+1);
            if(!result.isEmpty()){
                result.append(" ");
            }
            result.append(word);
        }
        System.out.println(result.toString());
    }
}