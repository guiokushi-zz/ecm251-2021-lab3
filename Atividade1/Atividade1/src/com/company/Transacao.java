package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Transacao {
    private Scanner scanner = new Scanner(System.in);
    private TranDb tranDb = new TranDb();

    public void recdb(ArrayList db) {
        tranDb.receberDb(db);
    }

    public void testao(){
        tranDb.teste();
    }
}
