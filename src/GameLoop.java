
/**
 * Contains all of the necessary mechanisms for running
 * the game.
 */
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
 
public class GameLoop {

    private NPanel panel;
    private JFrame frame;
    private Timer timer;

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
    
        
    public void updateLoop(){
    
    }

    public void start(){
        frame.setVisible(true);
        timer.start();
    }

        
    /**
     * The main method
     * 
     * @param args
     *          The command line arguments, unused here.
     */
    public static void main(String[] args) {
        new GameLoop().start();
    }
}

