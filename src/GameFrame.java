// JFrame - This is the window where the game will happen.
import javax.swing.JFrame;

public class GameFrame extends JFrame{

    GameFrame(){

        // Add a game panel,set the title of the panel and add the closing operation.
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cannot resize window, pack allows frame to sit snug around all components added.
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        // Middle of the screen function.
        this.setLocationRelativeTo(null);

    }

}
