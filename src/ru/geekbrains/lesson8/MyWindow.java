package ru.geekbrains.lesson8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setLayout(new GridLayout(3,3));
        JPanel[] jp = new JPanel[6];
        for (int i=0; i<6; i++) {
            jp[i] = new JPanel();
            add(jp[i]);
            jp[i].setBackground(new Color(30 + i * 20, 150 + i * 20, 170 + i * 10));
        }
        jp[0].setLayout(new BorderLayout());
        JTextArea jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        jp[0].add(jsp);

        jp[1].setLayout(new FlowLayout());
        JRadioButton[] jrb = new JRadioButton[4];
        ButtonGroup bgr = new ButtonGroup();
        ButtonGroup bgr2 = new ButtonGroup();
        ButtonGroup bgr3 = new ButtonGroup();
        for (int i=0; i<jrb.length; i++) {
            jrb[i] = new JRadioButton("Option #" + i);
            if (i<2) {
                bgr.add(jrb[i]);
            } else {
                bgr2.add(jrb[i]);
            }
            jp[1].add(jrb[i]);
        }
        JCheckBox[] jcb = new JCheckBox[4];
        for (int i = 0; i<jcb.length; i++) {
            jcb[i] = new JCheckBox("Check #" + i);
//                bgr3.add(jcb[i]); //множественный выбор
            jp[1].add(jcb[i]);
        }

        jp[2].setLayout(new FlowLayout());
        String[] comboStr = {"Item #1", "Item #2", "Item #3", "Item #4"};
        JComboBox<String> jcombo1 = new JComboBox<>(comboStr);
        JComboBox<String> jcombo2 = new JComboBox<>(comboStr);
        jp[2].add(jcombo1);
        jp[2].add(jcombo2);

        jcombo1.addActionListener(e-> System.out.println("///*-8565"));


        jp[3].setLayout(new FlowLayout());
        JSlider js = new JSlider();
        final JLabel jlab = new JLabel("Value 50");
        js.setMaximum(100);
        js.setMinimum(0);
        js.setValue(50);
        jp[3].add(js);
        jp[3].add(jlab);
        js.addChangeListener(e ->jlab.setText("Value: " + js.getValue()));


        jp[4].setLayout(new FlowLayout());
        jp[4].setBackground(new Color(175, 238, 238));
        JButton jb = new JButton("Button");
        jp[4].add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed...");
            }
            });


        jp[5].setLayout(new FlowLayout());
        JTextField jt = new JTextField(null, null, 10);
        jp[5].add(jt);
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Your message: " + jt.getText());
                jta.append(jt.getText());
            }
        });

        setVisible(true);
    }

}
