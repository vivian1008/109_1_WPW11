import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EncryptFrame extends JFrame{
    private Container cp;
    private JTextField jtf = new JTextField("");
    private JTextArea jtaP = new JTextArea("");
    private JScrollPane jspP = new JScrollPane(jtaP);
    private JTextArea jtaC = new JTextArea("");
    private JScrollPane jspC = new JScrollPane(jtaC);
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmu = new JMenu("File");
    private JMenuItem jmi = new JMenuItem("Open");
    private JPanel jpnCtr = new JPanel(new GridLayout(2,5,1,1));
    private JPanel jpnC = new JPanel(new GridLayout(1,2,1,1));
    private JLabel jlbA = new JLabel("Encrypt Algotithm");
    private JLabel jlbP = new JLabel("Password");
    private JLabel jlb = new JLabel("Encrypt/Decrypt");
    private JButton go = new JButton("GO!");
    private JButton re = new JButton("Resset");
    private JButton ext = new JButton("Exit");
    private JRadioButton jrbE = new JRadioButton("Encrypt");
    private JRadioButton jrbD = new JRadioButton("Decrypt");
    private ButtonGroup bg = new ButtonGroup();
    private JFileChooser jfc = new JFileChooser();
    private String algos[] = {"XOR" , "Caeser"} ;
    private JComboBox jcb = new JComboBox(algos);

    public EncryptFrame(){
        init();
    }

    private void init(){
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setTitle("Encrypt System");
        this.setJMenuBar(jmb);
        jmu.add(jmi);
        jmb.add(jmu);
        this.setBounds(10,10,700,500);
        jpnC.setSize(400,200);
        cp.add(jpnCtr,BorderLayout.NORTH);
        cp.add(jpnC,BorderLayout.CENTER);
        jpnCtr.add(jrbE);
        jpnCtr.add(jrbD);
        jpnCtr.add(jlbA);
        jpnCtr.add(jcb);
        jpnCtr.add(jlbP);
        jpnCtr.add(go);
        jpnCtr.add(jlb);
        jpnCtr.add(jrbE);
        jpnCtr.add(jrbD);
        jpnCtr.add(re);
        jpnCtr.add(ext);
        jpnC.add(jspC);
        jpnC.add(jspP);

        this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });

    ext.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            System.exit(0);
        }
    });
    }
}