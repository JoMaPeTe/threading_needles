package com.jomapete.threads;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class JPcodePlatformThread extends Thread  {


    @Override
    public void run() {

        try {
            int randomNumber =  ThreadLocalRandom.current().nextInt(2000,5000);
        System.out.println(" - PF1 START, PF1 thread!: " + LocalDateTime.now());
            Thread.sleep(randomNumber); //sleep throws IOException
        System.out.println(" - PF1 END, PF1 thread!: "+ LocalDateTime.now());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
