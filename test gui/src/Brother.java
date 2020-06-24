import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.Container;


public class Brother {
    JPanel mainPanel;
    JFrame theFrame;
    JPanel jCheckBoxPanel;
    DefaultTableModel model;
    JPanel jRadioButtonPanel;
    private Object[] columnsHeader = new String[]{"Today", "Tomarrow"};

    public static void main(String[] args) {
        new Brother().buildGui();
    }

    public void buildGui() {
        theFrame = new JFrame("Brother");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setSize(800, 600);
        theFrame.setLayout(null);

        fragmentOne();

        fragmentTwo();

        fragmentThree();

        fragmentFour();

        fragmentFive();


        theFrame.setVisible(true);
    }


    public void fragmentFive() {
        JTextField field5 = new JTextField();
        field5.setLayout(null);
        field5.setLocation(130, 300);
        field5.setSize(170, 20);
        field5.setText("anything");
        field5.setText("");
        field5.selectAll();
        field5.requestFocus();
        theFrame.add(field5);

        JButton jb6 = new JButton();
        jb6.setLayout(null);
        jb6.setBounds(310, 300, 110, 20);
        jb6.setText("High priority");
        theFrame.add(jb6);

        JButton jb7 = new JButton();
        jb7.setLayout(null);
        jb7.setBounds(310, 340, 110, 20);
        jb7.setText("Low priority");
        theFrame.add(jb7);

        JButton jb8 = new JButton();
        jb8.setLayout(null);
        jb8.setBounds(310, 380, 110, 20);
        jb8.setText("High priority");
        theFrame.add(jb8);



        String[] nameTableColumns = new String[]{"High priority", "Low priority"};
        JTable jt = new JTable();
        DefaultTableModel tableModel = (DefaultTableModel)jt.getModel();
        tableModel.setColumnCount(2);
        tableModel.setRowCount(1);
        tableModel.setColumnIdentifiers(nameTableColumns);
        JScrollPane jspn = new JScrollPane(jt);
        jspn.setBounds(440, 300, 200, 100);


        theFrame.add(jspn);

        JLabel jl5 = new JLabel();
        jl5.setText("Event Memo:");
        jl5.setLayout(null);
        jl5.setBounds(20, 300, 150, 20);
        theFrame.add(jl5);


        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textEqualsJTextField = field5.getText();
                jt.setValueAt(textEqualsJTextField,0,0);
                field5.setText(null);

            }
        });

        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFromColumnOne = (String)jt.getValueAt(0,0);
                jt.setValueAt(textFromColumnOne,0,1);
                jt.setValueAt(null,0,0);
            }
        });

        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFromColumnTwo = (String)jt.getValueAt(0,1);
                jt.setValueAt(textFromColumnTwo,0,0);
                jt.setValueAt(null,0,1);
            }
        });
    }


    public void fragmentFour() {
        jCheckBoxPanel = new JPanel();
        jCheckBoxPanel.setLayout(new FlowLayout());
        jCheckBoxPanel.setBounds(390, 220, 300, 30);
        String[] eating = {"Breakfast", "Lunch", "Dinner"};
        Map<String,JCheckBox> jCheckBoxGroup = new HashMap<>();
        for (String s : eating){
            JCheckBox jcb = new JCheckBox(s);
            jCheckBoxGroup.put(s, jcb);
            jCheckBoxPanel.add(jcb);
        }


        theFrame.add(jCheckBoxPanel);


        JTextField field4 = new JTextField();
        field4.setLayout(null);
        field4.setLocation(130, 220);
        field4.setSize(170, 20);
        field4.setText("anything");
        field4.setText("");
        field4.selectAll();
        field4.requestFocus();
        theFrame.add(field4);

        JLabel jl4 = new JLabel();
        jl4.setLayout(null);
        jl4.setBounds(20, 220, 150, 20);
        jl4.setText("What Will Cook:");
        theFrame.add(jl4);


        JButton jb5 = new JButton();
        jb5.setLayout(null);
        jb5.setBounds(310, 220, 80, 20);
        jb5.setText("Choose");
        theFrame.add(jb5);

        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textEqualsEating = field4.getText();
                JCheckBox selectedBox = jCheckBoxGroup.get(textEqualsEating);
                if (selectedBox == null) {
                    JOptionPane.showMessageDialog(null, "This tipe of eat does not exist");
                } else {
//                   if (selectedBox.isSelected()){
//                       selectedBox.setSelected(false);
//                   }else {
//                       selectedBox.setSelected(true);
//                   }
                    selectedBox.setSelected(!selectedBox.isSelected());
                }
            }
        });
    }

    public void fragmentThree() {
        JTextField field3 = new JTextField();
        field3.setLayout(null);
        field3.setLocation(130, 100);
        field3.setSize(170, 20);
        field3.setText("anything");
        field3.setText("");
        field3.selectAll();
        field3.requestFocus();
        theFrame.add(field3);

        JLabel jl3 = new JLabel();
        jl3.setLayout(null);
        jl3.setBounds(20, 100, 150, 20);
        jl3.setText("Select Peson:");
        theFrame.add(jl3);

        JButton jb4 = new JButton();
        jb4.setText("Choose");
        jb4.setLayout(null);
        jb4.setBounds(310, 100, 150, 20);

        theFrame.add(jb4);


        jRadioButtonPanel = new JPanel(new GridLayout(0, 1, 0, 5));
        jRadioButtonPanel.setBorder(BorderFactory.createTitledBorder("Who"));
        jRadioButtonPanel.setBounds(490, 100, 150, 100);
        String[] familyMember = {"Mother", "Father", "Brother", "Cousin"};
        Map<String,JRadioButton> jRadioButtonGroup = new HashMap<>();
                ButtonGroup bg = new ButtonGroup();

        for (String s : familyMember) {
            JRadioButton jrb = new JRadioButton(s);
            jRadioButtonGroup.put(s, jrb);
            jRadioButtonPanel.add(jrb);
            bg.add(jrb);
        }
        theFrame.add(jRadioButtonPanel);
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textEqualsFamilyMember = field3.getText();
                JRadioButton selectedRadio = jRadioButtonGroup.get(textEqualsFamilyMember);
                if (selectedRadio == null) {

                    JOptionPane.showMessageDialog(null, "This family member does not exist");
                } else {
                    selectedRadio.setSelected(true);
                }
            }
        });
    }

    public void fragmentTwo() {
        JButton jb3 = new JButton();
        JTextField field2 = new JTextField(10);
        JButton jb2 = new JButton();


        field2.setLayout(null);
        field2.setLocation(130, 60);
        field2.setSize(170, 20);
        field2.setText("anything");
        field2.setText("");
        field2.selectAll();
        field2.requestFocus();
        field2.setToolTipText("No more than 10 characters");
        theFrame.add(field2);


        JLabel jl2 = new JLabel();
        jl2.setLayout(null);
        jl2.setBounds(20, 60, 150, 20);
        jl2.setText("Priority:");
        theFrame.add(jl2);


        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
                jb3.setText(field2.getText());
                field2.setText(null);


            }
        });
        jb2.setLayout(null);
        jb2.setBounds(310, 60, 150, 20);
        theFrame.add(jb2);


        jb3.setLayout(null);

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jb3Text = jb2.getText();

                jb2.setText(jb3.getText());
                jb3.setText(jb3Text);


                //присвои

            }
        });
        jb3.setBounds(470, 60, 150, 20);
        theFrame.add(jb3);
    }

    JComboBox<String> jcb = new JComboBox<>();

    public void fragmentOne() {
        JTextField field = new JTextField();
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jcb.addItem(field.getText());
                field.setText(null);
            }
        });
        field.setLayout(null);
        field.setLocation(130, 20);
        field.setSize(170, 20);
        field.setText("anything");
        field.setText("");
        field.selectAll();
        field.requestFocus();

        theFrame.add(field);

        JLabel jl = new JLabel();
        jl.setLayout(null);
        jl.setLocation(20, 20);
        jl.setSize(150, 20);
        jl.setText("Planing Event:");

        theFrame.add(jl);


        JButton jb = new JButton();
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //получить текст который хочу добавить
                String textToAdd = field.getText();

                //проверить есть ли текст в комбо бокс
                boolean textFound = false;
                for (int textIndex = 0; textIndex < jcb.getItemCount(); textIndex++) {
                    String textCheck = jcb.getItemAt(textIndex);
                    if (textCheck.equals(textToAdd)) {
                        textFound = true;
                        break;
                    }
                }

                //если есть совпадения вывести сообщение об ошибке
                if (textFound) {
                    JOptionPane.showMessageDialog(null, "This event name already exists");

                } else {
                    jcb.addItem(textToAdd);
                }

                //иначе добавить в комбобокс


                field.setText(null);


            }
        });
        jb.setText("enter");
        jb.setLayout(null);
        jb.setBounds(310, 20, 100, 20);


        theFrame.add(jb);


        jcb.setLayout(null);
        jcb.setBounds(420, 20, 200, 20);
        jcb.setMaximumRowCount(5);

        jcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        theFrame.add(jcb);


    }
}

