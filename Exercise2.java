package lab10;

import java.text.SimpleDateFormat;
import java.util.Date;

class Time implements Runnable
{
	@Override
	public void run() {
	}
}

public class Exercise2 {
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread();
		t.start();
		for(int i=0;i<10;i++)
		{		Date d=new Date();
			System.out.println(new SimpleDateFormat(" H:mm:ss").format(d));
			Thread.sleep(10000);
		}	
	}
}