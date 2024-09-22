package design_pattern.abstract_factory.os.win;

import design_pattern.abstract_factory.Button;

public class WindowsButton implements Button
{
    @Override
    public void render() {
        System.out.println("Rendering a Windows Button.");
    }
}
