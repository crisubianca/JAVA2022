package Compulsory;
/**
 *
 * @author Adm
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class DrawingPanel extends JPanel{
    private final MainFrame frame;
    int rows, cols;
    int canvasWidth =400, canvasHeight = 400;
    int boardWidth, boardHeight;
    int cellWidth, cellHeight;
    int padX, padY;
    int stoneSize = 20;
    
    BufferedImage image; //the offscreen image
    Graphics2D offscreen; //the offscreen graphics
    
    public DrawingPanel(MainFrame frame){
        this.frame = frame;
        init(frame.configPanel.getRows(), frame.configPanel.getCols());
    }
    
    private void createOffscreenImage(){
        image = new BufferedImage(
                canvasWidth, canvasHeight, BufferedImage.TYPE_INT_ARGB);
        offscreen = image.createGraphics();
        offscreen.setColor(Color.WHITE); //fill the image with white
        offscreen.fillRect(0, 0, canvasWidth, canvasHeight);
    }
    
    final void init(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.padX = stoneSize + 10;
        this.padY = stoneSize + 10;
        this.cellWidth = (canvasWidth - 2 * padX)/(cols - 1);
        this.cellHeight = (canvasHeight - 2 * padY)/(rows - 1);
        this.boardWidth = (cols - 1) * cellWidth;
        this.boardHeight = (rows - 1) * cellHeight;
        
        this.addMouseListener(new MouseAdapter(){
           
                @Override
                public void mousePressed(MouseEvent e){
                   drawStone(e.getX(), e.getY());
                   repaint();
                }
         //can't use lambdas, JavaFX does a better job in these cases
        });
        
        setPreferredSize(new Dimension(canvasWidth, canvasHeight));
    }
    
    private void drawStone(int x, int y){
        //TODO
        //draw a filled oval in the offscreen image
    }
    
    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, canvasWidth, canvasHeight);
        paintGrid(g);
        //paintSticks(g);
        //paintStones(g);
    }
    
    private void paintGrid(Graphics2D g){
        g.setColor(Color.DARK_GRAY);
        //horizontal lines
        for(int row = 0; row < rows; row++){
           int x1 = padX;
           int y1 = padY + row * cellHeight;
           int x2 = padX + boardWidth;
           int y2 = y1;
           g.drawLine(x1, y1, x2, y2);
        }
        
        //vertical lines
        for(int col = 0; col < cols; col++){
           int x1 = padY;
           int y1 = padX + col * cellWidth;
           int x2 = padY + boardHeight;
           int y2 = y1;
           g.drawLine(y1, x2, y2, x1);
        }
         
        //intersections
        for(int row = 0; row < rows; row++){
           for(int col = 0; col < cols; col++){
              int x = padX + col * cellWidth;
              int y = padY + row * cellHeight;
              g.setColor(Color.LIGHT_GRAY);
              g.drawOval(x - stoneSize / 2, y - stoneSize / 2, stoneSize, stoneSize);
           }
        }
    }
    
    @Override
    public void update(Graphics g){} //no need for update
    
    /*
    //draw the offscreen image, using the original graphics
    @Override
    protected void paintComponent(Graphics graphics){
        graphics.drawImage(image, 0, 0, this);
    }
    */
}
