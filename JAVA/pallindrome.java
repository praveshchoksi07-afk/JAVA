import java.util.Scanner;
public class pallindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int temp =num;
        int r=num;
        int rev=0;
        while(num>0){
            r=num%10;
            rev=(rev*10)+r;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("it is a pallindrome");
        }
        else{
            System.out.println("it is not a pallindrome");
        }

    }
}