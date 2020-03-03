/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

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
        System.out.println("Adding another record");
        a.insert("abu");
        
        String name = "Siti";
        System.out.println("Searching for "+name+" in the file");
        if(a.search(name)){
            System.out.println("Text File Log contains "+name);
        }
        else
            System.out.println("Text File Log does not contains "+name);
        a.clear();
        System.out.println("Text File Log Size "+a.size());
    }
   
}
