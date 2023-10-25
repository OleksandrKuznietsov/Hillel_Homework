package edu.hillel.Homework17_Files;

public class FileMaxSizeReachedException extends Exception {
    private String filePath;
    private long maxFileSize;
    private int currentFileSize;

    public FileMaxSizeReachedException(String filePath, long maxFileSize, int currentFileSize) {
        this.filePath = filePath;
        this.maxFileSize = maxFileSize;
        this.currentFileSize = currentFileSize;
    }

    @Override
    public String getMessage() {
        return "File size limit reached. File: " + filePath +
                ", Max Size: " + maxFileSize +
                ", Current Size: " + currentFileSize;
    }
}
