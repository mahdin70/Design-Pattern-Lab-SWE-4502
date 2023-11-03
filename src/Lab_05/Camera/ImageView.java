package Lab_05.Camera;

public class ImageView {
    Image image;
    Filter filter;

    public ImageView(Image image, Filter filter) {
        this.image = image;
        this.filter = filter;
    }

    public void applyFilter() {
        filter.apply(image);
    }
}