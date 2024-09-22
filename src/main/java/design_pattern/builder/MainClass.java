package design_pattern.builder;

public class MainClass
{
    public static void main(String[] args) {
        Computer gamingPC = new Computer.ComputerBuilder()
                .ram(16)
                .gpu("RTX 4050")
                .hdd(512)
                .processor("i5 13th Gen")
                .isGaming(true)
                .build();

        Computer officePC = new Computer.ComputerBuilder()
                .ram(8)
                .hdd(128)
                .processor("Pentium")
                .build();

        System.out.println("Gaming PC specs: " + gamingPC);
        System.out.println("Office PC specs: " + officePC);
    }
}
