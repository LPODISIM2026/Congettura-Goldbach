# LEZIONE 2 - Primo programma Java e congettura di Goldbach

Questo repository contiene il codice sviluppato in classe. Un primo approccio alla programmazione in JAVA.

Una congettura matematica ancora aperta è quella di Goldbach: ogni numero pari più grande di 4 è la somma di due numeri primi. Per esempio, abbiamo 4 = 2 + 2, 6 = 3 + 3, 8 = 5 + 3, ...

Scrivere un programma che, dato un numero intero n, verifica che la congettura è vera per tutti i numeri minori di n.

## Per compilare

Dalla cartella del progetto, creare prima la cartella `bin` se non esiste:

```bash
mkdir -p bin
```

Poi compilare tutti i sorgenti:

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

## Per generare la JavaDoc

Dalla cartella del progetto, creare prima la cartella `doc` se non esiste:

```bash
mkdir -p doc
```

Poi generare la documentazione:

```bash
javadoc -d doc -sourcepath src -subpackages it.univaq.disim.hello
```

La documentazione sarà disponibile aprendo `doc/index.html` nel browser.

## Cronologia dei commit

- [`343c23e`](https://github.com/LPODISIM2026/Congettura-Goldbach/commit/343c23e) Seconda lezione
- [`6875e82`](https://github.com/LPODISIM2026/Congettura-Goldbach/commit/6875e82) Primo commit, lezione 2
