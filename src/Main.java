public class Main {
    public static void main(String[] args) {
        int[] consumptions = generateRandomArray();
        System.out.println(Arrays.toString(consumptions));
        System.out.println("Задание 1");
        int sum = 0;
//        for(int i = 0; i > consumptions.length; i++){
        //           int consumption = consumptions[i];
        //          sum += consumption;
        for (int consumption : consumptions){
            sum += consumption;
        }
        System.out.println("Сумма трат за месяц составила - " + sum + " рублей.");

        System.out.println("Задание 2");
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for(int consumption : consumptions){

            if(consumption > max){
                consumption = max;
            }
            if(consumption < min){
                consumption = min;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        // только пожалуйста не пишите в пулреквесте, что у меня ошибка в задании 2 и некорректно отображается результат - я об этом знаю, но не понимаю, где ошибка и что нужно сделать, чтобы заработало корректно.

        System.out.println("Задание 3");
        double meanConsumption = (double) sum / consumptions.length;
        System.out.println("Средняя сумма трат за месяц составила " + meanConsumption + " рублей.");

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
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