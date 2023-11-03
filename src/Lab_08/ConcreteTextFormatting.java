package Lab_08;

public class ConcreteTextFormatting implements TextFormatting{
    private String style;
    private int size;
    private String color;

    public ConcreteTextFormatting(String style, int size, String color) {
        this.style = style;
        this.size = size;
        this.color = color;
    }

    @Override
    public void applyFormatting(String text) {
        System.out.println("Applying formatting: Style - " + style + ", Size - " + size + ", Color - " + color);
        System.out.println(text);
    }
}
