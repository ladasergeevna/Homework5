//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Task1
  int operationSystem = 0; // 0 - iOS; 1 - Android
         if (operationSystem == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operationSystem == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
             System.out.println("Исходные данные некорректные!");
         }
        System.out.println();

        // Task2
        int clientDeviceYear = 2015;
        if (operationSystem == 0 && clientDeviceYear == 2015)  {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operationSystem == 0 && clientDeviceYear != 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (operationSystem == 1 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (operationSystem == 1 && clientDeviceYear != 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Исходные данные некорректные!");
        }
        System.out.println();

        // Task3
        int year = 2024;
        if ((year > 1584 && (year % 4 == 0 && year % 100 !=0) || year % 400 == 0))  {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - не високосный");
        }
        System.out.println();

        // Task4
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if(deliveryDistance <= 20) {
            System.out.println("Доставка займет " + deliveryDay + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка займет " + (deliveryDay + 1) + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет " + (deliveryDay + 2) + " дня");
        } else {
                System.out.println("Доставки нет");
            }
        System.out.println();
// Task5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Исходные данные некорректны");
        }
    }
}