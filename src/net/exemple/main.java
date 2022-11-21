package net.exemple;

import java.net.URL;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello Software Engineering");

        try {
            URL url = new URL("https://www.javatpoint.com/java-tutorial");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
