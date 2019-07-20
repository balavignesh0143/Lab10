package lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileProgram_1 
{
public static void main(String[] args) 
   {
    BufferedReader bufferrreader = new BufferedReader(new InputStreamReader(System.in));
    try
     {
       System.out.println("Enter the Source Path--->");
       File source_file = new File(bufferrreader.readLine());
       System.out.println("Enter the Target Path--->");
       File target_file = new File(bufferrreader.readLine());
       CopyDataThread_1 thread = new CopyDataThread_1(new FileReader(source_file), new FileWriter(target_file));
       thread.start();
      }
      catch(IOException e)
       {
        System.out.println("The given input is Wrong");
       }
    }
}