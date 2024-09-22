package design_pattern.factory;

public class OperatingSystemFactory
{
    private OperatingSystemFactory() {

    }

    public static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "Windows":
                return new WindowsOS(architecture, version);
            case "Linux":
                return new LinuxOS(architecture, version);
            default:
                throw new RuntimeException("OS not supported.");
        }
    }
}
