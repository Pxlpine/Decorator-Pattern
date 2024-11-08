package decorators;

public class ItalicTextFormatter extends TextFormatterDecorator {
    public ItalicTextFormatter(TextFormatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String text) {
        return "<i>" + super.format(text) + "</i>";
    }
}