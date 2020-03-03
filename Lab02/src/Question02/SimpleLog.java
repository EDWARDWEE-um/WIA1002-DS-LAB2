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
public interface SimpleLog<T> {

    public void insert(T t);

    public boolean isFull();

    public int size();

    public boolean search(T t);

    public void clear();

    @Override
    public String toString();
}
