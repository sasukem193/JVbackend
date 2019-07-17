import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class insertValueInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int size = 10;
        int[] array = new int[size];
        int[] array2 = new int[11];
        for (int i = 0; i < size; i++) {
            array[i] = array2[i] = rd.nextInt(10);
        }

        System.out.print("Array list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


        System.out.println("\nEnter index:");
        int index = sc.nextInt();
        while (index <= 1 || index >= size) {
            System.out.println("Index should be: 1-" + size);
            System.out.print("Enter index again:");
            index = sc.nextInt();
        }
        System.out.println("Enter value:");
        int value = sc.nextInt();

        for(int i=array2.length; i>index; i--){
            array2[i-1]=array2[i-2];
        }
        array2[index-1]=value;

        System.out.println("Array list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("\nNew Array list: ");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
    }

}
