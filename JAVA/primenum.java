import java.util.Scanner;
class Prime{
    int countnum(int num){
        int temp=num;
        int sum=0;
        while(num>0){
            temp=num%10;
            sum+=temp;
            num/=10;
        }
        return sum;
    }
};
public class primenum{
    public static void main(String [] args){
        Prime prim=new Prime();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number n");
        int n =sc.nextInt();
        for(int i=2;i<=n;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }

            }    
            if(flag==0){
                System.out.println(i);
                System.out.println("THe sum of the prime number"+i+"is"+prim.countnum(i));
            }
        }
    }
}