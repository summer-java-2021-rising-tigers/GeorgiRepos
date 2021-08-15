package MultiPlayerMenu;

import javax.swing.*;

public class MultiPlayerMenuFrame {

    JFrame multiplayerMenu = new JFrame();

    public MultiPlayerMenuFrame(){

        multiplayerMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        multiplayerMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        multiplayerMenu.setUndecorated(true);
        multiplayerMenu.setLayout(null);
        multiplayerMenu.setVisible(true);

    }
}
