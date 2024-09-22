package design_pattern.abstract_factory;

import design_pattern.abstract_factory.factory.GUIFactory;
import design_pattern.abstract_factory.factory.MacFactory;
import design_pattern.abstract_factory.factory.WindowsFactory;

public class MainClass
{
    public static void main(String[] args) {
        GUIFactory factory;

        String os = "Mac";

        if(os.equals("Mac"))
            factory = new MacFactory();
        else
            factory = new WindowsFactory();

        Application application = new Application(factory);
        application.renderUI();
    }
}
