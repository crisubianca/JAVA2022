package Compulsory;
/**
 *
 * @author Adm
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton exitBtn = new JButton("Exit");
    
    public ControlPanel(MainFrame frame){
        this.frame = frame; init();
    }
    
    private void init(){
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1,4));
        
        //add all buttons
        add(saveBtn, BorderLayout.CENTER);
        add(loadBtn, BorderLayout.CENTER);
        add(exitBtn, BorderLayout.CENTER);
        
        //configure listeners for all buttons
        saveBtn.addActionListener(this::saveGame);
        loadBtn.addActionListener(this::loadGame);
        exitBtn.addActionListener(this::exitGame);
    }
    
    private void saveGame(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();

        // Only choose files of this type
        fileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));

        // If the user selects to save the file
        int option = fileChooser.showSaveDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                ImageIO.write(frame.canvas.image, "PNG", new File(fileToSave.getAbsolutePath()));
                System.out.println("Saved an image.");
            }
            catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }
        else if (option == JFileChooser.CANCEL_OPTION) {
            System.out.println("Canceled the saving operation.");
        }
        else {
            System.out.println("An error occurred during saving.");
        }
    }

    private void loadGame(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));

        // The user selected to load an image
        int option = fileChooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                Image image = ImageIO.read(new File(fileChooser.getSelectedFile().getAbsolutePath()));
                frame.getCanvas().offscreen.drawImage(image, 0, 0, frame.getCanvas());
                frame.getCanvas().repaint();
                System.out.println("Loaded an image.");
            }
            catch (IOException exc) {
                System.out.println(exc.getMessage());
            }
        }
        else if (option == JFileChooser.CANCEL_OPTION) {
            System.out.println("Canceled the loading operation.");
        }
        else {
            System.out.println("An error occurred during loading.");
        }
    }
    
    private void exitGame(ActionEvent e){
        System.out.println("Exited with success!");
        frame.dispose();
    }
    
}
