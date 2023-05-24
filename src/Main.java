import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        divideTheYear();
        installOrUpdate();
        calculateDeliveryData();
    }

    public static void divideTheYear(int years) {
        if ((years % 4 == 0) && (years % 100 != 0) || (years % 400 == 0)) {
            System.out.println(years + " год — високосный год");
        } else {
            System.out.println(years + " год — невисокосный год");
        }
    }

    public static void installOrUpdate(int yearOfRelease1, int operatingSystem1) {
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

    public static int calculateDeliveryData(int deliveryDistance1) {
        int deliveryTime = 0;
        if (deliveryDistance1 <= 20) {
            deliveryTime++;
        } else if (deliveryDistance1 <= 60) {
            deliveryTime = deliveryTime + 2;
        } else if (deliveryDistance1 <= 100) {
            deliveryTime = deliveryTime + 3;
        }

        return deliveryTime;
    }


    public static void divideTheYear() {
        System.out.println("Задача 1");
        int year = 2023;
        divideTheYear(year);
    }

    public static void installOrUpdate() {
        System.out.println("Задача 2");
        int yearOfRelease = 2014;
        int operatingSystem = 1;
        installOrUpdate(yearOfRelease, operatingSystem);
    }

    public static void calculateDeliveryData() {
        System.out.println("Задача 3");
        int deliveryDistance = 75;
        if (calculateDeliveryData(deliveryDistance) != 0) {
            System.out.println("Потребуется дней для доставки: " + calculateDeliveryData(deliveryDistance));
        } else {
            System.out.println("Доставки нет");
        }
    }
}












