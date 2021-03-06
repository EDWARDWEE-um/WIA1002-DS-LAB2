/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

/**
 *
 * @author wic190050
 * @param <T>
 */
public class TextFileLog<T extends Comparable<T>> implements SimpleLog<T> {

    private T[] log;
    private int index, maxsize;

    public TextFileLog(int maxsize) {
        this.maxsize = maxsize;
        log = (T[]) new Comparable[this.maxsize];
        this.index = -1;
    }

    @Override
    public void insert(T t) {
        
        if (!isFull()) {
            index++;
            log[index] = t;
        } else {
            System.out.println("The log is full");
        }
    }

    @Override
    public boolean isFull() {
        return maxsize == (index + 1);
    }

    @Override
    public int size() {
        return index + 1;
    }

    @Override
    public boolean search(T t) {
        for (int i = 0; i < index; i++) {
            if (log[i].compareTo(t) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        System.out.println("Clear the text file log");
        for(int i=0;i<=index;i++){
            log[i]=(T) null;
            index=-1;
        }
    }
    @Override
    public String toString(){
        String str ="";
        for(int i =0; i<=index;i++){
            str += log[i]+"\n";
        }
            return "Create a text file log with maximum record equal to "+this.maxsize+"\n"+"Text File Log Size "+this.maxsize+"\n"+str;
    }

}
