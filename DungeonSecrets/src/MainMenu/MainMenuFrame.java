package MainMenu;

import javax.swing.*;
import java.awt.*;

public class MainMenuFrame{


    private static JFrame mainMenu = new JFrame();
    private static JPanel mainMenuPanel = new JPanel();
    MainMenuBackground mainMenuBackground;
    MainMenuSinglePlayerButton singlePlayerButton;
    MainMenuMultiPlayerButton multiPlayerButton;
    MainMenuCharactersButton charactersButton;
    MainMenuOptionsButton optionsButton;
    MainMenuQuitButton quitButton;

    public MainMenuFrame(){

        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainMenu.setUndecorated(true);
        mainMenu.setLayout(null);

        mainMenuPanel.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        mainMenuPanel.setLayout(null);

        mainMenu.add(mainMenuPanel);

        mainMenuBackground = new MainMenuBackground();
        singlePlayerButton = new MainMenuSinglePlayerButton();
        multiPlayerButton = new MainMenuMultiPlayerButton();
        charactersButton = new MainMenuCharactersButton();
        optionsButton = new MainMenuOptionsButton();
        quitButton = new MainMenuQuitButton();

        mainMenuPanel.add(quitButton);
        mainMenuPanel.add(optionsButton);
        mainMenuPanel.add(charactersButton);
        mainMenuPanel.add(multiPlayerButton);
        mainMenuPanel.add(singlePlayerButton);
        mainMenuPanel.add(mainMenuBackground);

        mainMenu.setVisible(true);

    }

    //Метод чрез който се затваря MainMenuFrame-а
    public static void closeMenu(){

        mainMenuPanel.setVisible(false);

    }


}
