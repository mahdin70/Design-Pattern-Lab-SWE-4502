package Lab_09.Visitor_Pattern;

public interface DocumentElement {

    void accept(DocumentVisitor visitor);
}
