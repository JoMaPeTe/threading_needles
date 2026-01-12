# Thread
A thread  in JAVA context is just the way the program follows when it's executed.
There's at least one thread, known as principal process, which is created by the JAVA VIRTUAL MACHINE, when we invoke the main method.

Threads allow a program to run in a efficient way, performing several task at the same time.
It can perform complicated calculation or complex tasks in the background without interrupting the main program.

If the task is a CPU-intensive task you will want to use platform threads.
Virtual threads are intended for transient (short-lived/ephemeral) and I/O-bound loads while platform threads are used for long-running CPU-bound tasks.
Virtual threads have less startup/shutdown overhead and are more efficient when I/O bound, but they aren't as good at scheduling CPU-bound tasks.

Virtual threads are new for java 21(year 2023). On january 2026, we already have java 25, so virtual threads are relatively new.
## Virtual Inicialization
    Thread vThread = Thread.ofVirtual()
        .name("mi-hilo-virtual")
        .start(() -> System.out.println("Hola desde un Virtual Thread"));

· Also, in a abbreviated way

    Thread.startVirtualThread(() -> { /* task */ });

· Via executor (ideal for multiple concurrent task)
 
    executor = Executors.newVirtualThreadPerTaskExecutor();
    executor.submit(() -> { /* task */ });

## Platform threads
These threads are linked to the Operating System 
· Modern post Java21 way
  
      Thread pThread = Thread.ofPlatform()
    .name("mi-hilo-plataforma")
    .priority(Thread.MAX_PRIORITY)
    .start(() -> System.out.println("Hola desde un Platform Thread"));

· Classic way: you can straight forward use the Thread class or use classes that extend Thread.
    
    Thread legacyThread = new Thread(() -> { /* task */ });
    legacyThread.start();

· You can also implement the Runnable interface