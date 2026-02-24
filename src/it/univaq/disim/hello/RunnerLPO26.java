package it.univaq.disim.hello;

public class RunnerLPO26 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Non sono stati passati argomenti");
            return;
        }
        int numeroDaVerificare = Integer.parseInt(args[0]);

        System.out.printf("il numero %d %s è primo\n", numeroDaVerificare,
                        SupportoLPONumeri26.isPrime(numeroDaVerificare) ? "" : "non");
        System.out.println("Il numero %d %s verifica la concettura di Goldbach\n".formatted(numeroDaVerificare,
                        SupportoLPONumeri26.goldbach(numeroDaVerificare) ? "" : "non "));
        System.out.println("La congettura di Goldbach è vera fino a %d? %s\n".formatted(numeroDaVerificare,
                        SupportoLPONumeri26.goldbachUntil(numeroDaVerificare) ? "Si" : "No "));
    }
    
}
