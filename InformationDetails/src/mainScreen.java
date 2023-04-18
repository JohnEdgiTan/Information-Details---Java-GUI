import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.util.*;
import javax.swing.*;

public class mainScreen implements ActionListener {
	private static JLabel firstnamelabel;
	private static JTextField firstnametext;
	private static JLabel lastnamelabel;
	private static JTextField lastnametext;
	private static JLabel birthdatelabel;
	private static JTextField bdText;
	private static JLabel emaillabel;
	private static JTextField emailtext;
	private static JLabel results[];
	private static JLabel sexlabel;
	private static JTextField sextext;
	private static int v =210;
	private static int count =0;
	
	
	public static void main (String[]args) {
		//screen
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(300,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		Font font = new Font ("Courier",Font.PLAIN,12);
		firstnamelabel = new JLabel("First Name: ");
		firstnamelabel.setBounds(10,20,80,25);
		panel.add(firstnamelabel);
		firstnametext = new JTextField(50);
		firstnametext.setBounds(100,20,165,25);
		panel.add(firstnametext);
		
		lastnamelabel = new JLabel("Last Name: ");
		lastnamelabel.setBounds(10,50,80,25);
		panel.add(lastnamelabel);
		lastnametext = new JTextField(50);
		lastnametext.setBounds(100,50,165,25);
		panel.add(lastnametext);
		
		sexlabel = new JLabel("Sex: ");
		sexlabel.setBounds(10,80,80,25);
		panel.add(sexlabel);
		sextext = new JTextField(6);
		sextext.setBounds(100,80,165,25);
		panel.add(sextext);
		//birthday
		birthdatelabel = new JLabel("Birth Date: ");
		birthdatelabel.setBounds(10,120,80,25);
		panel.add(birthdatelabel);
		bdText = new JTextField(50);
		bdText.setBounds(100,120,165,25);
		panel.add(bdText); 
		//email
		emaillabel = new JLabel("Email: ");
		emaillabel.setBounds(10,150,80,25);
		panel.add(emaillabel);
		emailtext = new JTextField(50);
		emailtext.setBounds(100,150,165,25);
		panel.add(emailtext); 
		//button
		JButton recordBT = new JButton("Record");
		recordBT.addActionListener(new mainScreen());
		recordBT.setBounds(10,180,80,25);
		panel.add(recordBT);
		
		results = new JLabel[15];
	    for (int i = 0;i<15;i++){                   
	    		 results[i] = new JLabel(" ");
	             results[i].setBounds(10,v,280,80);
	             panel.add(results[i]);
	             v+=50;
	        }
	    frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		String firstname = firstnametext.getText();
		String lastname = lastnametext.getText();
		String sex = sextext.getText();
		String birthday = bdText.getText();
		String email = emailtext.getText();
		count++;
		System.out.println(count);
		if(count==1) {
			results[0].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==2) {
			results[1].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==3) {
			results[2].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==4) {
			results[3].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==5) {
			results[4].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==6) {
			results[5].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==7) {
			results[6].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==8) {
			results[7].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==9) {
			results[8].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==10) {
			results[9].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==11) {
			results[10].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==12) {
			results[11].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==13) {
			results[12].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==14) {
			results[13].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else if(count==15) {
			results[14].setText("<html>"+"<strong>"+firstname+" "+lastname+"</strong><br>"+"Born on "+birthday+"<br><a href=''>"+email+"</a></html>");
		}
		else {
			System.out.println("Error");
		}
		
	}
}
