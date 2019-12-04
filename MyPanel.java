import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyPanel extends JPanel implements ActionListener 
{
    private JLabel lblDado;
    private JButton btnGenera;
    private JButton btnAzzera;
    private Partita partita;

    public MyPanel(Partita p) 
    {
        partita=p;
        lblDado=new JLabel("DADO : " + partita.getDado(),SwingConstants.CENTER);
        btnGenera=new JButton("GIOCA");
        btnAzzera=new JButton("CANCELLA");
        Border border=LineBorder.createBlackLineBorder();
        GridLayout layout=new GridLayout(3, 1);
        setLayout(layout);
        setSize(300, 300);

        lblDado.setBorder(border);
        btnGenera.setBorder(border);
        btnAzzera.setBorder(border);

        
        this.add(btnGenera);
        this.add(btnAzzera);
        this.add(lblDado);
        btnAzzera.addActionListener(this);
        btnGenera.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()== btnGenera)
        {
            partita.generaNumero();
            lblDado.setText("Ciao DADO : " + Integer.toString(partita.getDado()));
        }
         else
        {
            partita.setDado(0);
            lblDado.setText("INIZIA IL GIOCO : " + Integer.toString(partita.getDado()));   
        }
    }
}
