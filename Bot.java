import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame
{
	private JTextField txtEnter=new JTextField();
	
	private JTextArea txtChat=new JTextArea();
	public Bot()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.setResizable(true);
		this.setLayout(null);
		this.setTitle("Java AI");
		
		txtEnter.setLocation(2,530);
		txtEnter.setSize(590, 30);
		
		txtEnter.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent arg0) 
			{
				String utext= txtEnter.getText();
				txtChat.append("you: "+ utext+"\n");
				
				if(utext.contains("hi"))
				{
					botReply("Hello There");
				}
				else if(utext.contains("how are you"))
				 {
                    int decider = (int) (Math.random()*2+1);
                    if(decider == 1){
                        botReply("I'm doing well, thanks");
                    }
                    else if(decider == 2){
                        botReply("Not too bad");
                    }
                }
				else 
				{
					int decider= (int) (Math.random()*3+1);
					if (decider==1)
					{
						botReply("I did'nt get that");
					}
					else if(decider == 2)
						botReply("Please rephrase that sentence");
					else if(decider ==3)
						botReply("???");
				}
				txtEnter.setText("");
			}
		});
		
		txtChat.setLocation(20, 0);
		txtChat.setSize(560,540);
		txtChat.setEditable(false);
		
		this.add(txtEnter);
		this.add(txtChat);
		
	}
	public void botReply(String s)
	{
		txtChat.append("AI: " + s + "\n");
	}
	public static void main(String args[])
	{
		new Bot();
	}
	
}