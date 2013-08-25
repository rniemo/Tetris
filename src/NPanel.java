/**
 * Contains the panel for drawing to the screen
 */
 
 import javax.swing.JPanel;
 import java.awt.event.KeyEvent;
 import java.awt.event.KeyAdapter;
 import java.awt.Graphics2D;
 import java.awt.Graphics;
 
 
 public class NPanel extends JPanel{
 
    private GameLoop loop;
    
    /**
     * The main constructor.
     */
     
    public NPanel(GameLoop l){
        loop = l;
        setFocusable(true);
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                loop.handleKey(e.getKeyCode(), true);
            }
            public void keyReleased(KeyEvent e){
                loop.handleKey(e.getKeyCode(), false);
            }
        });
    }
 
    /**
     *  Paints the NPanel using a Graphics object.
     *  @param g the Graphics context being painted on.
     */
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
    }
 
 
 
 }
