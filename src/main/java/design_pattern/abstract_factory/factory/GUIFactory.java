package design_pattern.abstract_factory.factory;

import design_pattern.abstract_factory.Button;
import design_pattern.abstract_factory.TextBox;

public interface GUIFactory
{
    Button createButton();
    TextBox createTextBox();
}