package decorators;

public class UnderlineTextFormatter extends TextFormatterDecorator {
    public UnderlineTextFormatter(TextFormatter formatter) {
        super(formatter);
    }

    @Override
    public String format(String text) {
        return "<u>" + super.format(text) + "</u>";
    }
}