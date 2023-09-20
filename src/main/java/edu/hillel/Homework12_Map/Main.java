package edu.hillel.Homework12_Map;

public class Main {
    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("file1.txt", 200, "path/to/file");
        FileData file2 = new FileData("file2.txt", 400, "path/to/file");
        FileData file3 = new FileData("file3.txt", 100, "different/path");
        FileData file4 = new FileData("file4.txt", 150, "different/path");
        FileData file5 = new FileData("file5.txt", 120, "another/path");
        FileData file6 = new FileData("file6.txt", 100, "another/path");

        navigator.add(file1, "path/to/file");
        navigator.add(file2, "path/to/file");
        navigator.add(file3, "different/path");
        navigator.add(file4, "different/path");
        navigator.add(file5, "another/path");
        navigator.add(file6, "wrong/path");

        navigator.printAll();

        navigator.remove("another/path");

        navigator.printAll();

        navigator.filterBySize(200);

        navigator.sortBySize();

        navigator.find("different/path");
    }
}
