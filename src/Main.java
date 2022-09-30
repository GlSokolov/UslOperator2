public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке:");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке:");
        }
        System.out.println();
        // Задание 2
        int clientOS2 = 1;
        int clientDeviceYear = 2012;
        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложение для iOS");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для приложения iOS");
        }
        if (clientOS2 == 2 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложение для Android");
        } else if (clientOS2 == 2 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для приложения Android");
        }
        System.out.println();
        // Задание 3

    }
}