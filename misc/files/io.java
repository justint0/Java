package misc.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class io {
  public static void main(String[] args) {
    // Write to file
    String[] skills = {"Python", "JavaScript", "Java"};
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("misc/files/output.text"));
      writer.write("Hello, my name is Justin!");
      writer.write("\nI am a UConn alumnus.");
      for (String skill : skills) {
        writer.write("\n" + skill);
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Read from file
    try {
      BufferedReader reader = new BufferedReader(new FileReader("misc/files/output.text"));
      String line;
      while((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
