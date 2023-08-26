package Algoritmus;

import ConstructorCar.Main;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        System.out.println("Исходный массив " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));



        /* Реализуйте и оцените алгоритм поиска максимального числа в неотсортированном массиве (объясните почему именно такая оценка).
        Реализовать можно как в виде текста, псевдокода или блок-схемы, так и в виде реального кода.
        int[] a = {5, 2, 8, 1, 3};
         int max = array[0];             //max=1
        for (int i = 0; i < n; i++) {  //i = 2
            if (array[i] > max) {        // array[2]= 8
                max = array[i];        // max = array[2] = 8
            }
            System.out.print(max);
         */

        int[] a = {5, 2, 8, 1, 3};
        //Выводим изначальный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        // Переменная, которая будет использоваться при обмене элементов

        int max = array[0];             //max=1
        for (int i = 0; i < n; i++) {  //i = 2
            if (array[i] > max) {        // array[2]= 8
                max = array[i];        // max = array[2] = 8
            }
            System.out.print(max);
        }
        int temp;

        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;

            System.out.println();
        }
        //Выводим конечный массив в консоль
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);


        /*Эти алгоритмы помогают оценить как будут увеличиваться и маштобироваться входные данные.
         0(n)- линейный способ - начинается от 0 и до i++, проходит через каждый элемент массива
        for(int i=0; i<n; i++)
        sout(i);
        0(n^2) - квадратный способ - во вложенные два цикла, проходит через каждый элемент массива
        for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
        sout(i+j);
        }}
        0(n^3) - кубический способ - во вложенные три цикла, проходит через каждый элемент массива
        for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
        for(int k=0; k<n; k++){
        sout(i+j+k);
        }}}
        O(log n)- логарифмический способ двоичный поиск в отсартированном массиве
        int = n
        while(i>0){
        i/=2}
        присваеваеся значение i пока нестанет 0, мы должны понять сколько раз делится пополам.
         */


        }
    }
}
