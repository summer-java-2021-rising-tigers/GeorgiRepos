package MainMenu;

import javax.swing.*;
import java.awt.*;

public class MainMenuFrame{


    private static JFrame mainMenu = new JFrame();
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

        mainMenuBackground = new MainMenuBackground();
        singlePlayerButton = new MainMenuSinglePlayerButton();
        multiPlayerButton = new MainMenuMultiPlayerButton();
        charactersButton = new MainMenuCharactersButton();
        optionsButton = new MainMenuOptionsButton();
        quitButton = new MainMenuQuitButton();

        mainMenu.add(quitButton);
        mainMenu.add(optionsButton);
        mainMenu.add(charactersButton);
        mainMenu.add(multiPlayerButton);
        mainMenu.add(singlePlayerButton);
        mainMenu.add(mainMenuBackground);

        mainMenu.setVisible(true);

    }

    //Метод чрез който се затваря MainMenuFrame-а
    public static void closeMenu(){

        mainMenu.setVisible(false);

    }


}
