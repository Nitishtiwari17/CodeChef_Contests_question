package com.company;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                int k = A+B;
                if(k==C)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
