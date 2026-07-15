import java.util.*;
public class rotateString{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String goal=sc.nextLine();
        if(str.length()!=goal.length()){
            System.out.println("FALSE");
        }
        else{
            for(int i =0 ;i<str.length();i++){
                String rotated=str.substring(i,str.length())+str.substring(0,i);
                if(rotated.equals(goal)){
                    System.out.println("True");
                }
            }
        }
    }
}