package smallExce;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class searchFiles {
    public static void main(String[] args) {
        ArrayList<File> arrayList = new ArrayList<>();
        searchFiles(new File("D:\\"),arrayList);
        for(File file: arrayList){
            System.out.println(file);
        }

    }
    private static void searchFiles(File rootFile, List<File> fileList){
        if(rootFile.isDirectory()){
            System.out.println(rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if(directoryFiles != null){
                for (File file: directoryFiles){
                    if(file.isDirectory()){
                        searchFiles(file, fileList);
                    }else{
                        if(file.getName().toLowerCase().endsWith(".jpg"));
                        fileList.add(file);
                    }
                }
            }
        }else if(rootFile.getName().toLowerCase().endsWith(".jpg")){
                fileList.add(rootFile);
        }
    }
}
