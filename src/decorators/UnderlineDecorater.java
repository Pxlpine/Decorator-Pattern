package decorators;

public class UnderlineDecorater extends TextFormatterDecorator {
    public UnderlineDecorater(TextFormatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String text) {
        return "<u>" + super.format(text) + "</u>";
    }
}