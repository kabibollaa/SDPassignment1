// Client-specific audio source (AUX input)
public class AUX implements AudioSource {
    private String name;

    public AUX(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}