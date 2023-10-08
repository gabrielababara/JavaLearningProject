package md.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject = new File("src/main/java/md/tekwillacademy/filemanagementservice/test.txt");

        FileManager.informIfTheFileExists(fileObject);

        System.out.println(FileManager.createTheFileIfItDoesNotExist(fileObject));
        FileManager.informIfTheFileExists(fileObject);
        FileManager.printTheFileName(fileObject);
        FileManager.printTheAbsolutePath(fileObject);
        FileManager.printIfItIsADirectoryFile(fileObject);

        OutputFileWriterManager.writeInformationIntoAFileUsingFileWrite(fileObject.getPath(),"Content");
        OutputFileWriterManager.writeInformationIntoAFileUsingFileWrite(fileObject.getPath(),"Altceva");
        OutputFileWriterManager.writeInformationIntoAFileByUsingBufferedWriter(fileObject, "Value Free");

        InputFileReadManager.printDataOnTheConsoleUsingFileReader(fileObject);
        System.out.println();
        InputFileReadManager.printDataFromAFileUsingBufferedReader(fileObject);

        InputFileReadManager.printDataUsingTheEasiestWay(fileObject);
    }

}
