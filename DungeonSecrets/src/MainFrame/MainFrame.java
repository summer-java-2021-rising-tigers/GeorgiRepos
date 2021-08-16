package MainFrame;

import MainMenu.MainMenuPanel;
import SinglePlayerMenu.SinglePlayerMenuPanel;

import javax.swing.*;

public class MainFrame {

    private static JFrame mainFrame = new JFrame();
    private static MainMenuPanel mainMenuPanel = new MainMenuPanel();
    private static SinglePlayerMenuPanel singlePlayerMenu = new SinglePlayerMenuPanel();

    public MainFrame(){

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setUndecorated(true);
        mainFrame.setLayout(null);
        mainFrame.add(mainMenuPanel);
        mainFrame.add(singlePlayerMenu);
        singlePlayerMenu.setVisible(false);
        mainFrame.setVisible(true);

    }

    public static void closeMainMenu(){

        mainMenuPanel.setVisible(false);

    }

    public static void openMainMenu(){

        mainMenuPanel.setVisible(true);

    }

    public static void openSinglePlayerMenu(){

        singlePlayerMenu.setVisible(true);

    }
}
