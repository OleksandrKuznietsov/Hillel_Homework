package edu.hillel.Homework17_Files;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class FileLogger {

    private File logFile;
    private int fileSize;
    private FileLoggerConfiguration config;
    private SimpleDateFormat dateFormat;
    private LocalTime currentTime = LocalTime.now();
    private BufferedWriter writer;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
        this.logFile = new File(config.getFilePath());
        this.fileSize = (int) logFile.length();
    }

    public void info(String message) {
        log(message, LoggingLevel.INFO);
    }

    public void debug(String message) {
        log(message, LoggingLevel.DEBUG);
    }

    public void log(String message, LoggingLevel loggingLevel) {
        try {
            checkSize(message);
            createFile();
            writer = new BufferedWriter(new FileWriter(logFile, true));
            writer.write("\n[" + currentTime + "]" + "[" + loggingLevel + "]" + "Message: " + message);
            writer.flush();
            fileSize += message.length();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createFile() throws IOException {
        if (fileSize >= config.getMaxFileSize()) {
            writer.close();
            dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String newFilepath = "Log_" + dateFormat.format(new Date()) + ".txt";
            logFile = new File(newFilepath);
            writer = new BufferedWriter(new FileWriter(logFile, true));
            fileSize = 0;
        }
    }

    public void checkSize(String message) {
        try {
            if (fileSize + message.length() >= config.getMaxFileSize()) {
                throw new FileMaxSizeReachedException(config.getFilePath(), config.getMaxFileSize(), (int) logFile.length());
            }
        } catch (FileMaxSizeReachedException e) {
            System.out.println(e.getMessage());
        }
    }

}


