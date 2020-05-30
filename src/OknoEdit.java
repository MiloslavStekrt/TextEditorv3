import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OknoEdit {
    public JTextArea textArea;
    public JButton save;
    public JButton Exit;
    public JPanel pane;
    private JTextField TextNazev;

    public OknoEdit() {

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nazev = TextNazev.getText().toLowerCase().replace(" ", "_")+".txt";
                File f = new File(nazev);
                if(f.exists() && !f.isDirectory()) {

                    ExistFile dialog = new ExistFile(nazev, textArea.getText());
                    dialog.pack();
                    dialog.setVisible(true);

                }

            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
