package Lab_09.State_Pattern;

public class DocumentEditorContext {
    private EditingMode insertMode;
    private EditingMode overwriteMode;
    private EditingMode highlightMode;

    private EditingMode currentMode;
    private String currentText;

    public DocumentEditorContext() {

        insertMode = new InsertMode(this);
        overwriteMode = new OverwriteMode(this);
        highlightMode = new HighlightMode(this);


        currentMode = insertMode;
    }

    public void type(String words) {
        currentMode.type(words);
    }

    public void save() {
        currentMode.save();
    }

    public void switchMode() {
        currentMode.switchMode();
    }

    public EditingMode getInsertMode() {
        return insertMode;
    }

    public EditingMode getOverwriteMode() {
        return overwriteMode;
    }

    public EditingMode getHighlightMode() {
        return highlightMode;
    }

    public EditingMode getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(EditingMode currentMode) {
        this.currentMode = currentMode;
    }

    public String getCurrentText() {
        return currentText;
    }

    public void setCurrentText(String currentText) {
        this.currentText = currentText;
    }
}
