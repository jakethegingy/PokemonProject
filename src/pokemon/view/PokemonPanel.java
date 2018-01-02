package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.*;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	
	private JLabel healthLabel;
	private JLabel attackLable;
	private JLabel nameLable;
	private JLabel numrLabel;
	private JLabel evolvableLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber()+ "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier()+ "");
	}
	
	public PokemonPanel(PokemonController appController)
	{
		setupPanel();
		setupLayout();
		setupListeners();
		
		this.healthLabel = new JLabel("0");
		this.attackLabel = new JLabel("Default Attack: ");
		this.nameLabel = new JLabel("Default Name ");
		//do the rest of the private stuff ^^^
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}