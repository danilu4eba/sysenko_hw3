public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.0, -2.3, 3.1, 0.0, 5.5, 6.6, -7.7, 8.8, -9.9, 10.02, 11.3, -12.4, 13.5, 14.6, -15.6};
        double average = 0.0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] > 0) {
                        average = average + numbers[j];
                        count++;
                    }
                }
                break;
            }
        }
        System.out.println("average  " + average);

        //количество положительных чисел массива

        System.out.println("count  " + count);

        //подсчет среднего значения положительных чисел массива

        System.out.println("average/count " + average / count);

    }
}
