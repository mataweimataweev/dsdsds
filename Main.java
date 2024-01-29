import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("Меню:");
            System.out.println("1. Приветствие с пользователем");
            System.out.println("2. Ввод персональных данных");
            System.out.println("3. Проверка возраста");
            System.out.println("4. Нахождение площади, периметра и радиуса круга");
            System.out.println("5. Выйти из программы");
            System.out.print("Выберите программу (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printGreeting();
                    break;
                case 2:
                    enterPersonalData(scanner);
                    break;
                case 3:
                    checkAge(scanner);
                    break;
                case 4:
                    calculateCircleProperties(scanner);
                    break;
                case 5:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
                    break;
            }
        }
    }

    public static void printGreeting() {
        System.out.println("Приветствие с пользователем.");
    }

    public static void enterPersonalData(Scanner scanner) {
        System.out.print("Введите свое имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите свой возраст: ");
        int age = scanner.nextInt();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public static void checkAge(Scanner scanner) {
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Вы несовершеннолетний.");
        } else {
            System.out.println("Вы совершеннолетний.");
        }
    }

    public static void calculateCircleProperties(Scanner scanner) {
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Периметр круга: " + perimeter);
        System.out.println("Площадь круга: " + area);
        System.out.println("Радиус круга: " + radius);
    }
}
