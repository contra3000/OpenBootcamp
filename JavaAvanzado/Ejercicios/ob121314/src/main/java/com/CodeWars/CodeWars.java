package com.CodeWars;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.lang.Integer.*;

public class CodeWars {

    public static void main(String[] args) {

        for (int numero: digitize(12345)){
            System.out.println(numero);
        }
    }

    /**
     * Given a random non-negative number,
     * you have to return the digits of this number within an array in reverse order.
     * @param iNumero Número de entrada
     * @return int[] array in reverse order
     */
    public static int[] digitize(long iNumero) {
        String sLong = Long.toString(n);
        int[] digited = new int[sLong.length()];
        for (int i = sLong.length()-1; i>=0; i--){
            digited[(sLong.length()-1)-i] = parseInt(String.valueOf(sLong.charAt(i)));
        }
        return digited;
    }

    /**
     * Implement a function that adds two numbers together and returns their sum in binary.
     * The conversion can be done before, or after the addition.
     * The binary number returned should be a string.
     *
     * @param a first number
     * @param b second number
     * @return String sum in binary
     */
    public static String binaryAddition(int a, int b){
        int sum = a + b;
        return toBinaryString(sum);
    }

    /**
     * Consider an array/list of sheep where some sheep may be missing from their place.
     * We need a function that counts the number of sheep present in the array (true means present).
     * @param arrayOfSheeps Boolean array of sheeps presents
     * @return int sheeps present
     */
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int sheeps = 0;
        for (Boolean sheep : arrayOfSheeps){
            try{
                if (sheep) {
                    sheeps += 1;
                } else {
                    continue;
                }
            } catch (NullPointerException e){
                continue;
            }
        }
        return sheeps;
    }

    /**
     * Complete the square sum function
     * so that it squares each number passed into it and then sums the results together.
     * @param n array of numbers to be operated
     * @return int total sum
     */
    public static int squareSum(int[] n){
        return IntStream.of(n).map(x -> x*x).sum();
    }


}
