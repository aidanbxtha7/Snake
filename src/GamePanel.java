import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel<keyEvent> extends JPanel implements ActionListener {


    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int [GAME_UNITS];
    int bodyParts = 6;
    int applesEaten = 0;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_WIDTH));
        this.setBackground(Color.BLACK);
        setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics G) {
        super.paintComponent(G);
    }

    public void draw(Graphics G) {
        
    }

    public void newApple() {

    }

    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver(Graphics G) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            
        }
    }

}
