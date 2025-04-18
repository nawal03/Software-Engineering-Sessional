package problem2.factory;

import problem2.font.CourierNew;
import problem2.font.Font;
import problem2.parser.CParser;
import problem2.parser.Parser;

public class C implements Language {
    @Override
    public String getName() {
        return "C";
    }

    @Override
    public Font getFont() {
        return new CourierNew();
    }

    @Override
    public Parser getParser() {
        return new CParser();
    }
}
