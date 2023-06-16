import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    JButton playButton = new JButton("Play");
    JButton statButton = new JButton("Statistics");
    MenuPanel(GameFrame gameFrame) {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.darkGray);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.setLayout(new GridBagLayout());
        this.add(playButton, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.insets.top = 10;
        this.add(statButton, constraints);
        playButton.addActionListener(e -> {
            gameFrame.cardLayout.show(gameFrame.mainPanel, "game");
            gameFrame.gamePanel.requestFocus();
            gameFrame.gamePanel.startGame();
        });
    }
}
