package design_pattern.builder;

public class Computer
{
    private int ram;
    private int hdd;
    private String gpu;
    private String processor;
    private boolean isGaming;

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.hdd = computerBuilder.hdd;
        this.gpu = computerBuilder.gpu;
        this.processor = computerBuilder.processor;
        this.isGaming = computerBuilder.isGaming;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", gpu='" + gpu + '\'' +
                ", processor='" + processor + '\'' +
                ", isGaming=" + isGaming +
                '}';
    }

    public static class ComputerBuilder
    {
        private int ram;
        private int hdd;
        private String gpu;
        private String processor;
        private boolean isGaming;

        public ComputerBuilder ram(int ram){
            this.ram = ram;
            return this;
        }
        public ComputerBuilder hdd(int hdd){
            this.hdd = hdd;
            return this;
        }
        public ComputerBuilder gpu(String gpu){
            this.gpu = gpu;
            return this;
        }
        public ComputerBuilder processor(String processor){
            this.processor = processor;
            return this;
        }
        public ComputerBuilder isGaming(boolean isGaming){
            this.isGaming = isGaming;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
