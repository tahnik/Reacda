import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Tahnik Mustasin on 19/05/2016.
 */
public class RenameFiles {
    private String PATH;
    public RenameFiles(String path){
        setPATH(path);
    }
    private void setPATH(String path){
        File temp = new File(path);
        if(path.equals("") || !temp.isDirectory()){
            System.err.println("Wrong Directory Path");
            return;
        }
        this.PATH = path;
    }
    public String getPATH(){
        return this.PATH;
    }
    public void getFileList(){
        File GUIFolder = new File(PATH);
        File[] listofFiles = GUIFolder.listFiles();
        ArrayList<Long> dateModifiedList = new ArrayList<>();

        for(File file : listofFiles){
            dateModifiedList.add(file.lastModified());
        }
        Collections.sort(dateModifiedList);
        String fileName = "";
        String renameFile = "";
        for(File temp : listofFiles){
            fileName = temp.getName();
            renameFile = PATH + "/" + (dateModifiedList.indexOf(temp.lastModified()) + 1) + ". " + fileName;
            temp.renameTo(new File(renameFile));
        }
    }
}
