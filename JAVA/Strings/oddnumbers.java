import java.util.*;
public class oddnumbers {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int index=-1;
        int i =0;
        String result="";
        for(int i=str.length();i>0;i--){
            if(str.charAt(i)%2!=-1){
                index=i;
                break;
            }
        }
        if (index==-1){
            System.out.println("No odd number found");
        }
        else{
            System.out.println("The last odd number is: "+str.charAt(index));
        }

        while(i<=index && str.charAt(i)== ' '){
            i++;
        }
        result=str.substring(i,index+1);
        System.out.println("The substring is: "+result);

    }
}
