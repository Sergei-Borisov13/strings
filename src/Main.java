public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }

    private static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName  = "Ivanovich";
        String fullName  = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName );
    }

    private static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName  = "Ivanovich";
        String fullName  = firstName + middleName + lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    private static void task3() {
        System.out.println("Задача 3");
        String firstName = "Иванов ";
        String middleName = "Семён ";
        String lastName  = "Семёнович";
        String fullName  = firstName + middleName + lastName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
}