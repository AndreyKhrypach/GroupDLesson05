import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson05Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter number in zone 0 - 10");
            int tryNumber = scanner.nextInt();
            System.out.println(tryNumber);
        }

        //String str = scanner.nextLine();

        scanner.close();

//        Random random = new Random();

//        int[] arrayInt = new int[25];
//        int keyNumber = 33;
//
//        for (int index = 0; index < arrayInt.length; index++) {
//            arrayInt[index] = random.nextInt(50) + 1;
//        }
//        System.out.println(Arrays.toString(arrayInt));
//
//        for (int index = 0; index < arrayInt.length; index++) {
//            if (arrayInt[index] == keyNumber){
//                System.out.println(arrayInt[index] + " with index = " +index + " ");
//            }
//        }
//
//        for (int arrayElement:
//             arrayInt) {
//            if (arrayElement == keyNumber){
//                System.out.println(arrayElement);
//            }
//        }


//        int[] manualArrayInt = new int[] {10, 5, 1, 23, 16, -4, -15};
//        System.out.println(Arrays.toString(manualArrayInt));
//        Arrays.sort(manualArrayInt);
//        System.out.println(Arrays.toString(manualArrayInt));

//        int[] manualArrayInt = new int[] {19, 2, 8, 1, 4, 10, 3};
//        int[] manualArrayInt2 = {19, 2, 8, 1, 4, 10, 3};
//        System.out.println(manualArrayInt.length);
//        for (int arrayElement:
//             manualArrayInt) {
//            System.out.print(arrayElement + ", ");
//        }
//
//        System.out.println();
//        System.out.println(Arrays.toString(manualArrayInt));
//        int[] arrayInt = new int[5];
//        int array2Int[] = new int[5];
//        byte[] arrayByte = new byte[5];
//        short[] arraShort = new short[5];
//        long[] arrayLong = new long[5];
//        float[] arrayFloat = new float[5];
//        double[] arrayDouble = new double[5];
//        boolean[] arrayBoolean = new boolean[5];
//        char[] arrayChar = new char[5];
//        String[] strings = new String[5];

//        for (int index = 0; index < arrayInt.length; index++) {
//            System.out.print(arrayInt[index] + ": " + index + " ");
//        }

//        for (int index = 0; index < arrayInt.length; index++) {
//            arrayInt[index] = random.nextInt(10) + 1;
//        }
//
//        System.out.println();
//        for (int index = 0; index < arrayInt.length; index++) {
//            System.out.print("Elment = " + arrayInt[index]+ " in index = " + index + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arrayInt));
//        int a = 0;
//
//        while(true){
//            System.out.println(a);
//            a++;
//            if(a > 10){
//                break;
//            }
//        }
//
//        for (; ;){
//            System.out.println(a);
//            a++;
//            if (a > 10){
//                break;
//            }
//        }
//        System.out.println("__________________");
//        System.out.println(a);
//        int a = 0;
//
//        do {
//            System.out.println(a);
//            a++;
//        }while (a < 10);

//        boolean bool = false;
//        int a = 0;
//
//        while (!bool){
//            System.out.println(a);
//            a++;
//            if(a == 10){
//                bool = true;
//            }
//        }

//        int a = 0;
//
//        while(a < 10){
//            System.out.println(a);
//            a++;
//        }

        //int a = 0;
        //int i = 0;
//        for (int i = 0; i <= 10; i++) {
//            if(i % 2 == 1) {
//                System.out.println(i);
//            }
//            //System.out.println(a);
//            //a++;
//        }
//        System.out.println("___________________________");
        //System.out.println(i);


    }
}
