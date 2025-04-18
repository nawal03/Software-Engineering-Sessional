package problem2.factory;

public class LanguageFactory {
    public Language getLanguage(String filename){
        int length = filename.length();
        if(length>=2 && filename.substring(length-2).equals(".c"))
            return new C();
        else if(length>=4 && filename.substring(length-4).equals(".cpp"))
            return new Cpp();
        else if(length>=3 && filename.substring(length-3).equals(".py"))
            return new Py();
        else
            return null;
    }
}
