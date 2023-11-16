package Lab_09.Visitor_Pattern;

import java.util.List;

public class DocumentOperationVisitor implements DocumentVisitor{
    private int paragraphCount = 0;
    private int imageCount = 0;

    @Override
    public void visit(SimpleParagraph simpleParagraph) {
        System.out.println("Styling Simple Paragraph");
        paragraphCount++;
    }

    @Override
    public void visit(HeadingParagraph headingParagraph) {
        System.out.println("Styling Heading Paragraph");
        paragraphCount++;
    }

    @Override
    public void visit(InlineImage inlineImage) {
        System.out.println("Resizing Inline Image");
        imageCount++;
    }

    @Override
    public void countElements(List<DocumentElement> elements) {
        for (DocumentElement element : elements) {
            element.accept(this);
        }
        System.out.println("Total Paragraphs: " + paragraphCount);
        System.out.println("Total Images: " + imageCount);
    }

    @Override
    public void performGlobalOperation() {
        System.out.println("Performing a global operation on the document");
    }
}
