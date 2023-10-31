package com.app.interfaces;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.api.Request;

public class Menu {

    public static List<String> menus() {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        List<String> menuInsert = new ArrayList<>();

        System.out.println("=========================");
        System.out.println("+    Insert UserName    +");
        System.out.println("=========================");
        System.out.print("-> ");
        menuInsert.add(sc.next());

        System.out.println("=========================");
        System.out.println("+     Insert Choise     +");
        System.out.println("=========================");
        System.out.println("1. Anonymous");
        System.out.println("2. Confesion");
        System.out.println("3. 3 Words");
        System.out.println("4. W friendShip");
        System.out.println("5. RIZZ me");
        System.out.println("6. TBH");
        System.out.println("7. SHIP ME");
        System.out.println("8. Your Crush");
        System.out.println("9. Canceled");
        System.out.println("10. DealBreaker");
        System.out.println("11. Random (Recomended)");
        System.out.println("========================");
        System.out.print("-> ");
        menuInsert.add(sc2.next());

        System.out.println("=========================");
        System.out.println("+      Amount Spam      +");
        System.out.println("=========================");
        System.out.print("-> ");
        menuInsert.add(sc.next());

        return menuInsert;

    }
}
