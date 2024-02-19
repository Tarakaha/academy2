package task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Создать свой класс Person с полями: firstName, lastName, age, dateOfBirth.
 * Добавить класс User, который наследуется от Person, с полями: login, password, email.
 * Добавить гетеры, сетеры. Добавить метод printUserInfo в User.
 * Посмотреть разницу. Просетать все значения через Reflection.
 * Вывести значения полей через Reflection.
 * Вызвать toString через invoke.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User("John", "Doe", 25, "01/01/1997", "johndoe",
                "password123", "johndoe@gmail.com");
        user.printUserInfo();
        Class<?> userClass = user.getClass();

        Method method1 = userClass.getMethod("printUserInfo");
        Method method2 = userClass.getMethod("setPassword", String.class);
        System.out.println(method1);
        System.out.println(method2);

        System.out.println("\n******** Using getMethod/getField ********");

        System.out.println("------ METHODS ------");
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }
        Field field = userClass.getField("firstName");
        System.out.println("Field: " + field);
        try {
            Field field2 = userClass.getField("password");
            System.out.println("Field2: " + field2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("------ FIELDS ------");
        Field[] fields = userClass.getFields();
        for (Field f : fields) {
            System.out.println("Field: " + f);
        }

        System.out.println("\n******** Using getDeclaredMethods() ********");

        try {
            System.out.println("------ METHODS ------");

            Method declaredMethod = userClass.getDeclaredMethod("getPassword");
            System.out.println("Declared Method: " + declaredMethod);

            Method[] declaredMethods = userClass.getDeclaredMethods();
            for (Method method : declaredMethods) {
                System.out.println("Declared Methods: " + method);
            }
            System.out.println("------ FIELDS ------");

            Field declaredField = userClass.getDeclaredField("email");
            System.out.println("Declared Field: " + declaredField);

            Field[] declaredFields = userClass.getDeclaredFields();
            for (Field f : declaredFields) {
                System.out.println("Declared Field: " + f);
            }

        } catch (NoSuchMethodException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("\n******** Setting field values ********");

        Field emailField = userClass.getDeclaredField("email");
        emailField.setAccessible(true);
        emailField.set(user, "john@yahoo.com");
        user.printUserInfo();

        System.out.println("\n******** Invoking toString method ********");

        Method methodToString = userClass.getDeclaredMethod("toString");
        System.out.println(methodToString.invoke(user));
    }
}

