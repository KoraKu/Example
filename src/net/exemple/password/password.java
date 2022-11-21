package net.exemple.password;

import java.io.BufferedReader;
import java.io.File;
import net.exemple.password.passwordManager;

public class password {
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
