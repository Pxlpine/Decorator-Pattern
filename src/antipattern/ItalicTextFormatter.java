package antipattern;

public class ItalicTextFormatter extends PlainTextFormatter {
    @Override
    public String format(String text) {
        return "<i>" + text + "</i>";
    }
}
