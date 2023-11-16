package Lab_09.Visitor_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentElement> documentElements = new ArrayList<>();

        documentElements.add(new SimpleParagraph());
        documentElements.add(new HeadingParagraph());
        documentElements.add(new InlineImage());
        documentElements.add(new SimpleParagraph());


        DocumentVisitor documentOperationVisitor = new DocumentOperationVisitor();

        for (DocumentElement element : documentElements) {
            element.accept(documentOperationVisitor);
        }
        documentOperationVisitor.countElements(documentElements);
        documentOperationVisitor.performGlobalOperation();
    }
}
