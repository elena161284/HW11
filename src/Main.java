import javax.swing.*;

public class Main {

    public static void divideTheYear(int years) {
        int divideTheYear = 2024;
        if ((years % 4 == 0) && (years % 100 != 0) || (years % 400 == 0)) {
            System.out.println(years + " год — високосный год");
        } else {
            System.out.println(years + " год — невисокосный год");
        }
    }

    public static void installOrUpdate(int yearOfRelease1, int operatingSystem1) {
        int[] installOrUpdate = {2015, 1,};
        installOrUpdate[0] = 2015;
        int yearOfRelease2 = installOrUpdate[0];
        installOrUpdate[1] = 1;
        int operatingSystem2 = installOrUpdate[1];
        if (operatingSystem1 == 0 && yearOfRelease1 < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operatingSystem1 == 1 && yearOfRelease1 < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (operatingSystem1 == 1 && yearOfRelease1 >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (operatingSystem1 == 0 && yearOfRelease1 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void calculateDeliveryData(int deliveryDistance1) {
        int calculateDeliveryData = 95;
        if (deliveryDistance1 <= 20) {
            System.out.println("Потребуется 1 день для доставки");
        } else if (deliveryDistance1 > 20 && deliveryDistance1 <= 60) {
            System.out.println("Потребуется 2 дня для доставки");
        } else if (deliveryDistance1 > 60 && deliveryDistance1 < 100) {
            System.out.println("Потребуется 3 дня для доставки");
        } else {
            System.out.println("Доставки нет");
        }
    }

        public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2024;
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        divideTheYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int yearOfRelease = 2015;
        int operatingSystem = 1;
        boolean start = operatingSystem == 0 && yearOfRelease < 2015;
        installOrUpdate(yearOfRelease, operatingSystem);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 75;
        boolean fromDay = (deliveryDistance <= 20);
        calculateDeliveryData(deliveryDistance);
    }
    }




