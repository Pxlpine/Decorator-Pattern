package antipattern;

public class BoldItalicTextFormatter extends PlainTextFormatter{
    @Override
    public String format(String text) {
        return "<b>" + "<i>" + text + "</i>" +"</b>" ;
    }
}
