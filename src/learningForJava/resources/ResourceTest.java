package learningForJava.resources;

import java.io.*;
import java.net.*;
import java.nio.charset.*;
import javax.swing.*;

public class ResourceTest {
    public static void main(String[] args)
        throws IOException {
        Class c1 = ResourceTest.class;
        URL aboutURL = c1.getResource("about.gif");
        var icon = new ImageIcon(aboutURL);

        InputStream stream = c1.getResourceAsStream("data/about.txt");
        var about = new String(stream.readAllBytes(), "UTF-8");

        InputStream stream2 = c1.getResourceAsStream("/corejava/title.txt");
        var title = new String(stream2.readAllBytes(), StandardCharsets.UTF_8).trim();

        JOptionPane.showMessageDialog(null, about, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
