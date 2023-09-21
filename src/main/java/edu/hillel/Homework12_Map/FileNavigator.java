package edu.hillel.Homework12_Map;

import java.util.*;

public class FileNavigator {
    private final Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(FileData file, String inputPath) {
        if (!inputPath.equals(file.getPath())) {
            System.out.println("Exception : path-key and path do not match. Can't add file: " + file.getName());
        } else {
            if (!fileMap.containsKey(file.getPath())) {
                fileMap.put(file.getPath(), new ArrayList<>());
            }
            fileMap.get(file.getPath()).add(file);
        }
    }

    public List<FileData> find(String path) {
        System.out.println("------------------------------------");
        System.out.println("Files in " + path);
        List<FileData> fileDataList = fileMap.getOrDefault(path, new ArrayList<>());
        for (FileData fileData : fileDataList) {
            System.out.println(fileData.getName());
        }
        return fileDataList;
    }

    public List<FileData> filterBySize(int inputSIze) {
        System.out.println("------------------------------------");
        System.out.println("Files with size <= " + inputSIze);
        List<FileData> filteredBySize = new ArrayList<>();
        for (List<FileData> fileDataList : fileMap.values()) {
            for (FileData fileData : fileDataList) {
                if (fileData.getSize() <= inputSIze) {
                    filteredBySize.add(fileData);
                    System.out.println(fileData.getName() + "(" + fileData.getSize() + " bytes).");
                }
            }
        }
        return filteredBySize;
    }

    public void remove(String inputPath) {
        System.out.println("------------------------------------");
        System.out.println("Removed files from path: " + inputPath);
        fileMap.remove(inputPath);
    }

    public List<FileData> sortBySize() {
        System.out.println("------------------------------------");
        System.out.println("Files sorted by size:");
        List<FileData> sortedBySize = new ArrayList<>();
        for (List<FileData> fileDataList : fileMap.values()) {
            sortedBySize.addAll(fileDataList);
        }
        sortedBySize.sort(Comparator.comparingInt(FileData::getSize));
        for (FileData fileData : sortedBySize) {
            System.out.println(fileData.getName() + "(" + fileData.getSize() + " bytes).");
        }
        return sortedBySize;
    }

    public void printAll() {
        System.out.println("------------------------------------");
        for (Map.Entry<String, List<FileData>> entry : fileMap.entrySet()) {
            System.out.println("Path: " + entry.getKey());
            for (FileData fileData : entry.getValue()) {
                System.out.println("File: " + fileData.getName() + ", Size: " + fileData.getSize() + " bytes");
            }
            System.out.println();
        }
    }
}
