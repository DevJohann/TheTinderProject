package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

//Programador: Johann
public class NewUserDataView {
	
	JLabel nameLabelNewUD = new JLabel("Nombre:");
	JLabel genderLabelNewUD = new JLabel("Genero:");
	JLabel ageLabelNewUD = new JLabel("Edad:");
	JLabel nationalityLabelNewUD = new JLabel("Nacionalidad:");
	JLabel mainLabelNewUD = new JLabel("Información personal");
	JLabel descriptionLabelNewUD = new JLabel("Cuentanos de ti");
	JTextField nameFieldNewUD = new JTextField();
	JTextField genderFieldNewUD = new JTextField();
	JTextField ageFieldNewUD = new JTextField();
	JTextField nationalityFieldNewUD = new JTextField();
	JTextArea descriptionTextAreaNewUD = new JTextArea();
	JButton sendDataButtonNewUD = new JButton("Enviar");
	JButton backButtonNewUD = new JButton("Volver");
	JFrame mainFrameNewUserDataView;
	
	public NewUserDataView() {
		mainFrameNewUserDataView = new JFrame();
		mainFrameNewUserDataView.setBounds(450, 100, 500, 500);
		mainFrameNewUserDataView.setLayout(null);
		mainFrameNewUserDataView.setVisible(true);
		
	
		// MainFrame Section
		mainLabelNewUD.setBounds(135, 20, 400, 40);
		mainLabelNewUD.setFont(new Font("Serif", Font.BOLD,22));
		mainFrameNewUserDataView.add(mainLabelNewUD);
		
		// NameLabel Section
		nameLabelNewUD.setBounds(70, 80, 400, 40);
		nameLabelNewUD.setFont(new Font("Serif", Font.BOLD,16));
		mainFrameNewUserDataView.add(nameLabelNewUD);
		
		//NameField Section
		nameFieldNewUD.setBounds(70, 120, 250, 25);
		mainFrameNewUserDataView.add(nameFieldNewUD);
		
		//GenderLabel section
		genderLabelNewUD.setBounds(70, 150, 400, 40);
		genderLabelNewUD.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameNewUserDataView.add(genderLabelNewUD);
		
		//GenderField section
		genderFieldNewUD.setBounds(140, 155, 150, 25);
		mainFrameNewUserDataView.add(genderFieldNewUD);
		
		//AgeLabel section (Add try-catch)
		ageLabelNewUD.setBounds(70, 180, 400, 40);
		ageLabelNewUD.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameNewUserDataView.add(ageLabelNewUD);
		
		//AgeField section (Add try-catch)
		ageFieldNewUD.setBounds(140, 185, 60, 25);
		mainFrameNewUserDataView.add(ageFieldNewUD);
		
		//NationalityLabel section
		nationalityLabelNewUD.setBounds(70, 210, 400, 40);
		nationalityLabelNewUD.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameNewUserDataView.add(nationalityLabelNewUD);
		
		//NationalityField section
		nationalityFieldNewUD.setBounds(180, 215, 150, 25);
		mainFrameNewUserDataView.add(nationalityFieldNewUD);
		
		// DescriptionLabel Section
		descriptionLabelNewUD.setBounds(70, 260, 400, 40);
		descriptionLabelNewUD.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameNewUserDataView.add(descriptionLabelNewUD);
		
		//DescriptionTextArea section
		descriptionTextAreaNewUD.setBounds(70, 300, 300, 100);
		//descriptionTextAreaNewUD.setBorder();
		mainFrameNewUserDataView.add(descriptionTextAreaNewUD);
		
		//Send Data Button Section
		sendDataButtonNewUD.setBounds(190, 410, 100, 30);
		mainFrameNewUserDataView.add(sendDataButtonNewUD);
		
		// Back Button section
		backButtonNewUD.setBounds(15, 420, 80, 30);
		mainFrameNewUserDataView.add(backButtonNewUD);
		
		//CityOfResidence section
	}
	
	public String getNameFieldNewUD() {
		return this.nameFieldNewUD.getText();
	}
	public String getGenderFieldNewUD() {
		return this.genderFieldNewUD.getText();
	}
	public String getAgeFieldNewUD() {
		return this.ageFieldNewUD.getText();
	}
	public String getDescriptionFieldNewUD() {
		return this.descriptionTextAreaNewUD.getText();
	}
	public JButton getSendDataButtonNewUD() {
		return this.sendDataButtonNewUD;
	}
	public JButton getBackButtonNewUD() {
		return this.backButtonNewUD;
	}
	public JFrame getMainFrameNewUD() {
		return this.mainFrameNewUserDataView;
	}
}
