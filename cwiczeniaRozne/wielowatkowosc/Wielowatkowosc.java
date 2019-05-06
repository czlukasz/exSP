package czarnotalukasz.cwiczeniaRozne.wielowatkowosc;

class Contestant implements Runnable {

    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
public class Wielowatkowosc {
    public static void main(String... args) {
        Thread t1 = new Thread(new Contestant());
        Thread t2 = new Thread(new Contestant());
        Thread t3  = new Thread(new Contestant());

        t1.start();
        t2.start();
        t3.start();
    }
}