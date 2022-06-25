package com.citra;

import java.util.PriorityQueue;
public class Main {

    public static void main(String[] args) {
        PriorityQueue<pesanan> Pesanan = new PriorityQueue<>();
        Pesanan.add(new pesanan(1, "Intan", 3, "biasa", 5));
        Pesanan.add(new pesanan(2, "Dudi", 4, "express", 3));
        Pesanan.add(new pesanan(3, "Ruli", 4, "kilat", 1));
        Pesanan.add(new pesanan(4, "Susi", 5, "biasa", 2));
        Pesanan.add(new pesanan(5, "Ira", 6, "biasa", 5));
        Pesanan.add(new pesanan(6, "Mayang", 7, "kilat", 4));

        for(int i = 0; i <= 5; i++){
            System. out.println(Pesanan.poll());
        }
    }
}
