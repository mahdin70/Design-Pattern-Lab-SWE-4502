package Lab_09.State_Pattern;

public class OverwriteMode implements EditingMode{
    private DocumentEditorContext documentEditor;

    public OverwriteMode(DocumentEditorContext documentEditor) {
        this.documentEditor = documentEditor;
    }

    @Override
    public void type(String words) {
        System.out.println("Overwriting: " + words);
        documentEditor.setCurrentText(words);
    }

    @Override
    public void save() {
        System.out.println("Saving document in Overwrite Mode.");
    }

    @Override
    public void switchMode() {
        System.out.println("Switching to Highlight Mode.");
        documentEditor.setCurrentMode(documentEditor.getHighlightMode());
    }
}
