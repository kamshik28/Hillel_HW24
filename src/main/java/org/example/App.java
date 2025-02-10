package org.example;

public class App {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Це перше повідомлення логування.");
        logger2.log("Це друге повідомлення логування.");

        if (logger1 == logger2) {
            System.out.println("logger1 і logger2 є одним і тим самим екземпляром Singleton!");
        } else {
            System.out.println("ПОМИЛКА! Singleton працює неправильно.");
        }
    }
}
