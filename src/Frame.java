import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
	
	private String[] translateOptions;
	public static JComboBox firstBox;
	private JLabel toLabel;
	public static JComboBox secondBox;
	public static JTextField inputField;
	public static JButton translateButton;
	public static JTextField outputField;
	
	public Frame()
	{

		super("Pig Latin Translator");

		// set the layout manager
		setLayout(null);

		// create the components
		
		translateOptions = new String[2];
		translateOptions[0] = "English";
		translateOptions[1] = "Pig Latin";

		firstBox = new JComboBox(translateOptions);
		firstBox.setSelectedIndex(0);
		add(firstBox);
		firstBox.setLocation(25,15);
		firstBox.setSize(100,25);
		firstBox.addActionListener(new Handler());

		secondBox = new JComboBox(translateOptions);
		secondBox.setSelectedIndex(1);
		add(secondBox);
		secondBox.setLocation(172,15);
		secondBox.setSize(100,25);
		secondBox.addActionListener(new Handler());

		toLabel = new JLabel("to");
		add(toLabel);
		toLabel.setLocation(142,20);
		toLabel.setSize(15,15);

		inputField = new JTextField();
		add(inputField);
		inputField.setLocation(25,50);
		inputField.setSize(250,25);
		inputField.addActionListener(new Handler());

		translateButton = new JButton("Translate");
		add(translateButton);
		translateButton.setLocation(75,86);
		translateButton.setSize(150,25);
		translateButton.addActionListener(new Handler());

		outputField = new JTextField();
		outputField.setEditable(false);
		add(outputField);
		outputField.setLocation(25,125);
		outputField.setSize(250,25);	
		outputField.addActionListener(new Handler());

	}
}
