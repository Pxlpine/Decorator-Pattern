package decorators;

public class BoldDecorator extends TextFormatterDecorator{
    public BoldDecorator(TextFormatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String text) {
        return "<b>" + super.format(text) + "</b>";
    }
}
