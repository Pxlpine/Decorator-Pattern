package decorators;

public class BoldTextFormatter extends TextFormatterDecorator{
    public BoldTextFormatter(TextFormatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String text) {
        return "<b>" + super.format(text) + "</b>";
    }
}
