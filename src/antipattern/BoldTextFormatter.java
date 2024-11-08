package antipattern;

public class BoldTextFormatter extends PlainTextFormatter{
    @Override
    public String format(String text) {
        return "<b>"+ text + "</b>";
    }
}
