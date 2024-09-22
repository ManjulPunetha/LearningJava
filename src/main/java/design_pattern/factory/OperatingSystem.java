package design_pattern.factory;

public abstract class OperatingSystem
{
    private String architecture;
    private String version;

    public OperatingSystem(String architecture, String version) {
        this.architecture = architecture;
        this.version = version;
    }

    //these abstract methods will have different implementation for different OS
    public abstract void removeDirectory();
    public abstract void changeDirectory();

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
