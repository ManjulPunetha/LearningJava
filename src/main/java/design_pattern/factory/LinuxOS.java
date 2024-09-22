package design_pattern.factory;

public class LinuxOS extends OperatingSystem
{
    public LinuxOS(String architecture, String version) {
        super(architecture, version);
    }

    @Override
    public void removeDirectory() {
        System.out.println("Linux remove dir");
    }

    @Override
    public void changeDirectory() {
        System.out.println("Linux change dir");
    }
}
