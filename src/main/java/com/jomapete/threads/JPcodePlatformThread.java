package com.jomapete.threads;

import java.util.concurrent.ThreadLocalRandom;

public class JPcodePlatformThread extends Thread  {


    @Override
    public void run() {

        try {
            int randomNumber =  ThreadLocalRandom.current().nextInt(2000,5000);
        System.out.println("Hello, PF1 thread!");
            Thread.sleep(randomNumber); //sleep throws IOException
        System.out.println("Bye, PF1 thread!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
