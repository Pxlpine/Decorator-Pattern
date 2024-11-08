package decorators;

public class TextFormatterDecorator implements TextFormatter{
    protected TextFormatter formatter;

    public TextFormatterDecorator(TextFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String format(String text) {
        return formatter.format(text);
    }
}
