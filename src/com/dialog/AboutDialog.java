package com.dialog;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutDialog extends JDialog {
    public AboutDialog(JFrame owner) {
        super(owner, "About DialogTest", true);

        add(new JLabel("<html><h1>Core Java</i></h1><hr>By Cay Horstmann</html>"), BorderLayout.CENTER);

        var ok = new JButton("OK");
        ok.addActionListener(event -> setVisible(false));

        var panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);
        pack();
    }
}