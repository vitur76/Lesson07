package CopiedArray;

public class CopyArray {
    public static void Start() {
        // Array inițial
        int[] originalArray = {1, 2, 6, -8, 3000, 0};

        // Crearea unui array nou de aceeași dimensiune ca și array-ul inițial
        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("originalArray:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("copiedArray:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}