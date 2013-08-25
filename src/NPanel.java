 
 import javax.swing.JPanel;
 import java.awt.event.KeyEvent;
 import java.awt.event.KeyAdapter;
 import java.awt.Graphics2D;
 import java.awt.Graphics;
 
 /**
 * Contains the panel for drawing to the screen
 */
 public class NPanel extends JPanel{
 
    private GameLoop loop;
    
    /**
     * The main constructor.
     * @param gl Reference to the original GameLoop.
     */
    public NPanel(GameLoop gl){
        loop = gl;
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
        g2d.drawRect((GameLoop.FRAME_WIDTH - Block.SIZE * 10) / 2, 0, Block.SIZE * 10, Block.SIZE * 20);
    }
 
 
 
 }
