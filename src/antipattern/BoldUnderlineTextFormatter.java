package antipattern;

public class BoldUnderlineTextFormatter extends PlainTextFormatter{
    @Override
    public String format(String text) {
        return "<b>" + "<u>" + text + "</u>" +"</b>" ;
    }
}
