package pokemon.view;

import pokemon.controller.PokemonController;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JLabel modifierLabel;
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
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -355, SpringLayout.EAST, this);
		nameField = new JTextField("Name");
		numberField = new JTextField("###");
		appLayout.putConstraint(SpringLayout.WEST, numberField, 60, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -196, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -349, SpringLayout.EAST, this);
		attackField = new JTextField("###");
		appLayout.putConstraint(SpringLayout.WEST, attackField, 106, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -303, SpringLayout.EAST, this);
		healthField = new JTextField("hp");
		appLayout.putConstraint(SpringLayout.EAST, healthField, -21, SpringLayout.EAST, attackField);
		modifierField = new JTextField("modifier");
		
		iconLabel = new JLabel("Pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/pokemon-logo-black-transparent.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 7, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 103, SpringLayout.EAST, iconLabel);
		
		
		healthLabel = new JLabel("Health");
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 6, SpringLayout.EAST, healthLabel);
		attackLabel = new JLabel("Attack Damage");
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 4, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -6, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		nameLabel = new JLabel("Name");
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 255, SpringLayout.WEST, this);
		numberLabel = new JLabel("Number");
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, numberField);
		evolvableLabel = new JLabel("Evolvable");
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 4, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -22, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 17, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 6, SpringLayout.EAST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 19, SpringLayout.SOUTH, evolvableLabel);
		modifierLabel = new JLabel("Modifier");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 19, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 6, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 18, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, attackLabel);
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 4, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 21, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 298, SpringLayout.WEST, this);
		clearButton = new JButton("Clear");
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, -124, SpringLayout.NORTH, clearButton);
		saveButton = new JButton("Save");
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, -4, SpringLayout.WEST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -10, SpringLayout.EAST, this);
		
		this.firstType = new JPanel();
		this.secondType = new JPanel();
		this.thirdType = new JPanel();
		this.fourthType = new JPanel();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
//		this.healthLabel = new JLabel("0");
//		this.attackLabel = new JLabel("Default Attack: ");
//		this.nameLabel = new JLabel("Default Name ");
		//do the rest of the private stuff ^^^
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectionIndex();
				updatePokedexInfo(selecedPokemonIndex);
				updateImage();
				uateTypePanels();
				repaint();
			}
		});
	}
}