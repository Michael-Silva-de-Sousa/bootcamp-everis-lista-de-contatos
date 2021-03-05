package com.example.listacontatos
/**
 * A ideia do Data Class, além de manter o mesmo comportamento de uma classe comum,
 * é nos oferecer funções pré implementadas baseando-se nas properties do construtor primário.
 *
 * Por debaixo dos panos, o Data Class nos entrega as seguintes funções:
 * equals()/hashCode(): para comparação de objetos;
 * toString(): impressão padrão no formato “Pessoa(nome=João da Silva, idade=28)”;
 * componentN(): para permitir o uso do Destructuring Declaration;
 * copy(): para copiar o objeto com flexibilidade.
 * */
data class Contact(
        var name: String,
        var phone: String,
        var photo: String
)
