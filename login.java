import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;


public class login extends JFrame {

	private static final long serialVersionUID = 1L;

	public login() {
    	
    	setLayout(new FlowLayout());
    	
    	JLabel l1 = new JLabel("Username: ");
    	add(l1);
    	
    	JTextField lt1 = new JTextField(10);
    	add(lt1);
    	
    	JLabel l2 = new JLabel("Password: ");
    	add(l2);
    	
    	JTextField lt2 = new JTextField(10);
    	add(lt2);
        
    	JButton b1 = new JButton("Enter");
    	add(b1);
    	
    	b1.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			String name = lt1.getText();
    			String pass = lt2.getText();
    			
    			if(name.equals("Raj") && pass.equals("12345")) {
    				JFrame frame = new JFrame();
    				frame.setTitle("Frame");
    				frame.setSize(250, 200);
    				frame.setVisible(true);
    				dispose();
    			} else {
    				JOptionPane.showMessageDialog(null,"Wrong Password/Username");
    				lt1.setText("");
    				lt2.setText("");
    				lt1.requestFocus();
    			}
    		}
    	});
            	
        setTitle("Login"); 
        setSize(250, 200); 
        setVisible(true);
    }

    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
        	@Override
            public void run() {
            	new login();
            }
        });
    }
}