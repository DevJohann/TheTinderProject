package co.edu.unbosque.thetinderproject.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class MatchView {

	
		
		JLabel mainLabelMatchView= new JLabel("MATCHES");
		JLabel firstMatchView= new JLabel(); //Prueba
		JLabel secondMatchView= new JLabel();
		JLabel thirdMatchView= new JLabel();
		JLabel firstAgeMatchView = new JLabel(); //Prueba
		JLabel secondAgeMatchView = new JLabel();
		JLabel thirdAgeMatchView = new JLabel();
		JFrame mainFrameMatchView = new JFrame();
		
		public MatchView() {
			
			mainFrameMatchView.setLayout(null);
			mainFrameMatchView.setBounds(450, 100, 500, 500);
			mainFrameMatchView.setVisible(true);
		
			mainLabelMatchView.setBounds(120, 30, 400, 40); 
			mainLabelMatchView.setFont(new Font("Serif", Font.BOLD, 25));
			mainFrameMatchView.add(mainLabelMatchView);
			
			firstMatchView.setBounds(50, 60,  400, 40);
			firstMatchView.setFont(new Font("Serif", Font.BOLD, 22));
			mainFrameMatchView.add(firstMatchView);
			
			secondMatchView.setBounds(50, 70, 400, 40);
			secondMatchView.setFont(new Font("Serif", Font.BOLD, 22));
			mainFrameMatchView.add(secondMatchView);
			
			thirdMatchView.setBounds(50, 70, 400, 40);
			thirdMatchView.setFont(new Font("Serif", Font.BOLD, 22));
			mainFrameMatchView.add(thirdMatchView);
			
			firstAgeMatchView.setBounds(50, 60, 400, 40);
			firstAgeMatchView.setFont(new Font("Serif", Font.BOLD, 22));
			mainFrameMatchView.add(firstAgeMatchView);
			
			secondAgeMatchView.setBounds(50, 60, 400, 40);
			secondAgeMatchView.setFont(new Font("Serif", Font.BOLD, 22));
			mainFrameMatchView.add(secondAgeMatchView);
			
			thirdAgeMatchView.setBounds(60, 50, 400, 40);
			thirdAgeMatchView.setFont(new Font("Serif", Font.BOLD, 22));
			mainFrameMatchView.add(thirdAgeMatchView);
			
	}

		public JLabel getMainLabelMatchView() {
			return mainLabelMatchView;
		}

		public void setMainLabelMatchView(JLabel mainLabelMatchView) { //Cambiar a String
			this.mainLabelMatchView = mainLabelMatchView;
		}

		public JLabel getFirstMatchView() {
			return firstMatchView;
		}

		public void setFirstMatchView(String firstMatchView) {
			this.firstMatchView.setText(firstMatchView);
		}

		public JLabel getSecondMatchView() {
			return secondMatchView;
		}

		public void setSecondMatchView(JLabel secondMatchView) {
			this.secondMatchView = secondMatchView;
		}

		public JLabel getThirdMatchView() {
			return thirdMatchView;
		}

		public void setThirdMatchView(JLabel thirdMatchView) {
			this.thirdMatchView = thirdMatchView;
		}

		public JLabel getFirstAgeMatchView() {
			return firstAgeMatchView;
		}

		public void setFirstAgeMatchView(String firstAgeMatchView) {
			this.firstAgeMatchView.setText(firstAgeMatchView);
		}

		public JLabel getSecondAgeMatchView() {
			return secondAgeMatchView;
		}

		public void setSecondAgeMatchView(JLabel secondAgeMatchView) {
			this.secondAgeMatchView = secondAgeMatchView;
		}

		public JLabel getThirdAgeMatchView() {
			return thirdAgeMatchView;
		}

		public void setThirdAgeMatchView(JLabel thirdAgeMatchView) {
			this.thirdAgeMatchView = thirdAgeMatchView;
		}

		public JFrame getMainFrameMatchView() {
			return mainFrameMatchView;
		}

		public void setMainFrameMatchView(JFrame mainFrameMatchView) {
			this.mainFrameMatchView = mainFrameMatchView;
		}
		
	

}
