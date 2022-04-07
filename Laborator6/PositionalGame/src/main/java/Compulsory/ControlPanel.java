package Compulsory;
/**
 *
 * @author Adm
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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
    
    private void saveGame(ActionEvent e){
        
    }
    
    private void loadGame(ActionEvent e){
    
    }
    
    private void exitGame(ActionEvent e){
        System.out.println("Exited with success!");
        frame.dispose();
    }
    
}
