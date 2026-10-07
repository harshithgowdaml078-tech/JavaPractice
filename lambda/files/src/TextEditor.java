import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame {

    JTextArea textArea;

    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;

    JMenuItem newItem;
    JMenuItem clearItem;
    JMenuItem exitItem;

    JMenuItem cutItem;
    JMenuItem copyItem;
    JMenuItem pasteItem;

    public TextEditor() {

        setTitle("Simple Text Editor");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text Area
        textArea = new JTextArea();

        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane =
                new JScrollPane(textArea);

        add(scrollPane);

        // Menu Bar
        menuBar = new JMenuBar();

        // File Menu
        fileMenu = new JMenu("File");

        newItem = new JMenuItem("New");
        clearItem = new JMenuItem("Clear");
        exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(clearItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Edit Menu
        editMenu = new JMenu("Edit");

        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add menus
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        // New
        newItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                textArea.setText("");
            }
        });

        // Clear
        clearItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                textArea.setText("");
            }
        });

        // Exit
        exitItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        // Cut
        cutItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                textArea.cut();
            }
        });

        // Copy
        copyItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                textArea.copy();
            }
        });

        // Paste
        pasteItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                textArea.paste();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}