/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 * @param <T>
 */
public class ArrayGenerateN<T> implements GenerateN<T> {

    private int[] N;
    private int rollnum;

    public ArrayGenerateN(int rollnum) {
        this.rollnum = rollnum;
        N = new int[this.rollnum];
    }

    @Override
    public void generateN() {
        Random ran = new Random();
        //non duplicate
        for (int i = 0; i < N.length; i++) {
            int b = ran.nextInt(101);
            N[i] = b;
            for (int j = 0; j < i; j++) {
                if (N[j] == b) {
                    b = ran.nextInt(101);
                    N[i] = b;
                }

            }
        }
    }

    @Override
    public String toString() {
       Arrays.sort(N);
        return "Array Implementation \n"+Arrays.toString(N).replace("[", " ").replace("]", " ").replace(",", " ");
    }
    

}
