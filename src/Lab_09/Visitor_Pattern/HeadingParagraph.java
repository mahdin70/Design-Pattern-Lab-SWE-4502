package Lab_09.Visitor_Pattern;

public class HeadingParagraph implements DocumentElement {
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
