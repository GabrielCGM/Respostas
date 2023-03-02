import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiveANS {
    public static void main(String[] args) {
        // Evitar de usar funções prontos
        

        String text = "gabriel";
        List<Character> arrayFive = new ArrayList<>();

        for(int a = text.length() - 1 ; a >= 0; a--){
            arrayFive.add(text.charAt(a));
        }
        for(int b = 0; b < arrayFive.size(); b++){
            System.out.print(arrayFive.get(b));

        }




    }
}
