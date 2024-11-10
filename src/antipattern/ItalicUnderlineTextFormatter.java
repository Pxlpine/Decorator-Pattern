package antipattern;

public class ItalicUnderlineTextFormatter extends PlainTextFormatter{
    @Override
    public String format(String text) {
        return "<i>" + "<u>" + text + "</u>" +"</i>" ;
    }
}
