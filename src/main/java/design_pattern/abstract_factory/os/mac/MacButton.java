package design_pattern.abstract_factory.os.mac;

import design_pattern.abstract_factory.Button;

public class MacButton implements Button
{
    @Override
    public void render() {
        System.out.println("Rendering a Mac Button.");
    }
}
