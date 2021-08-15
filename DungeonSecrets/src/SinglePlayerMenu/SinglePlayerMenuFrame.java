package SinglePlayerMenu;

import javax.swing.*;

public class SinglePlayerMenuFrame {

    JFrame singlePlayerMenu = new JFrame();

    public SinglePlayerMenuFrame(){

        singlePlayerMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        singlePlayerMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        singlePlayerMenu.setUndecorated(true);
        singlePlayerMenu.setLayout(null);
        singlePlayerMenu.setVisible(true);

    }

}
