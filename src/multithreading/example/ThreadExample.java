package multithreading.example;

public class ThreadExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 999 ; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);

            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 999 ; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);

            }

        });

        t1.setPriority(1);
        t2.setPriority(10); //waga 10, wątek dostanie najwięcej przydziału procesora. Nie ma gwarancji, że zadanie zostanie zrealizowane szybciej niż pozostałe
        t1.setName("t1");
//        t1.run(); // uruchamia zadanie w wątku głównym
        t1.start(); // pozwala uruchomic zadanie w osobnym wątku
        t2.setName("t2");
//        t2.run();
        t2.start();

//        Współbieżność pozwala na uruchomienie wielu procesów równocześnie


    }

}
