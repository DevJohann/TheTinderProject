package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProfileView {
	
	JFrame mainFrameProfileView;
	JButton likeButtonProfileView = new JButton("❤");
	JButton dislikeButtonProfileView = new JButton("💩");
	JButton backButtonProfileView = new JButton("Volver");
	JLabel descriptionLabelProfileView = new JLabel("Me gusta el rock");
	JLabel nameLabelProfileView = new JLabel("Edison Mauricio Beltrán Gomez");
	JLabel ageLabelProfileView = new JLabel("20");
	
	JPanel panelProfileView = new JPanel();
	String pictureSrc = "";
	
	public ProfileView() {
		
		mainFrameProfileView = new JFrame();
		mainFrameProfileView.setLayout(null);
		mainFrameProfileView.setBounds(450, 80, 500, 600);
		mainFrameProfileView.setVisible(true);
		panelProfileView.setBounds(40, 20, 400, 400);
		
		//descriptionLabelprofileView section
		descriptionLabelProfileView.setBounds(40, 470, 400, 40);
		descriptionLabelProfileView.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameProfileView.add(descriptionLabelProfileView);
		
		//nameLabelprofileView
		nameLabelProfileView.setBounds(40, 430, 400, 40);
		nameLabelProfileView.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameProfileView.add(nameLabelProfileView);
		
		//ageLabelprofileView
		ageLabelProfileView.setBounds(40, 450, 400, 40);
		ageLabelProfileView.setFont(new Font("Serif", Font.BOLD, 20));
		mainFrameProfileView.add(ageLabelProfileView);
		
		//LikeButtonProfileView section
		likeButtonProfileView.setBounds(180, 510, 60, 40);
		likeButtonProfileView.setFont(new Font("Serif", Font.PLAIN, 20));
		mainFrameProfileView.add(likeButtonProfileView);
		
		//dislikeButtonProfileView
		dislikeButtonProfileView.setBounds(300, 510, 60, 40);
		dislikeButtonProfileView.setFont(new Font("Serif", Font.PLAIN, 20));
		mainFrameProfileView.add(dislikeButtonProfileView);
		
		//backButtonProfileView section
		backButtonProfileView.setBounds(15, 520, 85, 30);
		mainFrameProfileView.add(backButtonProfileView);
		
		//ImageView section
		
		
		try { //No es problema 
			BufferedImage imageProfile = ImageIO.read(new File(pictureSrc)); //No es problema
			//JLabel pictureProfileView = new JLabel(); //Debug 
			JLabel pictureProfileView = new JLabel(new ImageIcon(imageProfile)); //No es problema
			pictureProfileView.setIcon(new ImageIcon(pictureSrc)); //
			panelProfileView.add(pictureProfileView); //
			mainFrameProfileView.add(panelProfileView); //
		}
		catch(IOException e) {
			
		}
		
		
	}
	
	//Debug
	public String getPictureSrc() {
		return this.pictureSrc;
	}
	public JButton getLikeProfileView() {
		return likeButtonProfileView;
	}

	public JButton getDislikeProfileView() {
		return dislikeButtonProfileView;
	}
	public JButton getBackButtonProfileView() {
		return backButtonProfileView;
	}
	public JFrame getMainFrameProfileView() {
		return mainFrameProfileView;
	}
	public void setDescriptionLabelProfileView(String descriptionLabelProfileView) {
		this.descriptionLabelProfileView.setText(descriptionLabelProfileView);
	}
	public void setNameLabelProfileView(String nameLabelProfileView) {
		this.nameLabelProfileView.setText(nameLabelProfileView);
	}
	public void setAgeLabelProfileView(String ageLabelProfileView) {
		this.ageLabelProfileView.setText(ageLabelProfileView);	
		}
	public void setPictureSrc(String pictureSrc) {
		this.pictureSrc = pictureSrc;
	}
	

	
}
