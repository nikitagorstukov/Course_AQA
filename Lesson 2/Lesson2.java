package school.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(doTask1(1, 9));
        doTask2(8);
        System.out.println(doTask3(-1));
        doTask4("Karina", 3);

        System.out.println(doTask41(1994)); // Task 4*

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // Array for task 5
        System.out.println("Task 5: ");
        doTask5(arr1); // Task 5 check
        System.out.println("\nTask 6: ");
        doTask6(100); // Task 6 check

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Array for task 7
        System.out.println("\nTask 7: ");
        doTask7(arr3); // Task 7 check

        System.out.println("\nTask 8: ");
        doTask8(); // Task 8 check
        System.out.println("\nTask 9: ");
        doTask9(5, 1); // Task 9 check
    }

    public static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void doTask2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean doTask3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void doTask4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    public static boolean doTask41(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
    public static void doTask5(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void doTask6(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    public static void doTask7(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void doTask8() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void doTask9(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

}
