package antipattern;

public class UnderlineTextFormatter extends PlainTextFormatter{
    @Override
    public String format(String text) {
        return "<u>" + text + "</u>";
    }
}
