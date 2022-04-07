package Compulsory;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Adm
 */
public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel label;
    JSpinner spinner1;
    JSpinner spinner2;
    JButton createBtn = new JButton("Create");
    
    int rows, cols;
    
    public ConfigPanel(MainFrame frame){
        this.frame = frame;
        init();
    }
    
    private void init(){
        //create the label and the spinner
        label = new JLabel("Grid size: ");
        spinner1 = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        spinner2 = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
        
        //create spinners for rows and cols, and the button
        add(label); //JPanel FlowLayout by default
        add(spinner1);
        add(spinner2);
        add(createBtn, BorderLayout.CENTER);
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
        public int getRows() {
        return (Integer) spinner1.getValue();
    }

    public int getCols() {
        return (Integer) spinner2.getValue();
    }
    
}
