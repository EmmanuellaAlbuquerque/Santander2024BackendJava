## Functional Interface

````java
// Consumer<T>
// Consumer (Com 1 Argumento + Sem retorno)
numero -> System.out.println(numero)

// Supplier<sem argumento, T>
// Supplier (Sem Argumento + Com retorno)
() -> "";

// Function<T, R>
// Function (Com 1 Argumento + Com retorno)
numero -> numero * 2;

// Predicate<T, true/false>
// Predicate (Com 1 Argumento + Com retorno Booleano)
numero -> numero % 2 == 0

// BinaryOperator<(T,T), T>
// BinaryOperator (Com 2 Argumentos + Com retorno)

````