package com.exercises;

import javax.sound.sampled.Line;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("./resources/file-write.txt");
        List<String> list = List.of("Apple", "Cat", "Bat");
        Files.write(pathToFile, list);
    }
}
