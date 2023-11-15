package com.example.collectionsstreamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2","3" ,"9", "9", "6" ,"5");

        System.out.println("Imprima todos os elementos dessa Lista de Strinf: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 últimos números primeiros e coloque dentro de um set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme está lista de String em uma lista de números inteiros: ");
        List<Integer> numeros = new java.util.ArrayList<>(numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList());
//                 .forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(collectList);


        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("Remova os valores impares: ");
        numeros.removeIf(integer -> (integer % 2 !=0));
        System.out.println(numeros);

        System.out.println("Ignore os 3 primeiros elementos: ");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);


    }
}
