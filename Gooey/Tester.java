import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class Tester
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    // varibles
     
	//Draw the frame	
	JFrame f = new JFrame();
    f.setVisible(true);
    f.setSize(1200, 1200);
    f.getContentPane().setBackground(Color.YELLOW); 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //create a panel with layout    
    JPanel p = new JPanel(new GridBagLayout());
    p.setBackground(Color.PINK);
    
//add the buttons
    JButton B1 = new JButton("Add");
    JButton B2 =new JButton("Subtract");
    JButton B3 =new JButton("Multiply");
    final JTextField T1 = new JTextField(" ",8);
    final JTextField T2 = new JTextField(" ",8);
    final JTextField T3 = new JTextField(" ",8);
    
//gridbags lets us place them around  
    GridBagConstraints c = new GridBagConstraints();
    c.insets = new Insets(25,15,25,15); //this is how many pixels apart
    
    //button 1 location
    c.gridx = 1;
    c.gridy = 1;
    p.add(B1,c);
    
      //button 2 location
    c.gridx =1;
    c.gridy =3;
    p.add(B2,c);
    
    //button 3 location
    c.gridx =1;
    c.gridy = 5;
    p.add(B3,c);
    
    //text1 location
    c.gridx =0;
    c.gridy =8;
    p.add(T1,c);
    
    //text 2 location
    c.gridx =2;
    c.gridy =8;
    p.add(T2,c);
       
    //add all to the frame
    f.add(p, BorderLayout.NORTH);
       
    //actions for the buttons, like subs in vb that you call
    
    B1.addActionListener(new ActionListener() {
        
         public void actionPerformed(ActionEvent e) {
             String Text1Value = T1.getText(); 
             String Text2Value = T2.getText();
             
             double x;
             double y;
             x = Double.parseDouble(Text1Value);
             y = Double.parseDouble(Text2Value);
             
             //adding the numbers
             x= x + y;
            JOptionPane.showMessageDialog(null,"the sum of the numbers is ", "title", JOptionPane.PLAIN_MESSAGE );
            JOptionPane.showMessageDialog(null,x,"Adding", JOptionPane.PLAIN_MESSAGE );
            
         }          
      });

    B2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             String Text1Value = T1.getText(); 
             String Text2Value = T2.getText();
             
             double x;
             double y;
             x = Double.parseDouble(Text1Value);
             y = Double.parseDouble(Text2Value);
             
            //subtracting the numbers
            x = x - y;
            JOptionPane.showMessageDialog(null,"the difference of the numbers is ", "title", JOptionPane.PLAIN_MESSAGE );
            JOptionPane.showMessageDialog(null,x,"Subtracting", JOptionPane.PLAIN_MESSAGE );
         }          
      });
    
      B3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             String Text1Value = T1.getText(); 
             String Text2Value = T2.getText();
             
             double x;
             double y;
             x = Double.parseDouble(Text1Value);
             y = Double.parseDouble(Text2Value);
             
            //subtracting the numbers
            x = x * y;
            JOptionPane.showMessageDialog(null,"the product of the numbers is ", "title", JOptionPane.PLAIN_MESSAGE );
            JOptionPane.showMessageDialog(null,x,"Multiplying", JOptionPane.PLAIN_MESSAGE );
         }          
      });
      
    }
   
}
