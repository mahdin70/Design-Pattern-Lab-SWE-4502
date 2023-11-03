package Lab_08;

public class Main {
    public static void main(String[] args) {
        String text1 = "This is a simple text.";
        String text2 = "This is bold and red.";
        String text3 = "This is italic and blue.";


        TextFormatting simple = TextFormattingFactory.getFormatting("simple", 10, "black");
        TextFormatting boldRed = TextFormattingFactory.getFormatting("bold", 12, "red");
        TextFormatting italicBlue = TextFormattingFactory.getFormatting("italic", 14, "blue");

        simple.applyFormatting(text1);
        boldRed.applyFormatting(text2);
        italicBlue.applyFormatting(text3);
    }
}
