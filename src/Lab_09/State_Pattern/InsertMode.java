package Lab_09.State_Pattern;

public class InsertMode implements EditingMode{

    private DocumentEditorContext documentEditor;

    public InsertMode(DocumentEditorContext documentEditor) {
        this.documentEditor = documentEditor;
    }

    @Override
    public void type(String words) {
        System.out.println("Inserting: " + words);
        documentEditor.setCurrentText(documentEditor.getCurrentText() + words);
    }

    @Override
    public void save() {
        System.out.println("Saving document in Insert Mode.");
    }

    @Override
    public void switchMode() {
        System.out.println("Switching to Overwrite Mode.");
        documentEditor.setCurrentMode(documentEditor.getOverwriteMode());
    }
}
