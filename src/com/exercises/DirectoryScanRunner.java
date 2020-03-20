package com.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {
    public static void main(String[] args) throws IOException {

        //Files.list(Paths.get(".")).forEach(System.out::println);   // citeste toate fisierele din folderul sursa

        Path currectDirectory=Paths.get(".");
        Files.list(currectDirectory).forEach(System.out::println);
        Files.walk(currectDirectory, 4).forEach(System.out::println);  // merge in fiecare Fisier


    }
}
