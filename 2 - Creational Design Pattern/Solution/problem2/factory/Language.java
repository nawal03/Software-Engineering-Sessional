package problem2.factory;

import problem2.font.Font;
import problem2.parser.Parser;

public interface Language {
    public String getName();
    public Font getFont();
    public Parser getParser();
}
