package SinglePlayerMenu;

import javax.swing.*;
import java.awt.*;

public class SinglePlayerMenuPanel extends JPanel {

    SinglePlayerMenuBackground background;

    public SinglePlayerMenuPanel(){

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLayout(null);

        background = new SinglePlayerMenuBackground();

        this.add(background);

        this.setVisible(true);


    }

}
