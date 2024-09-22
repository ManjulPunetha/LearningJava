package custom_annotation;

@SmartPhone(os = "Android",version = 4)
public class OnePlus
{
    String model;
    int size;

    public OnePlus(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
