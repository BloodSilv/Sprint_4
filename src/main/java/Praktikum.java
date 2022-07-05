import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для
             печати на банковской карте.
         */

        // Вариант с вводом, тестируемого имени "вручную" - пользователем.

        Scanner user_input = new Scanner(System.in);
        System.out.print("Введите имя владельца карты и нажмиите enter: ");
        String nameToCheck = user_input.nextLine();
        Account account = new Account(nameToCheck);
        if (account.checkNameToEmboss()) {
            System.out.println("Успех. Имя владельца карты прошло проверку.");
        } else {
            System.out.println("Внимание!!! Введённое имя не соответствует требованиям и не может быть напечатано на карте.");
        }

        /* Вариант в котором  имя передается как аргумент и проверятся методом checkNameToEmboss класса Account
        (на мой взгляд, именно этот метод лучше подходит для запуска теста)
         */

//        String name = "Тимоти Шаламе";
//        Account account = new Account(name);
//        Boolean result = account.checkNameToEmboss ();
//        System.out.println(result);
    }
}
