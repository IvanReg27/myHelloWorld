package learningForJava.text;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextComponentTest {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TextComponentFrame frame = new TextComponentFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
class TextComponentFrame extends JFrame {

       public static final int TEXTAREA_ROWS = 8;
       public static final int TEXTAREA_COLUMNS = 20;

    public TextComponentFrame() {
            var textField = new JTextField();
            var passwordField = new JPasswordField();

            var northPanel = new JPanel();
            northPanel.setLayout(new GridLayout(2, 2));
            northPanel.add(new JLabel("User name: ", SwingConstants.RIGHT));
            northPanel.add(textField);
            northPanel.add(new JLabel("Password: ", SwingConstants.RIGHT));
            northPanel.add(passwordField);
            add(northPanel, BorderLayout.NORTH);
            var textArea = new JTextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
            var scrollPane = new JScrollPane(textArea);
            add(scrollPane, BorderLayout.CENTER);

            JPanel southPanel = new JPanel();
            JButton insertButton = new JButton("Insert");
            southPanel.add(insertButton);
            insertButton.addActionListener(event -> textArea.append("User name: " + textField.getText() + " Password: " + new String(passwordField.getPassword()) + "\n"));
            add(southPanel, BorderLayout.SOUTH);
            pack();
        }
    }