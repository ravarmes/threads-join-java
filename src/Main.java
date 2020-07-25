
public class Main {

    public static void main(String[] args) {
        System.out.println("INICIO DA THREAD MAIN ***");
        Thread t1 = new Thread(new MinhaRunnable(), "thread 1");
        Thread t2 = new Thread(new MinhaRunnable(), "\t\tthread 2");
        t1.start();
        t2.start();
        
        
        try {
            t1.join(); // a thread main aguarda o término de t1
            t2.join(); // a thread main aguarda o término de t2
        } catch (InterruptedException e) {
            System.out.println("Interrupção");
        }
        
        
        System.out.println("*** As duas threads encerraram a contagem * * *");
        // outras coisas da thread main
    }
}
