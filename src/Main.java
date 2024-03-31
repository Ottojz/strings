public class Main {
    public static void main(String[] args) {

        System.out.println();
        //task 1
        System.out.println("task 1");
        System.out.println();

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);

        System.out.println();
        //task 2
        System.out.println("task 2");
        System.out.println();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println();
        //task 3
        System.out.println("task 3");
        System.out.println();

        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Данные Ф. И. О. сотрудника  — " + fullName.replace('ё', 'е'));

    }
}