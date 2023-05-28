import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailDialog extends JDialog implements ActionListener {

    JButton button;

    public DetailDialog() {
        button = new JButton("Close");
        button.addActionListener(this);
        add(button);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}
