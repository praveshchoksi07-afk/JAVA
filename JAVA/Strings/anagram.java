import java.util.*;
public class anagram {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings:");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int found=0;
        /*sort(str1.begin(),str1.end());
        sort(str2.begin(),str2.end()); C++*/
        char[] ch=str1.toCharArray();
        char[] ch1=str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i =0 ;i<str1.length();i++){
            if(str1.length()!=str2.length()){
                System.out.println("not anagram");
                break;
            }
            if(ch[i]!=ch1[i]){
                found=1;
                System.out.println("Not anagrams of each other");
                break;
            }
        }
        if(found==0){
            System.out.println("Both the strings are anagram of each other");
        }
            
    }
}
