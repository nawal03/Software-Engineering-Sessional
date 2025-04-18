package problem2.factory;

import problem2.font.Font;
import problem2.font.Monaco;
import problem2.parser.CppParser;
import problem2.parser.Parser;

public class Cpp implements Language {
    @Override
    public String getName() {
        return "Cpp";
    }

    @Override
    public Font getFont() {
        return new Monaco();
    }

    @Override
    public Parser getParser() {
        return new CppParser();
    }
}
