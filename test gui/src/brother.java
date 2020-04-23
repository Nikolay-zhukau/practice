import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane.*;
public class brother{
    JPanel mainPanel;
    JFrame theFrame;
    public static void main (String[] args){
        new brother().buildGui();
    }
    public void buildGui(){
        theFrame = new JFrame("Brother");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setSize(800,600);
        theFrame.setLayout(null);

        fragmentOne();

        JTextField field2 = new JTextField("PlaningEvent");
        field2.setLayout(null);
        field2.setLocation(130,60);
        field2.setSize(170,20);
        field2.setText("anything");
        field2.setText("");
        field2.selectAll();
        field2.requestFocus();
        theFrame.add(field2);

        JLabel jl2 = new JLabel();
        jl2.setLayout(null);
        jl2.setBounds(20,60,150,20);
        jl2.setText("Priority:");
        theFrame.add(jl2);

        JButton jb2 = new JButton();
        jb2.setLayout(null);
        jb2.setBounds(310,60,150,20);
        theFrame.add(jb2);

        JButton jb3 = new JButton();
        jb3.setLayout(null);
        jb3.setBounds(470,60,150,20);
        theFrame.add(jb3);

        JTextField field3 = new JTextField();
        field3.setLayout(null);
        field3.setLocation(130,100);
        field3.setSize(170,20);
        field3.setText("anything");
        field3.setText("");
        field3.selectAll();
        field3.requestFocus();
        theFrame.add(field3);

        JLabel jl3 = new JLabel();
        jl3.setLayout(null);
        jl3.setBounds(20,100,150,20);
        jl3.setText("Select Peson:");
        theFrame.add(jl3);

        JButton jb4 = new JButton();
        jb4.setLayout(null);
        jb4.setBounds(310,100,150,20);
        theFrame.add(jb4);

        JRadioButton jrb1 = new JRadioButton();
        jrb1.setLayout(null);
        jrb1.setText("Mother");
        jrb1.setBounds(490,100,150,20);
        theFrame.add(jrb1);

        JRadioButton jrb2 = new JRadioButton();
        jrb2.setLayout(null);
        jrb2.setText("Father");
        jrb2.setBounds(490,140,150,20);
        theFrame.add(jrb2);

        JRadioButton jrb3 = new JRadioButton();
        jrb3.setLayout(null);
        jrb3.setText("Brother");
        jrb3.setBounds(490,180,150,20);
        theFrame.add(jrb3);

        JTextField field4 = new JTextField();
        field4.setLayout(null);
        field4.setLocation(130,220);
        field4.setSize(170,20);
        field4.setText("anything");
        field4.setText("");
        field4.selectAll();
        field4.requestFocus();
        theFrame.add(field4);

        JLabel jl4 = new JLabel();
        jl4.setLayout(null);
        jl4.setBounds(20,220,150,20);
        jl4.setText("what will cook:");
        theFrame.add(jl4);

        JButton jb5 = new JButton();
        jb5.setLayout(null);
        jb5.setBounds(310,220,80,20);
        theFrame.add(jb5);

        JCheckBox jchb = new JCheckBox();
        jchb.setText("Breakfast");
        jchb.setLayout(null);
        jchb.setBounds(400,220,100,20);
        theFrame.add(jchb);

        JCheckBox jchb2 = new JCheckBox();
        jchb2.setText("Lunch");
        jchb2.setLayout(null);
        jchb2.setBounds(500,220,80,20);
        theFrame.add(jchb2);

        JCheckBox jchb3 = new JCheckBox();
        jchb3.setText("Dinner");
        jchb3.setLayout(null);
        jchb3.setBounds(580,220,80,20);
        theFrame.add(jchb3);


        JTextField field5 = new JTextField();
        field5.setLayout(null);
        field5.setLocation(130,300);
        field5.setSize(170,20);
        field5.setText("anything");
        field5.setText("");
        field5.selectAll();
        field5.requestFocus();
        theFrame.add(field5);

        JButton jb6 = new JButton();
        jb6.setLayout(null);
        jb6.setBounds(310,300,80,20);
        theFrame.add(jb6);

        JButton jb7 = new JButton();
        jb7.setLayout(null);
        jb7.setBounds(310,340,80,20);
        theFrame.add(jb7);

        JButton jb8 = new JButton();
        jb8.setLayout(null);
        jb8.setBounds(310,380,80,20);
        theFrame.add(jb8);

        //JScrollPane jspn = new JScrollPane(jcb);
       // jspn.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //jspn.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JTable jt = new JTable(23,2);
        JScrollPane jspn = new JScrollPane(jt);
        jspn.setBounds(420,300,200,100);
        theFrame.add(jspn);










        theFrame.setVisible(true);
    }

    private void fragmentOne() {
        JTextField field = new JTextField("PlaningEvent");
        field.setLayout(null);
        field.setLocation(130,20);
        field.setSize(170,20);
        field.setText("anything");
        field.setText("");
        field.selectAll();
        field.requestFocus();
        theFrame.add(field);

        JLabel jl = new JLabel();
        jl.setLayout(null);
        jl.setLocation(20,20);
        jl.setSize(150,20);
        jl.setText("Planing Event:");
        theFrame.add(jl);

        JButton jb = new JButton();
        jb.setText("enter");
        jb.setLayout(null);
        jb.setBounds(310,20,100,20);
        theFrame.add(jb);

        JComboBox jcb = new JComboBox();
        jcb.setLayout(null);
        jcb.setBounds(420,20,200,20);
        theFrame.add(jcb);
    }
}
