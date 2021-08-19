package OptionsMenu;

import CharactersMenu.CharactersMenuBackground;
import backEnd.utility.ScreenResolution;
import javax.swing.*;
import java.awt.*;

public class OptionsMenuPanel extends JPanel{

    OptionsMenuBackground background;
    OptionsMenuBackButton backButton = new OptionsMenuBackButton();
    JLabel title = new JLabel("Options");

    public OptionsMenuPanel(){

        title.setBounds((ScreenResolution.getScreenWidth()/2)-100,0,200,50);
        title.setFont(new Font("Immortal",Font.BOLD,30));
        title.setHorizontalAlignment(JLabel.CENTER);

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        background = new OptionsMenuBackground();

        this.add(backButton);
        this.add(title);
        this.add(background);

        this.setVisible(true);

    }


}
