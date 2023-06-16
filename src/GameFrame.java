import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class GameFrame extends JFrame {
    GamePanel gamePanel;
    MenuPanel menuPanel;
    JPanel mainPanel;
    CardLayout cardLayout;

    GameFrame() {
        gamePanel = new GamePanel(this);
        menuPanel = new MenuPanel(this);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(gamePanel, "game");
        mainPanel.add(menuPanel, "menu");
        cardLayout.show(mainPanel, "menu");

        this.add(mainPanel);
        gamePanel.setFocusable(true);

        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
