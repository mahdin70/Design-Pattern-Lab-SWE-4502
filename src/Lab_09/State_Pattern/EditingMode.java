package Lab_09.State_Pattern;

public interface EditingMode {
    void type(String words);

    void save();

    void switchMode();
}
