package org.mart8ins;

import java.io.*;
public class TextReader {
    public static String readFile(String fileName){
        File file = new File(fileName);
        String fileText = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                fileText += line;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found - " + file.getName());
        } catch (IOException e) {
            System.out.println("Problems reading file -  " + file.getName());
        }
        return fileText.toLowerCase();
    }


}
