package multithreading.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample2 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2); // podajemy co chcemy zrobić, a pula wątków dba o to
        // aby zrealizować te zadania

        executorService.submit(() -> numbers());
        executorService.submit(() -> numbers());
        executorService.submit(() -> numbers()); // jeżeli mamy więcej zadań niż jest w puli wątków to
        //3 zadanie zostanie wykonane gdy będzie wolny jakiś wątek gdy skończy wykonywać swoje aktualne zadanie

//        executorService.shutdownNow(); //stara się zamknąc wątek w momencie jego trwania, nie ważne czy się zakończył czy nie
        executorService.shutdown(); // zamyka pulę po wykonaniu wszystkich wątków


    }

    public static void numbers() {
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
