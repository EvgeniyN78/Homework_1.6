public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();

        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println();

        System.out.println("Задание 2");
        System.out.println();

        arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int element:arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");

        System.out.println();

        System.out.println("Задание 3");
        System.out.println();

        System.out.println("Средняя сумма трат за месяц составила " + (sum / (float) arr.length) + " рублей.");

        System.out.println();

        System.out.println("Задание 4");
        System.out.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);

        }
        System.out.println();

    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}