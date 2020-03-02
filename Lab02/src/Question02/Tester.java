/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

import java.lang.reflect.Array;

/**
 *
 * @author wic190050
 */
public class Tester {
    public static void main(String[] args) {
        TextFileLog<String> a = new TextFileLog<>(5);
        a.insert("James");
        a.insert("Ahmad");
        a.insert("Siti");
        a.insert("Ramesh");
        a.insert("John");
        System.out.println(a.toString());
    }
   
}
