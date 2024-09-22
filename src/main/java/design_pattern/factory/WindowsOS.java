package design_pattern.factory;

public class WindowsOS  extends OperatingSystem
{
    public WindowsOS(String architecture, String version) {
        super(architecture, version);
    }

    @Override
    public void removeDirectory() {
        System.out.println("Windows remove directory.");
    }

    @Override
    public void changeDirectory() {
        System.out.println("Windows change directory.");
    }
}
