package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProfileView {
	
	JFrame mainFrameProfileView;
	JButton likeButtonProfileView = new JButton("❤");
	JButton dislikeButtonProfileView = new JButton("💩");
	JLabel descriptionLabelProfileView = new JLabel("Me gusta el rock");
	JLabel nameLabelProfileView = new JLabel("Mauricio Beltrán");
	JLabel ageLabelProfileView = new JLabel("20");
	
	public ProfileView() {
		mainFrameProfileView = new JFrame();
		mainFrameProfileView.setLayout(null);
		mainFrameProfileView.setBounds(450, 100, 500, 500);
		mainFrameProfileView.setVisible(true);
		
		//descriptionLabelprofileView section
		descriptionLabelProfileView.setBounds(50, 350, 400, 40);
		descriptionLabelProfileView.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameProfileView.add(descriptionLabelProfileView);
		
		//nameLabelprofileView
		nameLabelProfileView.setBounds(50, 320, 400, 40);
		nameLabelProfileView.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameProfileView.add(nameLabelProfileView);
		
		//ageLabelprofileView
		ageLabelProfileView.setBounds(50, 300, 400, 40);
		ageLabelProfileView.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameProfileView.add(ageLabelProfileView);
		
		//LikeButtonProfileView section
		likeButtonProfileView.setBounds(50, 380, 60, 40);
		likeButtonProfileView.setFont(new Font("Serif", Font.PLAIN, 20));
		mainFrameProfileView.add(likeButtonProfileView);
		
		//dislikeButtonProfileView
		dislikeButtonProfileView.setBounds(365, 380, 60, 40);
		dislikeButtonProfileView.setFont(new Font("Serif", Font.PLAIN, 20));
		mainFrameProfileView.add(dislikeButtonProfileView);
	}
	public JButton getLikeProfileView() {
		return likeButtonProfileView;
	}

	public JButton getDislikeProfileView() {
		return dislikeButtonProfileView;
	}

}
