package item;

/**
 * Created by galsdev on 11/11/2016.
 */

public class card {
    private String name;
    private int image;

    public card(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
}