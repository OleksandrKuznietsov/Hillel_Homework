package edu.hillel.Homework17_Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String configFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(configFile))) {
            String file = null;
            LoggingLevel level = null;
            long maxSize = 0;
            String format = null;
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("FILE: ")) {
                    file = line.substring("FILE: ".length());
                } else if (line.startsWith("LEVEL: ")) {
                    level = LoggingLevel.valueOf(line.substring("LEVEL: ".length()));
                } else if (line.startsWith("MAX-SIZE: ")) {
                    maxSize = Long.parseLong(line.substring("MAX-SIZE: ".length()));
                } else if (line.startsWith("FORMAT: ")) {
                    format = line.substring("FORMAT: ".length());
                }
            }
            return new FileLoggerConfiguration(file, level, (int) maxSize, format);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}

