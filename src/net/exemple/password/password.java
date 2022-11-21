package net.exemple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello Software Engineering");

        String password;

        try {
            File file = new File("./ressources/private.key");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            password = br.readLine();

        } catch (Exception e) {
            e.printStackTrace();
            password = "null";
        }
        
        System.out.println(password);
    }
}
