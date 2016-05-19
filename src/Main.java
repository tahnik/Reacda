import javax.swing.*;

/**
 * Created by Tahnik Mustasin on 19/05/2016.
 */
public class Main {
    public static void main(String args[]){
        String path = "";
        path = JOptionPane.showInputDialog("Type the directory name\nMake sure the directory name doesn't have space");
        RenameFiles fileList = new RenameFiles(path);
        fileList.getFileList();
    }
}
