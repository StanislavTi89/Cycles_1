public class Main {
    public static void main(String[] args) {
        System.out.println("Цыклы_1");

        //Задание 1
        System.out.println("Задание 1");
        for (int i = 0;  i < 10; i++){
            System.out.println("Цикл " + i);
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int i1 = 10; i1 > 0; i1--){
            System.out.println("Цикл " + i1);
        }

        //Задание 3
        System.out.println("Задание 3");

        for (int i2 = 0; i2 < 17; i2++) {
        if (i2%2==0)
            System.out.println("Цикл " + i2);
        }

        //Задание 4
        System.out.println("Задание 4");
        for (int i3 = 10; i3>=-10; i3--){
            System.out.println("Цикл " + i3);
        }

        //Задание 5
        System.out.println("Задание 5");
        for (int year = 1904; year < 2096; year = year + 4){
            System.out.println(year + " год является высокостным");
        }

        //Задание 6
        System.out.println("Задание 6");
        for (int number = 7; number <= 98; number = number + 7){
            System.out.println("Число " + number);
        }

        //Задание 7
        System.out.println("Задание 7");
        for (int number1 = 1; number1 <= 512; number1 = number1 * 2){
            System.out.println("Число " + number1);
        }

        //Задание 8
        System.out.println("Задание 8");
        int accumulation = 29000;
        int month = 0;
        for (int i = 1; i <= 12; i++){
            month = month + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + month + " рублей");
        }

        //Задание 9
        System.out.println("Задание 9");
        double sumPercent = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++){
            sumPercent = (sumPercent + accumulation) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumPercent + " рублей");
        }

    }
}