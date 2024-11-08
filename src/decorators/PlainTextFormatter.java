package decorators;

public class PlainTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text;
    }
}
