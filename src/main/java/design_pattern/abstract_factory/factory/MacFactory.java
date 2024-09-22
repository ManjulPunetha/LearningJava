package design_pattern.abstract_factory.factory;

import design_pattern.abstract_factory.Button;
import design_pattern.abstract_factory.TextBox;
import design_pattern.abstract_factory.os.mac.MacButton;
import design_pattern.abstract_factory.os.mac.MacTextBox;

public class MacFactory implements GUIFactory
{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
