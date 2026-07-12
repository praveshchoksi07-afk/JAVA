import java.util.Scanner;
public class threedigitnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0){
            temp=num%10;
            sum+=temp;
            num/=10;
        }
        System.out.println("the sum of the number is"+sum);
    }
}