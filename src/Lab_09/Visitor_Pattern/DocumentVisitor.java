package Lab_09.Visitor_Pattern;
import java.util.ArrayList;
import java.util.List;

public interface DocumentVisitor {
    void visit(SimpleParagraph simpleParagraph);

    void visit(HeadingParagraph headingParagraph);

    void visit(InlineImage inlineImage);

    void countElements(List<DocumentElement> elements);

    void performGlobalOperation();
}
