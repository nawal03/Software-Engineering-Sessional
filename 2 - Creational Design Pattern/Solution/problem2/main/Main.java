package problem2.main;

import problem2.editor.Editor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Editor editor = Editor.getEditor();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter Filename : ");
            String filename = scanner.next();
            editor.openFile(filename);
        }
    }
}
