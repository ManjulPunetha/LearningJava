package design_pattern.factory;

public class FactoryMainClass
{
    public static void main(String[] args) {
        OperatingSystem linuxOS = OperatingSystemFactory.getInstance("Linux", "Cent OS", "x32");
        linuxOS.changeDirectory();

        OperatingSystem windowsOS = OperatingSystemFactory.getInstance("Windows", "Windows 10", "x64");
        windowsOS.removeDirectory();
    }
}
