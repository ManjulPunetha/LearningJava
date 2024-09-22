package design_pattern.abstract_factory.factory;

import design_pattern.abstract_factory.Button;
import design_pattern.abstract_factory.TextBox;
import design_pattern.abstract_factory.os.win.WindowsButton;
import design_pattern.abstract_factory.os.win.WindowsTextBox;

public class WindowsFactory implements GUIFactory
{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
