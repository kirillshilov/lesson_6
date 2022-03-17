package ru.skypro;

public class Main { int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        {
            // Задача 1

            int sum = 0;
            for (int element : generateRandomArray()) {
                sum = sum + element;
            }
            System.out.println("Полная сумма трат за месяц " + sum);
        }
        {
            // Задача 2

            int sum = 0;
            for (int element : generateRandomArray()) {
                if (sum < element) {
                    sum = element;
                }
            }
            System.out.println( "Максимальная сумма трат за день составила " + sum +" рублей");
            for (int element : generateRandomArray()){
                sum = element;
                if(sum > element){
                    sum = element;
        }
            }
            System.out.println( "Минимальная сумма трат за день составила " + sum +" рублей");
        }
        {
            // Задача 3
            float sum = 0;
            for (float element : generateRandomArray()) {
                sum = sum + element;
            }
            System.out.println("Средняя сумма трат за месяц составила " + sum/30 + "рублей");
        }
        {
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length; i > 0; i--) {
                System.out.print(reverseFullName [i-1]);
            }
        }
    }
}
