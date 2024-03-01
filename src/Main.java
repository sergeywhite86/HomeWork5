import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Task1,Task2");
        System.out.println("Нажмите 1 для установки версии приложения для iOS по ссылке \n" +
                "Нажмите 2 для установки версии приложения для Android по ссылке");
        int clientOS = sc.nextInt();
        System.out.println("Введите дату производства смартфона");
        int clientDeviceYear = sc.nextInt();
        boolean isNewVersionPhone = clientDeviceYear >= 2015;
        int iOs = 1;
        int android = 2;

        if (clientOS == iOs) {
            if (isNewVersionPhone) System.out.println("Скачиваю версию для iOS ... ");
            else System.out.println("Скачиваю облегченную версию приложения для iOS ...");
        } else if (clientOS == android) {
            if (isNewVersionPhone) System.out.println("Скачиваю версию для Android ... ");
            else System.out.println("Скачиваю облегченную версию приложения для Android ...");
        } else System.out.println("Неверный ввод");

        System.out.println("Task3");
        System.out.println("Введите год");
        String leapPositiveMessage = "Год является високосным";
        String leapNegativeMessage = "Год не является високосным";
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println(leapPositiveMessage);
        } else if (year % 4 == 0 && year % 100 != 0) System.out.println(leapPositiveMessage);
        else System.out.println(leapNegativeMessage);

        System.out.println("Task4");
        System.out.println("Введите расстояние");
        int deliveryDistance = sc.nextInt();
        int deliveryTime = 1;
        if (deliveryDistance <= 20) System.out.printf("Потребуется дней: %d %n", deliveryTime);
        else if (deliveryDistance <= 60) {
            deliveryTime += 1;
            System.out.printf("Потребуется дней: %d %n", deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.printf("Потребуется дней: %d %n", deliveryTime);
        } else System.out.println("Доставки нет");

        System.out.println("Task5");
        System.out.println("Введите номер месяца");
        int monthNumber = sc.nextInt();
        if (monthNumber < 13) {
            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("Это зима");
                    break;
                case 3, 4, 5:
                    System.out.println("Это весна");
                    break;
                case 6, 7, 8:
                    System.out.println("Это лето");
                    break;
                case 9, 10, 11:
                    System.out.println("Это осень");
                default:
                    System.out.println("Нет такого месяца");
                    break;
            }
        } else System.out.println("Некорректные данные");
    }
}