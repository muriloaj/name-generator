## Name Generator

Name generator is a Hello World Kotlin project using Springboot. The names were provided dinamically based in some elements found at periodic table, in English, Spanish, Portuguese, Latin besides its atomic number and symbol. 

To run on terminal:
```sh
$ ./gradlew bootRun
```

## Endpoints + functions

### 'z' - Atomic random number

```
$ curl http://localhost:8080/periodic-table/z
```

### 'symbol' - Random symbol

```
$ curl http://localhost:8080/periodic-table/symbol
```

### 'en' - English random name

```
$ curl http://localhost:8080/periodic-table/en
```

### 'es' - Spanish random name
```
$ curl http://localhost:8080/periodic-table/es
```

### 'pt' - Portuguese random name

```
$ curl http://localhost:8080/periodic-table/pt
```

### 'latin' - Latin random namer

```
$ curl http://localhost:8080/periodic-table/latin
```

### 'mix' - Atomic number, Portuguese, English, Latin and Spanish totally shuffled and randomized

```
$ curl http://localhost:8080/periodic-table/mix
```


