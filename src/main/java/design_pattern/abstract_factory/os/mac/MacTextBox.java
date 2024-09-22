package design_pattern.abstract_factory.os.mac;

import design_pattern.abstract_factory.TextBox;

public class MacTextBox implements TextBox
{
    @Override
    public void render() {
        System.out.println("Rendering a Mac TextBox.");
    }
}
