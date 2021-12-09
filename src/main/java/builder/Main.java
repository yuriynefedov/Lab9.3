package builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Yuriy")
                .lastName("Nefedov")
                .age(18)
                .occupation("Engineer")
                .build();
        System.out.println(user);
    }
}
