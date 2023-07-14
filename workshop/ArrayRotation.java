import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the rotation count: ");
        int rotationCount = sc.nextInt();

        System.out.println("Original array: " + Arrays.toString(arr));

        rotationCount = rotationCount % length;

        int rotatedArr[]= new int[length];
        for (int i = 0; i < length; i++) {
            int newIndex = (i + rotationCount) % length;
            rotatedArr[newIndex] = arr[i];
        }

        System.out.println("Rotated array: " + Arrays.toString(rotatedArr));
    }
}
