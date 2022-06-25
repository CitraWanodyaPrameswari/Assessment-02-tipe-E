package com.citra;

public class pesanan implements Comparable<pesanan>{

    public int urutan, washId, weight, date;
    public String name, type;

    public pesanan(int washId, String name, int date, String type, int weight){
        if(type == "kilat"){
            urutan = 1 + date;
        }else if(type == "express"){
            urutan = 2 + date;
        }else if(type == "biasa"){
            urutan = 3 + date;
        }
        this.washId = washId;
        this.type= type;
        this.name = name;
        this.weight = weight;
        this.date = date;
    }
    public int getUrutan(){
        return urutan;
    }
    @Override
    public int compareTo(pesanan Pesanan){
            return this.date = Pesanan.date;
        }
    @Override
    public String toString(){
        return "pesanan{" +
                "washId = " + washId +
                ", name = " + name + '\''+
                '}';
    }
}
