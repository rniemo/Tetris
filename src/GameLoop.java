import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
/**                                                                                                 
 * Contains all of the necessary mechanisms for running                                             
 * the game.                                                                                        
 */ 
public class GameLoop {

    private NPanel panel;
    private JFrame frame;
    private Timer timer;

    /**
     * The main constructor.
     */
    public GameLoop(){
        panel = new NPanel(this);
        frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        timer = new Timer(1000 / 60, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                updateLoop();
            }
        });
    }
    
    /**
     * Handles key events based on input.
     * 
     * @param keyCode The integer representing the pressed key.
     * @param pressed Whether or not the key was pressed.
     */
    public void handleKey(int keyCode, boolean pressed){
        switch(keyCode){
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_LEFT: 
                break;
            case KeyEvent.VK_DOWN:
                break;
            case KeyEvent.VK_SPACE:
                break;
        
        
        }
    }
    
    /**
     * The actual game loop.
     */
    public void updateLoop(){
    
    }

    /**
     * Starts the game loop logic.
     */
    public void start(){
        frame.setVisible(true);
        timer.start();
    }

        
    /**
     * The main method
     * 
     * @param args The command line arguments, unused here.
     */
    public static void main(String[] args) {
        new GameLoop().start();
    }
}

