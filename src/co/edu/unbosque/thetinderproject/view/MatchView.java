package co.edu.unbosque.thetinderproject.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MatchView {

	
		
		JLabel mainLabelMatchView= new JLabel("Matches");
		JLabel firstMatchView= new JLabel();
		JLabel secondMatchView= new JLabel();
		JLabel thirdMatchView= new JLabel();
		JLabel firstAgeMatchView = new JLabel();
		JLabel secondAgeMatchView = new JLabel();
		JLabel thirdAgeMatchView = new JLabel();
		JFrame mainFrameMatchView = new JFrame();
		
		public MatchView() {
			
			mainFrameMatchView.setLayout(null);
			mainFrameMatchView.setBounds(40, 20, 400, 400);
			mainFrameMatchView.setVisible(true);
		
			mainLabelMatchView.setBounds(40, 60, 300, 400); 
			mainFrameMatchView.add(mainLabelMatchView);
			
			firstMatchView.setBounds(50, 60, 350, 400);
			mainFrameMatchView.add(mainLabelMatchView);
			
			secondMatchView.setBounds(50, 70, 340, 410);
			mainFrameMatchView.add(secondMatchView);
			
			thirdMatchView.setBounds(50, 70, 320, 420);
			mainFrameMatchView.add(thirdMatchView);
			
			firstAgeMatchView.setBounds(50, 60, 300, 400);
			mainFrameMatchView.add(firstAgeMatchView);
			
			secondAgeMatchView.setBounds(50, 60, 340, 420);
			mainFrameMatchView.add(secondAgeMatchView);
			
			thirdAgeMatchView.setBounds(60, 50, 350, 420);
			mainFrameMatchView.add(thirdAgeMatchView);
			
	}

		public JLabel getMainLabelMatchView() {
			return mainLabelMatchView;
		}

		public void setMainLabelMatchView(JLabel mainLabelMatchView) {
			this.mainLabelMatchView = mainLabelMatchView;
		}

		public JLabel getFirstMatchView() {
			return firstMatchView;
		}

		public void setFirstMatchView(JLabel firstMatchView) {
			this.firstMatchView = firstMatchView;
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

		public void setFirstAgeMatchView(JLabel firstAgeMatchView) {
			this.firstAgeMatchView = firstAgeMatchView;
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
