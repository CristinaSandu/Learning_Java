package com.exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilereadRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("./resources/data.text");
        List<String> lines = Files.readAllLines(pathFileToRead);
        System.out.println(lines);
//sau
        Files.lines(pathFileToRead)
                .map(String::toLowerCase)
                .filter(str -> str.contains("a"))
                .forEach(System.out::println);  // citeste cate o linie pe rand
    }


}
