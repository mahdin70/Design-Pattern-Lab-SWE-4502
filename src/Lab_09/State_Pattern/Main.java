package Lab_09.State_Pattern;

public class Main {
    public static void main(String[] args) {
        DocumentEditorContext documentEditor = new DocumentEditorContext();

        System.out.println("------ Insert Mode ------");
        documentEditor.type("Hello, ");
        documentEditor.save();
        documentEditor.switchMode();


        System.out.println("\n------ Overwrite Mode ------");
        documentEditor.type("World!");
        documentEditor.save();
        documentEditor.switchMode();


        System.out.println("\n------ Highlight Mode ------");
        documentEditor.type("Important Text");
        documentEditor.save();
        documentEditor.switchMode();


        System.out.println("\n------ Insert Mode (Again) ------");
        documentEditor.type("Adding More Text");
        documentEditor.save();
    }
}
