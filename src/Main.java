import decorators.BoldTextFormatter;
import decorators.ItalicTextFormatter;
import decorators.UnderlineTextFormatter;
import decorators.PlainTextFormatter;
import decorators.TextFormatter;

public class Main {
    public static void main(String[] args)
    {
        // Test case 1: Plain text formatting
        TextFormatter formatter = new PlainTextFormatter();
        System.out.println(formatter.format("Hello, World!")); // Output: Hello, World!

        // Test case 2: Bold formatting
        formatter = new BoldTextFormatter(formatter);
        System.out.println(formatter.format("Hello, World!")); // Output: <b>Hello, World!</b>

        // Test case 3: Italic formatting
        formatter = new ItalicTextFormatter(formatter);
        System.out.println(formatter.format("Hello, World!")); // Output: <b><i>Hello, World!</i></b>

        // Test case 4: Underline formatting
        formatter = new UnderlineTextFormatter(formatter);
        System.out.println(formatter.format("Hello, World!")); // Output: <b><i><u>Hello, World!</u></i></b>

        // Test case 5: Nested decorators
        formatter = new BoldTextFormatter(new ItalicTextFormatter(new UnderlineTextFormatter(new PlainTextFormatter())));
        System.out.println(formatter.format("Nested Decorators")); // Output: <b><i><u>Nested Decorators</u></i></b>

        // Test case 6: Empty string
        formatter = new BoldTextFormatter(new ItalicTextFormatter(new UnderlineTextFormatter(new PlainTextFormatter())));
        System.out.println(formatter.format("")); // Output: <b><i><u></u></i></b>

        // Test case 7: Null input
        formatter = new BoldTextFormatter(new ItalicTextFormatter(new UnderlineTextFormatter(new PlainTextFormatter())));
        System.out.println(formatter.format(null)); // Output: <b><i><u>null</u></i></b>
    }
}