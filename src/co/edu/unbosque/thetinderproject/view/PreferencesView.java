package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;

import javax.swing.*;

public class PreferencesView {
	//Programadora: Jessica
	JCheckBox mainCheckBoxPView = new JCheckBox();
	JLabel mainLabelPreferencesView = new JLabel("Preferencias");
	JButton backButtonPreferencesView = new JButton("Volver");
	JButton sendDataButtonPreferences = new JButton("Enviar");
	String[] cityPreference = {"Bogotá", "Cali", "Medellín", "Gama"}; 
	String[] gendersPreference = {"Hombre", "Mujer", "Otro"};
	String [] agePreference = {"18-25", "25-30", "30-45", "45-60", "60+"};
	JLabel cityPreferenceLabel = new JLabel("Ciudad de preferencia:");
	JLabel genderPreferenceLabel = new JLabel("Genero de preferencia:");
	JLabel agePreferenceLabel = new JLabel("Rango de edad:");
	JComboBox<String> cityPreferenceBox = new JComboBox(cityPreference);
	JComboBox<String> genderPreferenceBox = new JComboBox(gendersPreference);
	JComboBox<String> agePreferenceBox = new JComboBox(agePreference);
	JTextField cityPreferencesField = new JTextField("");
	JTextField genderPreferencesField = new JTextField("");
	JTextField agePreferencesField = new JTextField("");
	JFrame mainFramePreferencesView;
	
	public PreferencesView(){
		mainFramePreferencesView = new JFrame();
		mainFramePreferencesView.setBounds(450, 100, 500, 500);
		mainFramePreferencesView.setLayout(null);
		mainFramePreferencesView.setVisible(true);
		
		//mainLabel section
		mainLabelPreferencesView.setBounds(180, 20, 400, 40);
		mainLabelPreferencesView.setFont(new Font("Serif", Font.BOLD, 26));
		mainFramePreferencesView.add(mainLabelPreferencesView);
		
		//CityLabel section
		cityPreferenceLabel.setBounds(165, 120, 400, 40);
		cityPreferenceLabel.setFont(new Font("Serif", Font.BOLD, 16));
		mainFramePreferencesView.add(cityPreferenceLabel);
		
		//CityField section
		cityPreferenceBox.setBounds(165, 150, 150, 25);
		cityPreferenceBox.setSelectedIndex(0);
		mainFramePreferencesView.add(cityPreferenceBox);
		
		//GenderLabel section
		genderPreferenceLabel.setBounds(165, 190, 400, 40);
		genderPreferenceLabel.setFont(new Font("Serif", Font.BOLD, 16));
		mainFramePreferencesView.add(genderPreferenceLabel);
		
		//GenderField section
		genderPreferenceBox.setBounds(165, 220, 150, 25);
		genderPreferenceBox.setSelectedIndex(0);
		mainFramePreferencesView.add(genderPreferenceBox);
		
		//AgeLabel section
		agePreferenceLabel.setBounds(165, 260, 400, 40);
		agePreferenceLabel.setFont(new Font("Serif", Font.BOLD, 16));
		mainFramePreferencesView.add(agePreferenceLabel);
		
		//AgeField section
		agePreferenceBox.setBounds(165, 290, 150, 25);
		agePreferenceBox.setSelectedIndex(0);
		mainFramePreferencesView.add(agePreferenceBox);
		
		//Send data button
		sendDataButtonPreferences.setBounds(190, 338, 100, 35);
		mainFramePreferencesView.add(sendDataButtonPreferences);
		
		//BackButton section
		backButtonPreferencesView.setBounds(15, 415, 100, 30);
		mainFramePreferencesView.add(backButtonPreferencesView);
		
		
	}
	
	public void showPreferencesView() {
		
	}
	//public String getCheckBoxValuePView() {
		//return this.mainCheckBoxPView.getSelectedIcon();
	//}
	public JButton getBackButtonPreferences() {
		return this.backButtonPreferencesView;
	}

	public JFrame getMainFramePreferencesView() {
		return mainFramePreferencesView;
	}
	
}
