package imageviewer.controller;

import java.io.File;
import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Nestor\\Pictures\\");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}
