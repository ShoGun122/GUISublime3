import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2 {
    public static void main (String [] args)
    {
        test();
    }
    public static void test ()
    {
        JFrame mainFrame = new JFrame();
        Dimension nDim = Toolkit.getDefaultToolkit().getScreenSize();
        mainFrame.setSize(nDim.width/2,nDim.height/2);
        mainFrame.setLocation(nDim.width/4,nDim.height/4);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        String columns [] = {"Path","Author","Data","Location","Tags"};
        Object data= new  Object[15][5];
       // JTable table = new JTable(new DefaultTableModel(new Object[] {"Path","Author","Data","Location","Tags"}));
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        model.addColumn("Path");
        model.addColumn("Author");
        model.addColumn("Data");
        model.addColumn("Location");
        model.addColumn("Tags");
        JScrollPane scrollPane = new JScrollPane(table);
        float wid = nDim.width/2;
        scrollPane.setPreferredSize(new Dimension(nDim.width/3,200));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        JTextField path = new JTextField (100);
        JTextField author = new JTextField (100);
        JTextField date = new JTextField (100);
        JTextField tags = new JTextField (100);
        JTextField location = new JTextField (100);
        JLabel pathT = new JLabel("Path");
        JLabel authorT = new JLabel("Author");
        JLabel dateT = new JLabel("Data");
        JLabel locationT = new JLabel("Location");
        JLabel tagsT = new JLabel("Tags");
        panel.add(pathT);
        panel.add(path);
        panel.add(authorT);
        panel.add(author);
        panel.add(dateT);
        panel.add(date);
        panel.add(tagsT);
        panel.add(tags);
        panel.add(locationT);
        panel.add(location);
        panel.add(scrollPane);
        JButton save = new JButton("save");
        panel.add(save);
        mainFrame.setContentPane(panel);
        mainFrame.setVisible(true);
        //JScrollPane allScrollPane = new ScrollPane();
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newRow [] = {path.getText(),author.getText(),date.getText(),location.getText(),tags.getText()};
                model.addRow(newRow);
            }
        });

    }
}
