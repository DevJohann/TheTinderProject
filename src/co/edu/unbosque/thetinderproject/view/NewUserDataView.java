package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

//Programador: Johann
public class NewUserDataView {
	
	JLabel nameLabelNewUD = new JLabel("Nombre:");
	String[] genders = {"Hombre", "Mujer"};
	String[] cities = {"Bogotá", "Cali", "Medellín", "Gama"};
	String[] sources = {"foto1.jpg", "foto2.jpg", "foto3.jpg"};
	String[] countries = {"Colombia", "Venezuela", "Argentina", "Brasil"};
	JLabel genderLabelNewUD = new JLabel("Genero:");
	JLabel ageLabelNewUD = new JLabel("Edad:");
	JLabel nationalityLabelNewUD = new JLabel("Nacionalidad:");
	JLabel mainLabelNewUD = new JLabel("Información personal");
	JLabel descriptionLabelNewUD = new JLabel("Cuentanos de ti");
	JLabel cityOfResidenceLabelNewUD = new JLabel("Ciudad:");
	JLabel errorLabelNewUD = new JLabel("");
	JLabel pictureLabelNewUD = new JLabel("Foto:");
	JComboBox<String> pictureComboBoxNewUD = new JComboBox(sources);
	JComboBox<String> cityOfResidenceFieldNewUD = new JComboBox(cities);
	JTextField nameFieldNewUD = new JTextField("");
	JComboBox<String> genderComboBoxNewUD = new JComboBox<String>(genders);
	JComboBox<String> countriesComboBoxNewUD = new JComboBox<String>(countries);
	JTextField ageFieldNewUD = new JTextField("");
	JTextArea descriptionTextAreaNewUD = new JTextArea("");
	JButton sendDataButtonNewUD = new JButton("Enviar");
	JButton backButtonNewUD = new JButton("Volver");
	//JFileChooser selectorImageNewUD = new JFileChooser();
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
		nameLabelNewUD.setBounds(70, 70, 400, 40);
		nameLabelNewUD.setFont(new Font("Serif", Font.BOLD,16));
		mainFrameNewUserDataView.add(nameLabelNewUD);
		
		//NameField Section
		nameFieldNewUD.setBounds(70, 110, 250, 25);
		mainFrameNewUserDataView.add(nameFieldNewUD);
		
		//GenderLabel section
		genderLabelNewUD.setBounds(70, 140, 400, 40);
		genderLabelNewUD.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameNewUserDataView.add(genderLabelNewUD);
		
		//GenderField section
		genderComboBoxNewUD.setBounds(140, 145, 150, 25);
		genderComboBoxNewUD.setSelectedIndex(0);
		mainFrameNewUserDataView.add(genderComboBoxNewUD);
		
		//
		
		
		//AgeLabel section (Add try-catch)
		ageLabelNewUD.setBounds(70, 170, 400, 40);
		ageLabelNewUD.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameNewUserDataView.add(ageLabelNewUD);
		
		//AgeField section (Add try-catch)
		ageFieldNewUD.setBounds(140, 175, 60, 25);
		mainFrameNewUserDataView.add(ageFieldNewUD);
		
		//PictureLabel section
		pictureLabelNewUD.setBounds(260, 230, 400, 40);
		pictureLabelNewUD.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameNewUserDataView.add(pictureLabelNewUD);
		
		//PictureComboBox section
		pictureComboBoxNewUD.setBounds(300, 240, 120, 20);
		mainFrameNewUserDataView.add(pictureComboBoxNewUD);
		
		//NationalityLabel section
		nationalityLabelNewUD.setBounds(70, 196, 400, 40);
		nationalityLabelNewUD.setFont(new Font("Serif", Font.BOLD, 16));
		mainFrameNewUserDataView.add(nationalityLabelNewUD);
		
		//
		countriesComboBoxNewUD.setBounds(170, 205, 150, 25);
		countriesComboBoxNewUD.setSelectedIndex(0);
		mainFrameNewUserDataView.add(countriesComboBoxNewUD);
		
		
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
		
		//CityOfResidenceLabel section
		cityOfResidenceLabelNewUD.setBounds(70,	230, 400, 40);
		cityOfResidenceLabelNewUD.setFont(new Font("Serif",Font.BOLD,16));
		mainFrameNewUserDataView.add(cityOfResidenceLabelNewUD);
		
		
		//CityOfResidence section
		cityOfResidenceFieldNewUD.setBounds(130, 235, 100, 25);
		cityOfResidenceFieldNewUD.setSelectedIndex(0);
		mainFrameNewUserDataView.add(cityOfResidenceFieldNewUD);
		
		//ErrorLabel section
		errorLabelNewUD.setBounds(300, 400, 400, 40);
		errorLabelNewUD.setFont(new Font("Serif", Font.BOLD, 12));
		mainFrameNewUserDataView.add(errorLabelNewUD);
	}
	
	public String getNameFieldNewUD() {
		return this.nameFieldNewUD.getText();
	}

	public String getGenderComboBoxNewUD() {
		return this.genderComboBoxNewUD.getItemAt(genderComboBoxNewUD.getSelectedIndex());
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
	public String getCityOfResidenceNewUD() {
		return this.genderComboBoxNewUD.getItemAt(genderComboBoxNewUD.getSelectedIndex());
	}
	public String getDescriptionNewUD() {
		return this.descriptionTextAreaNewUD.getText();
	}
	
	public void setErrorMessageNewUD(String value) {
		this.errorLabelNewUD.setText(value);
	}

	public String getPictureComboBoxNewUD() {
		return pictureComboBoxNewUD.getItemAt(pictureComboBoxNewUD.getSelectedIndex());
	}
	public String getCountriesComboBoxNewUD() {
		return countriesComboBoxNewUD.getItemAt(countriesComboBoxNewUD.getSelectedIndex());
	}
	
	
	
	
}
