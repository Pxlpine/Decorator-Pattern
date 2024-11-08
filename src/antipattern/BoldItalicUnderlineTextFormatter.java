package antipattern;

public class BoldItalicUnderlineTextFormatter extends PlainTextFormatter{
    @Override
    public String format(String text) {
        return "<b>" + "<i>" + "<u>" + text + "</u>"+ "</i>" +"</b>" ;
    }
}
