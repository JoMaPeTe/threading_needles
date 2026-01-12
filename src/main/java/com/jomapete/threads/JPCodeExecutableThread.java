package com.jomapete.threads;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class JPCodeExecutableThread implements Runnable
{
    @Override
    public void run()
    {
        try {
            int randomNumber =  ThreadLocalRandom.current().nextInt(2000,5000);

            System.out.println("     - Executable START Executable thread!: "+ LocalDateTime.now());
            Thread.sleep(randomNumber); //sleep throws IOException
            System.out.println("     - Executable END, Executable thread!: "+ LocalDateTime.now());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
