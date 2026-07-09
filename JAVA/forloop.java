import java.util.ArrayList;
public class forloop {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("piyu");
        for(String i : animals){
            System.out.println(i);
        }
    }
}
