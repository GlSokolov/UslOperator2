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

        // Задание 4
        short deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: сутки ");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: два дня ");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: три дня ");
        } else if (deliveryDistance >= 100) {
            System.out.println("Потребуется дней: от четырех дней ");}
        System.out.println();
        // Задание 5
        short mothNomber = 15;
        switch (mothNomber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Весна");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}