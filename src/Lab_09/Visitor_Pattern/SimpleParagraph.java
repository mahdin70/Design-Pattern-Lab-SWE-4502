package Lab_09.Visitor_Pattern;

public class SimpleParagraph implements DocumentElement {
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
