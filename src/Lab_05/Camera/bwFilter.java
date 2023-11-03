package Lab_05.Camera;

public class bwFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Black and white filter applied.");
    }
}