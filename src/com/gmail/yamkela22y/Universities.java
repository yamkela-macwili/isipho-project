/*Universities Frame
  Provides the list of Universities.
*/
package com.gmail.yamkela22y;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Universities extends JFrame implements ActionListener{
    
    //universities 
     private final JButton btnWSU = new JButton("WSU-Walter Sisulu University");
     private final JButton btnUJ = new JButton("UJ-University of johannesburg");
     private final JButton btnUFS = new JButton("UFS-University of Free State");
     private final JButton btnNWU = new JButton("NWU-North West University");
     private final JButton btnNMU = new JButton("NMU-Neslom Mandela Universtity");
     private final JButton btnCPUT = new JButton("CPUT-Cape Peninstula University of Technology");
     private final JButton btnTUT = new JButton("TUT-Thswane University of Technology");
     private final JButton btnCUT = new JButton("CUT-Central University of Technology");
     private final JButton btnUFH = new JButton("UFH-University of Fort Hare");
     private final JButton btnRhodes = new JButton("Rhodes University");
     private final JButton btnUCT = new JButton("University of Cape Town-UCT");
     private final JButton btnSUN = new JButton("Stellenbosch University-SUN");
     private final JButton btnUP = new JButton("University of Pretoria-UP");
     private final JButton btnUWC = new JButton("University of the Western Cape-UWC ");
     private final JButton btnUMP = new JButton("University of Mpumalanga-UMP");
     private final JButton btnUL = new JButton("University of Limpopo-UL ");
     private final JButton btnUNIZULU = new JButton("University of Zululand-UNIZULU");
     private final JButton btnUNISA = new JButton("University of South Africa-UNISA");
     private final JButton btnSPU = new JButton("Sol Plaatjie University-SPU");
     private final JButton btnUKZN = new JButton("University of KwaZulu-Natal-UKZN");
     
     ImageIcon icon = null;     // Changing the default icon
     
     public Universities(){
        super("Universities");
        setBounds(250, 250, 350, 350);
        getContentPane().setBackground(new Color(123,50,250)); // backgroung color
        setVisible(true);
        setResizable(false);
        setLayout(new GridLayout(10, 1, 5, 5));
        icon = new ImageIcon("C:\\Users\\YAMKELA MACWILI\\Documents\\NetBeansProjects\\Gift\\src\\com\\gmail\\yamkela22y\\isiphoLogo.jpg");
        setIconImage(icon.getImage());
        
        add(btnWSU);
           btnWSU.addActionListener(this);
        add(btnUJ);
            btnUJ.addActionListener(this);
        add(btnUFS);
            btnUFS.addActionListener(this);
        add(btnNWU);
            btnNWU.addActionListener(this);
        add(btnNMU);
            btnNMU.addActionListener(this);
        add(btnCPUT);
            btnCPUT.addActionListener(this);
        add(btnTUT);
            btnTUT.addActionListener(this);
        add(btnCUT);
            btnCUT.addActionListener(this);
        add(btnUFH);
            btnUFH.addActionListener(this);
        add(btnRhodes);
            btnRhodes.addActionListener(this);
            
        add(btnUCT);
            btnUCT.addActionListener(this);
        add(btnSUN);
            btnSUN.addActionListener(this);
        add(btnUP);
            btnUP.addActionListener(this);
        add(btnUWC);
            btnUWC.addActionListener(this);
        add(btnUMP);
            btnUMP.addActionListener(this);
        add(btnUL);
            btnUL.addActionListener(this);
        add(btnUNIZULU);
            btnUNIZULU.addActionListener(this);
        add(btnUNISA);
            btnUNISA.addActionListener(this);
        add(btnSPU);
            btnSPU.addActionListener(this);
        add(btnUKZN);
            btnUKZN.addActionListener(this);
        pack(); 
     }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Desktop desktop = Desktop.getDesktop();

        if (source == btnWSU) {
            try {
                desktop.browse(new URI("www.wsu.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (source == btnUJ) {
             try {
                desktop.browse(new URI("www.uj.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (source == btnUFS) {
             try {
                desktop.browse(new URI("www.ufs.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (source == btnNWU) {
            try {
                desktop.browse(new URI("www.nwu.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (source == btnNMU) {
        
            try {
                desktop.browse(new URI("www.mandela.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
        } else if (source == btnCPUT) {
            try {
                desktop.browse(new URI("www.cput.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (source == btnTUT) {
             try {
                desktop.browse(new URI("www.tut.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (source == btnCUT) {
             try {
                desktop.browse(new URI("www.cut.ac.za"));
            } catch (URISyntaxException | IOException ex) {
               JOptionPane.showMessageDialog(null, ex);
            }
        } else if (source == btnUFH) {
            try {
                desktop.browse(new URI("www.ufh.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else if (source == btnRhodes) {
             try {
                desktop.browse(new URI("www.ru.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (source == btnUCT) {
             try {
                desktop.browse(new URI("www.uct.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (source == btnSUN) {
             try {
                desktop.browse(new URI("www.sun.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (source == btnUP) {
             try {
                desktop.browse(new URI("www.up.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (source == btnUWC) {
             try {
                desktop.browse(new URI("www.uwc.ac.za"));
            } catch (URISyntaxException | IOException ex) {
               JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (source == btnUMP) {
             try {
                desktop.browse(new URI("www.ump.ac.za"));
            } catch (URISyntaxException | IOException ex) {
               JOptionPane.showMessageDialog(null, ex);            }
        }
        else if (source == btnUL) {
             try {
                desktop.browse(new URI("www.ul.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (source == btnUNIZULU) {
             try {
                desktop.browse(new URI("www.unizulu.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (source == btnUNISA) {
             try {
                desktop.browse(new URI("www.unisa.ac.za"));
            } catch (URISyntaxException | IOException ex) {
               JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (source == btnSPU) {
             try {
                desktop.browse(new URI("www.spu.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);;
            }
        }
        else if (source == btnUKZN) {
             try {
                desktop.browse(new URI("www.ukzn.ac.za"));
            } catch (URISyntaxException | IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
}

