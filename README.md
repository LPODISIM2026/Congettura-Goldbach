# LEZIONE 2 - Primo programma Java e congettura di Goldbach

Questo repository contiene il codice sviluppato in classe. Un primo approccio alla programmazione in JAVA.

Una congettura matematica ancora aperta è quella di Goldbach: ogni numero pari più grande di 4 è la somma di due numeri primi. Per esempio, abbiamo 4 = 2 + 2, 6 = 3 + 3, 8 = 5 + 3, ...

Scrivere un programma che, dato un numero intero n, verifica che la congettura è vera per tutti i numeri minori di n.

## Per compilare

Dalla cartella del progetto, eseguire:

```bash
javac -d bin src/it/univaq/disim/hello/*.java
```

## Per eseguire

```bash
java -cp bin it.univaq.disim.hello.RunnerLPO26 <numero>
```

Esempio:
```bash
java -cp bin it.univaq.disim.hello.RunnerLPO26 100000
```


