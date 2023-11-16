package Lab_09.State_Pattern;

public class HighlightMode implements EditingMode{
    private DocumentEditorContext documentEditor;

    public HighlightMode(DocumentEditorContext documentEditor) {
        this.documentEditor = documentEditor;
    }

    @Override
    public void type(String words) {
        System.out.println("Highlighting: " + words);
    }

    @Override
    public void save() {
        System.out.println("Saving document in Highlight Mode.");
    }

    @Override
    public void switchMode() {
        System.out.println("Switching to Insert Mode.");
        documentEditor.setCurrentMode(documentEditor.getInsertMode());
    }
}
