package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int[][] numbers = new int[2][3];
        // {{1, 2, 3},
        // {4, 5, 6}}

        int[][] numbers = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};


        //System.out.println(numbers[1][0]);  // [индекс столбца][индекс элемента]


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }

    }
}

//  git - Автобус
// file and packages - Пассажиры
// GitHub - Конечная
