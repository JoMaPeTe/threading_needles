package com.jomapete.threads;

import java.util.concurrent.ThreadLocalRandom;

public class JPCodeExecutableThread implements Runnable
{
    @Override
    public void run()
    {
        try {
            int randomNumber =  ThreadLocalRandom.current().nextInt(2000,5000);

            System.out.println("Hello, Executable thread!");
            Thread.sleep(randomNumber); //sleep throws IOException
            System.out.println("Bye, Executable thread!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
