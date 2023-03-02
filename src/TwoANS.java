import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoANS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int end = sc.nextInt();

        System.out.print(fibonacci(end));

    }

    public static String fibonacci(int value){
        List<Integer> arrayOne = new ArrayList<>();

        arrayOne.add(0);
        arrayOne.add(1);

        for(int a = 0; a < value; a++){
            int b = a + 1;
            int soma = arrayOne.get(a) + arrayOne.get(b);
            arrayOne.add(soma);
        }

        // Irei colocar um for extra para vizualizar a sequência

        for(Integer obj: arrayOne){
            System.out.print(obj + " ");
        }


        for(Integer obj: arrayOne){
            if(value == obj){
                return "O número digitado pertence a sequência";
            }
        }

        return "O número digitado não pertence a sequência";

    };


}
