package design_pattern.abstract_factory.os.win;

import design_pattern.abstract_factory.TextBox;

public class WindowsTextBox implements TextBox
{
    @Override
    public void render() {
        System.out.println("Rendering a Windows TextBox.");
    }
}
