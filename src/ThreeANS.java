import java.util.ArrayList;
import java.util.List;

public class ThreeANS {
    public static void main(String[] args) {
        /*
        a - 9
        b - 128
        c - 49
        d - 100
        e - 13
        f - 200
         */

        logicaA(4); // 9
        System.out.println();
        logicaB(6); // 128
        System.out.println();
        logicaC(8);// 49
        System.out.println();
        logicaD(4); // 100
        System.out.println();
        logicaE(5); // 13
    }

    public static void logicaA(int value){
        List<Integer> arrayA = new ArrayList<>();
        arrayA.add(1);

        for(int a = 0; a < value; a++){
            arrayA.get(0);
            int soma = arrayA.get(a) + 2;
            arrayA.add(soma);
        }

        for(Integer obj: arrayA){
            System.out.print(obj + " ");
        }

    }
    public static void logicaB(int value){
        List<Integer> arrayB = new ArrayList<>();
        arrayB.add(2);

        for(int a = 1; a <= value; a++){
            int result = (int) Math.pow(arrayB.get(0), a + 1);
            arrayB.add(result);
        }
        for(Integer obj: arrayB){
            System.out.print(obj + " ");
        }

    };
    public static void logicaC(int value){
        List<Integer> arrayC = new ArrayList<>();
        arrayC.add(0);

        for(int a = 1; a < value; a++){
            int result = (int)Math.pow(a, 2);
            arrayC.add(result);
        }
        for(Integer obj: arrayC){
            System.out.print(obj + " ");
        }

    };
    public static void logicaD(int value){
        List<Integer> arrayD = new ArrayList<>();
        arrayD.add(4);
        int b = 0;

        for(int a = 0; a < value; a++){

            int result = (int) Math.pow(4 + b, 2);
            arrayD.add(result);
            b += 2;
        }
        for(Integer obj: arrayD){
            System.out.print(obj + " ");
        }
    };
    public static void logicaE(int value){
        List<Integer> arrayE = new ArrayList<>();
        arrayE.add(1);
        arrayE.add(1);
        for(int a = 0; a < value; a++){
            int b = a + 1;
            int result = arrayE.get(a) + arrayE.get(b);
            arrayE.add(result);
        }

        for(Integer obj: arrayE){
            System.out.print(obj + " ");
        }
    }


}
