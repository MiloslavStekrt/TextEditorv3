import jdk.jshell.tool.JavaShellToolBuilder;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;


public class TextEditor {
    public static void main(String[] args) {
        JFrame w = new JFrame();

        w.setContentPane(new OknoEdit().pane);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(400,600);
        w.pack();
        w.setVisible(true);

    }

    public static void GenerateWindow(@NotNull JFrame name, String nazev, int width, int height){
        name.setVisible(true);
        name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        name.setSize(width, height);
        name.setTitle(nazev);
    }


}
