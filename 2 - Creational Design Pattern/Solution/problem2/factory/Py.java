package problem2.factory;

import problem2.font.Consolas;
import problem2.font.Font;
import problem2.parser.Parser;
import problem2.parser.PyParser;

public class Py implements Language {
    @Override
    public String getName() {
        return "Python";
    }

    @Override
    public Font getFont() {
        return new Consolas();
    }

    @Override
    public Parser getParser() {
        return new PyParser();
    }
}
