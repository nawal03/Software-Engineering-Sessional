package problem1.fileConverter;

import java.io.*;

public class FileConverter {
    public File convertFile(File file) throws IOException {
        File newFile = File.createTempFile("converted","txt");
        FileWriter fileWriter = new FileWriter(newFile);
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int c = 0;
        while((c = bufferedReader.read()) != -1)
        {
            char ch = (char) c;
            if(ch == '~') ch = ' ';
            fileWriter.write(ch);
        }
        fileWriter.close();
        bufferedReader.close();
        fileReader.close();
        return newFile;
    }
}
