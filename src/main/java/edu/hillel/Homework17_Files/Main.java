package edu.hillel.Homework17_Files;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, FileMaxSizeReachedException, InterruptedException {
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration configuration = loader.load("config.txt");
        FileLogger fileLogger = new FileLogger(configuration);
        for (int i = 0; i < 100; i++) {
            fileLogger.info("12345");
            fileLogger.debug("abcde");
        }
    }
}
