package Interview;

import java.io.*;

public class BufferReader_BufferWriter {
    public static void main(String[] args) throws IOException {

        FileReader text = new FileReader("TextFile.txt");
        BufferedReader reader = new BufferedReader(text);
        System.out.println(reader.readLine());


        FileWriter text2 = new FileWriter("TextFile2.txt");
        BufferedWriter writer = new BufferedWriter(text2);
        writer.write("How is your mood today?");
        writer.close();

    }
}
