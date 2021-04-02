package com.company;

import java.util.ArrayList;

public class TranDb {
    private ArrayList<String> trandb = new ArrayList<String>();
    private int d;
    public void receberDb(ArrayList db){
        trandb = db;
    }
    public String teste(int id){
        return trandb.get(id-1);
    }
}
