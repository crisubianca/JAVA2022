package Compulsory;
/**
 *
 * @author Adm
 */
import javax.swing.*;
import java.awt.*;
import static java.awt.BorderLayout.CENTER;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;
    
    public MainFrame(){
        super("Positional Game");
        init();
    }
    
    private void init(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //create the components
        configPanel = new ConfigPanel(this);
        canvas = new DrawingPanel(this);
        controlPanel = new ControlPanel(this);
        
        
        //arrange the components in the container (frame)
        //JFrame uses a BorderLayout by default
        add(canvas, CENTER); //this is BorderLayout.CENTER
        add(configPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);
        
        //invoke the layout manager
        pack();
    }

    public ConfigPanel getConfigPanel() {
        return configPanel;
    }

    public void setConfigPanel(ConfigPanel configPanel) {
        this.configPanel = configPanel;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    public DrawingPanel getCanvas() {
        return canvas;
    }

    public void setCanvas(DrawingPanel canvas) {
        this.canvas = canvas;
    }
     
}
