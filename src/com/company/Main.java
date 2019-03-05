package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int a[][] = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(100);
            }
        }
        //test1(a);
        //test2(a);
        test3(a);
    }

        public static void test1(int a[][]) {
            int x = a[0][0], y = a[0][0], b = 0, c = 0, d = 0, e = 0;
            for (int i = 0; i < a.length; i++) {
                System.out.println(Arrays.toString(a[i]));
                for (int j = 0; j < a[i].length; j++) {
                    if (x > a[i][j]) {
                        x = a[i][j];
                        b = i;
                        c = j;
                    }
                    if (y < a[i][j]) {
                        y = a[i][j];
                        d = i;
                        e = j;
                    }
                }
            }
            System.out.println("Max=" + y + "\tMin=" + x);
            System.out.println("Max=" + a[d][e] + "\tMin=" + a[b][c]);
        }
    public static void test2(int a[][]) {
        int sum=0;
        for (int i = 0; i <a.length; i++)sum+=a[i][i];
        System.out.println("sum= " + sum);
         }


    public static void test3(int a[][]) {
        int sums[] = new int[a.length], sumst[] = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            System.out.println(Arrays.toString(a[i]));
            for (int j = 0; j < a.length; j++) {
                sums[i]=a[i][j];
                sumst[i]=a[j][i];
                }
            }
        System.out.println((Arrays.toString(sums)) + (Arrays.toString(sumst)));
        }
    }


