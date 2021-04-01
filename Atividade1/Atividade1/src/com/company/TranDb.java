package com.company;

import java.util.ArrayList;

public class TranDb {
    private ArrayList<Usuarios> trandb = new ArrayList<Usuarios>();
    private int d;
    public void receberDb(ArrayList db){
        trandb = db;
    }
    public void teste(){
        System.out.println(trandb.get(0));
        System.out.println(trandb.get(1));
        System.out.println(trandb.get(2));
    }
}
