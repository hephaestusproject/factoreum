package factoreum;

import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {            //Tworzenie nowego okna

    public Window(int width, int height, String title, Main board){
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(board);
        frame.setVisible(true);
        board.start();
    }

}
