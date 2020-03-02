/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

import java.util.LinkedList;

/**
 *
 * @author user
 */
public class Tester {
    public static void main(String[] args) {
        System.out.println("Generate 20 non-duplicate integer within 0-100");
        ArrayGenerateN<Integer> n = new ArrayGenerateN<>(20);
        n.generateN();
        System.out.println(n.toString());
        LinkedListGenerateN<Integer> j = new LinkedListGenerateN<>(20);
        j.generateN();
        System.out.println(j.toString());
        
    }
}
