package decorators;

public class ItalicDecorator extends TextFormatterDecorator {
    public ItalicDecorator(TextFormatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String text) {
        return "<i>" + super.format(text) + "</i>";
    }
}