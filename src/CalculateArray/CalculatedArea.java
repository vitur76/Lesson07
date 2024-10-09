package CalculateArray;

public class CalculatedArea {
    public static void Start() {
        int[] array1 = {1, 5, 70, 285, 330};
        int sum = 0, evenCount = 0, oddCount = 0;

        for (int num : array1) {
            sum += num;
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = (double) sum / array1.length;

        System.out.println("Array unidimensional:");
        System.out.println("Suma: " + sum);
        System.out.println("Media: " + average);
        System.out.println("pare: " + evenCount);
        System.out.println("impare: " + oddCount);
        System.out.println();



        int[][] array2 = {
                {6, 1, 1},
                {77, 0, 20},
                {6, 30, 5}
        };

       sum = 0;
       evenCount = 0;
       oddCount = 0;

        int totalElements = 0;

        for (int[] row : array2) {
            for (int num : row) {
                sum += num; // calculare sumă
                totalElements++;
                if (num % 2 == 0) {
                    evenCount++; // numărare numere pare
                } else {
                    oddCount++; // numărare numere impare
                }
            }
        }

        average = (double) sum / totalElements; // calculare medie

        System.out.println("Array bi dimensional:");
        System.out.println("Suma: " + sum);
        System.out.println("Media: " + average);
        System.out.println("Numere pare: " + evenCount);
        System.out.println("Numere impare: " + oddCount);

    }
}
