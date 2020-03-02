/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author user
 */
public class LinkedListGenerateN<T> implements GenerateN<T> {

    private LinkedList<Integer> N;
    private int rollrum;

    public LinkedListGenerateN(int rollrum) {
        this.rollrum = rollrum;
        N = new LinkedList<>();
    }

    public LinkedListGenerateN() {
        N = new LinkedList<>();
    }

    @Override
    public void generateN() {
        Random ran = new Random();
        
        for (int i = 0; i < rollrum; i++) {
            int b = ran.nextInt(101);
            N.add(b);
              for (int j = 0; j < i; j++) {
                if (N.get(j) == b) {
                    N.remove(i);
                    b = ran.nextInt(101);
                    N.add(b);
                }
                }
        }
        
    }

    @Override
    public String toString() {
        Collections.sort(N);
        return "Linked List Implementation\n"+ N.toString().replace("[", " ").replace("]", " ").replace(",", " ");
    }

}
