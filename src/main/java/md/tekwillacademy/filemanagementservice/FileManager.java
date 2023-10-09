package md.tekwillacademy.filemanagementservice;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createTheFileIfItDoesNotExist(File file) throws IOException {
        return file.createNewFile();
    }
    public static void informIfTheFileExists(File file) {
        if(file.exists()) {
            System.out.println("The file is present");
        } else{
            System.out.println("The file not present");
        }
    }
    public static void printTheFileName(File fileThatIsConsidered){
        System.out.println(fileThatIsConsidered.getName());
    }
    public static void printTheAbsolutePath(File fileThatIsConsidered){
        System.out.println(fileThatIsConsidered.getAbsolutePath());
    }
    public static void printIfItIsADirectoryFile(File file){
        if (file.isDirectory()){
            System.out.println("It is a Directory");
        } else {
            System.out.println("It is a file");
        }
    }
}

