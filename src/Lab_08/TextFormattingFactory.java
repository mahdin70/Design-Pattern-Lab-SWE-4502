package Lab_08;

import java.util.HashMap;
import java.util.Map;

public class TextFormattingFactory {
    private static final Map<String, TextFormatting> formattingMap = new HashMap<>();

    public static TextFormatting getFormatting(String style, int size, String color) {
        String key = style + size + color;
        if (!formattingMap.containsKey(key)) {
            formattingMap.put(key, new ConcreteTextFormatting(style, size, color));
        }
        return formattingMap.get(key);
    }
}
