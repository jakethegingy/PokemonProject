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
		
		nameField = new JTextField("Name");
		
		numberField = new JTextField("###");
		
		attackField = new JTextField("###");
		
		healthField = new JTextField("hp");
		
		modifierField = new JTextField("modifier");
		
		iconLabel = new JLabel("Pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/pokemon-logo-black-transparent.png")), JLabel.CENTER);
		
		healthLabel = new JLabel("Health");
	
		attackLabel = new JLabel("Attack Damage");
		
		nameLabel = new JLabel("Name");
		
		numberLabel = new JLabel("Number");
		
		evolvableLabel = new JLabel("Evolvable");
		
		modifierLabel = new JLabel("Modifier");
		
		pokedexDropdown = new JComboBox();
		
		clearButton = new JButton("Clear");
		
		saveButton = new JButton("Save");
		
		
		this.firstType = new JPanel();
		this.secondType = new JPanel();
		this.thirdType = new JPanel();
		this.fourthType = new JPanel();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
		
//		this.healthLabel = new JLabel("0");
//		this.attackLabel = new JLabel("Default Attack: ");
//		this.nameLabel = new JLabel("Default Name ");
		//do the rest of the private stuff ^^^
	}
	
	public void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "PokemonLogo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
	
	public void updateTypePanels()
	{
		
	}
	
	public void getSelectionIndex()
	{
		
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
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
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 6, SpringLayout.EAST, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 4, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackLabel, -6, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, -4, SpringLayout.WEST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 4, SpringLayout.NORTH, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, nameLabel, -6, SpringLayout.WEST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 21, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 298, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, -124, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 19, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 6, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 18, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 4, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -22, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 17, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 6, SpringLayout.EAST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 19, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 255, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -6, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 7, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 103, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -355, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 60, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -196, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -349, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 106, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -303, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -21, SpringLayout.EAST, attackField);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectionIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
	}
}