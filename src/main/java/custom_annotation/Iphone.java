package custom_annotation;

@SmartPhone(os = "iOS",version = 5)
public class Iphone
{
    String model;
    int size;

    public Iphone(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
