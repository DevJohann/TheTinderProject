package co.edu.unbosque.thetinderproject.view;

import java.awt.Font;

import javax.swing.*;

public class PreferencesView {
	//Programadora: Jessica
	JCheckBox mainCheckBoxPView = new JCheckBox();
	JLabel mainLabelPreferencesView = new JLabel("Preferencias");
	JButton backButtonPreferencesView = new JButton("Volver");
	JButton sendDataButtonPreferences = new JButton("Enviar");
	String[] cityPreference = {"Bogota", "Cali", "Medellin", "Gama"}; 
	String[] gendersPreference = {"Hombre", "Mujer", "Otro"};
	//							  A		   B 		C		 D
	String [] agePreference = {"18-25", "25-30", "30-45", "45-60"};
	JLabel cityPreferenceLabel = new JLabel("Ciudad de preferencia:");
	JLabel genderPreferenceLabel = new JLabel("Genero de preferencia:");
	JLabel agePreferenceLabel = new JLabel("Rango de edad:");
	JLabel confirmLabel = new JLabel();
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
		
		//ConfirmLabel Section
		confirmLabel.setBounds(200, 400, 400, 40);
		confirmLabel.setFont(new Font("Serif", Font.BOLD, 16));
		mainFramePreferencesView.add(confirmLabel);
		
		
	}

	public JButton getBackButtonPreferences() {
		return this.backButtonPreferencesView;
	}
	public JButton getSendDataButtonPreferences() {
		return this.sendDataButtonPreferences;
	}

	public JFrame getMainFramePreferencesView() {
		return mainFramePreferencesView;
	}

	public String getCityPreferenceBox() {
		return cityPreferenceBox.getItemAt(cityPreferenceBox.getSelectedIndex());
	}
	public String getGenderPreferenceBox() {
		return genderPreferenceBox.getItemAt(genderPreferenceBox.getSelectedIndex());
	}
	public String getAgePreferenceBox() {
		System.out.println(agePreferenceBox.getItemAt(agePreferenceBox.getSelectedIndex()));
		if(agePreferenceBox.getItemAt(agePreferenceBox.getSelectedIndex()).equals("18-25")){
			return "A";
		}
		else if(agePreferenceBox.getItemAt(agePreferenceBox.getSelectedIndex()).equals("25-30")) {
			return "B";
		}
		else if(agePreferenceBox.getItemAt(agePreferenceBox.getSelectedIndex()).equals("30-45")) {
			return "C";
		}
		else if(agePreferenceBox.getItemAt(agePreferenceBox.getSelectedIndex()).equals("45-60")) {
			return "D";
		}
		else {
			return null;
		}
	
		//return agePreferenceBox.getItemAt(agePreferenceBox.getSelectedIndex());
	}
	
	public void setConfirmLabel(String value) {
		confirmLabel.setText(value);
	}
	
}
