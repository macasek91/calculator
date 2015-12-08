
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
	private JTextField answerfield;
	private JButton one, two, three, four, five, six, 
	seven, eight, nine, zero, add, sub, multiply, div,
	equals;
	private String stemp1, stemp2, sanswer;
	public double answer = 0.0;
	private JPanel contentPanel;
	private boolean equalsClicked = false, opChosen = false;
	
	
	public Gui(){
		super("Calculator");
		
		answerfield = new JTextField(null, 20);
		answerfield.setEditable(false);
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("*");
		div = new JButton("/");
		equals = new JButton("=");
		
		Dimension dim = new Dimension(75, 25);
		
				
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(new Dimension(225,25));
		add.setPreferredSize(new Dimension(113,25));
		sub.setPreferredSize(new Dimension(113,25));
		multiply.setPreferredSize(new Dimension(113,25));
		div.setPreferredSize(new Dimension(113,25));
		equals.setPreferredSize(new Dimension(225,25));
		
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.RED);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(answerfield, BorderLayout.NORTH);
		contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(four);
		contentPanel.add(five); contentPanel.add(six); contentPanel.add(seven); contentPanel.add(eight);
		contentPanel.add(nine); contentPanel.add(zero); contentPanel.add(add); contentPanel.add(sub);
		contentPanel.add(multiply); contentPanel.add(div); contentPanel.add(equals);
		
		
		
		this.setContentPane(contentPanel);
	}
	
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(one)){
				if(opChosen==false){
					if(stemp1==null){
						stemp1 = "1";
					}else{
						stemp1 += "1";
					}//end if
				}else {
					if(stemp2==null){
						stemp2 = "1";
					}else{
						stemp2 += "1";
					}//end if
					
				}//end if
			}//end if
		}
	}
	
	private class Calc implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
