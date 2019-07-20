package lab10;

public class CurrentTime_2 implements Runnable
{
@Override
public void run() 
{
   long starttime = System.currentTimeMillis();
   while (true) 
   {
    long time=System.currentTimeMillis()-starttime;
    long sec=((time/1000)%60);
    long min=((time/1000)/60);
    System.out.println(min+" Minutes "+sec+" Seconds ");
    try 
    {
      Thread.sleep(400);
     } 
    catch (InterruptedException ex)
    {
       System.out.println("Timer Interrupted");
     }
    }
  }
public static void main(String[] args) 
    {
        CurrentTime_2 timer = new CurrentTime_2();
        Thread thread = new Thread(timer);
        thread.start();
    }

}