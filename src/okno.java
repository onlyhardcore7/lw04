import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;

 
public class okno extends JFrame {
    private int count = 0; 
    private JTextField fio = new JTextField(140);
    private JLabel metka = new JLabel("Ваше имя?");
    private JLabel metkaDva = new JLabel("");
	private JLabel metkaDva1 = new JLabel("");
	private JLabel metkaDva2 = new JLabel("");
    
    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object button = e.getSource();
			Object razmer = e.getSource();
 
            if(button instanceof JButton)
			{
                count++;
                metkaDva1.setText("Нажато " + count + " раз");
                metkaDva.setText("Спасибо, "+fio.getText()+"!");
            }			
        }
		
    }
	
	class PushingListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object razmer = e.getSource(); 
					
			if(razmer instanceof JButton)
			{
				setSize(500, 500);									
            }
        }
		
    }
 
    public okno(String title)
      {
        super(title);
        SozdatxOkno();
      }
 
    private void SozdatxOkno(){
        
    	JButton button = new JButton(" Нажит меня! ");
		JButton razmer = new JButton(" Изменить размер окна");
		
        button.setBounds(65,60,150,40);
		razmer.setBounds(65,120,150,40);
        
        button.addActionListener(new PushingListener());
        razmer.addActionListener(new PushingListener1());
		
        metka.setBounds(15,15,95,30);
        metkaDva.setBounds(15,160,200,30);
		metkaDva1.setBounds(15,190,200,30);
		metkaDva2.setBounds(15,300,200,30);
        
        fio.setBounds(120, 15, 100, 30);
        
        getContentPane().setLayout(null);
        getContentPane().add(button);
		getContentPane().add(razmer);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
		getContentPane().add(metkaDva1);
		getContentPane().add(metkaDva2);
        getContentPane().add(fio);
                
        setLocationRelativeTo(null);
      }
}