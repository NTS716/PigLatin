import java.awt.*;
import java.awt.event.*;

public class Handler implements ActionListener {
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == Frame.translateButton) {

			if (Frame.firstBox.getSelectedItem() == "English") {

				if (Frame.secondBox.getSelectedItem() == "Pig Latin") {

					String translatedTo = TranslateTo.translate(Frame.inputField.getText());
					Frame.outputField.setText(translatedTo);
				}
				
				else if (Frame.secondBox.getSelectedItem() == "English") {

					Frame.outputField.setText(Frame.inputField.getText());
				}

			}
			
			else if (Frame.firstBox.getSelectedItem() == "Pig Latin") {
				
				if (Frame.secondBox.getSelectedItem() == "English") {

					String translatedFrom = TranslateFrom.translate(Frame.inputField.getText());
					Frame.outputField.setText(translatedFrom);
				}
				
				else if (Frame.secondBox.getSelectedItem() == "Pig Latin") {
					
					Frame.outputField.setText(Frame.inputField.getText());
				}
			}
		}
	}
}
