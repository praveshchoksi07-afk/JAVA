import java.util.Scanner;
class numbersintext{
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the four digit number");
        int num=sc.nextInt();
        String[] word={"zero" ,"one" , "two","three","four","five","six","seven","eight","nine","ten"};
        int ones,tens,hundreds,thousands;
        ones=num%10;
        num=num/10;
        tens=num%10;
        num=num/10;
        hundreds=num%10;
        num=num/10;
        thousands=num%10;
        System.out.println(word[thousands]+" thousand "+word[hundreds]+" hundred and "+word[tens]+" "+word[ones]);


    }
}