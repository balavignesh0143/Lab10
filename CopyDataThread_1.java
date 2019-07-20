package lab10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread_1 extends Thread 
{
FileReader reader;
FileWriter writer;
public CopyDataThread_1(FileReader reader,FileWriter writer) 
    {
        this.reader = reader;
        this.writer = writer;
    }
 @Override
    public void run() 
     {
        int element;
        int countword=0;
        try 
        {
            while((element=reader.read())!=-1) 
            {
                writer.write(element);
                countword++;
                if (countword== 10)
                {
                    countword=0;
                    System.out.println("No.of Characters Copied:10");
                    sleep(10000);
                }
            }
            System.out.println("File Copied Successfully");
        } 
        catch (IOException | InterruptedException ex) 
        {
            System.out.println("Error in Reading and Writing File");
        } 
        finally 
        {
            try 
            {
                reader.close();
                writer.close();
            } 
            catch (IOException ex)
            {
                System.out.println("Error in Reading and Writing File");
            } 
            catch (NullPointerException e)
            {
                System.out.println("One of the given file doesn't exist.");
            }

        }

    }

}