package edu.hillel.Homework17_Files;

public class FileLoggerConfiguration {
    private String filePath;
    private LoggingLevel loggingLevel;
    private int maxFileSize;
    private String logFormat;

    public FileLoggerConfiguration(String filePath, LoggingLevel loggingLevel, int maxFileSize, String logFormat) {
        this.filePath = filePath;
        this.loggingLevel = loggingLevel;
        this.maxFileSize = maxFileSize;
        this.logFormat = logFormat;
    }

    public String getFilePath() {
        return filePath;
    }


    public int getMaxFileSize() {
        return maxFileSize;
    }


    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public String getLogFormat() {
        return logFormat;
    }
}
