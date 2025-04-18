package problem2.editor;

import problem2.factory.Language;
import problem2.factory.LanguageFactory;

public class Editor {
    private static Editor editor;
    private Language language;

    private Editor(){

    }

    public synchronized static Editor getEditor(){
        if(editor == null) {
            editor = new Editor();
        }
        return editor;
    }

    public void openFile(String filename){
        LanguageFactory languageFactory = new LanguageFactory();
        Language language = languageFactory.getLanguage(filename);
        if(language == null){
            System.out.println("Invalid Extension");
        }
        else{
            System.out.println(language.getName()+ " file opened. Font is: "+language.getFont().getName()+".");
            System.out.println(language.getParser().parse());
        }
    }

    public void closeEditor(){
        editor = null;
    }
}
