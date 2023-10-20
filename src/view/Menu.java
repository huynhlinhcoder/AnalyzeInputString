/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Library;

/**
 *
 * @author huynh
 */
public abstract class Menu<T> {

    protected String title;
    Library l = new Library();

    public Menu() {
    }

    public Menu(String td) {
        title = td;
    }

    public void display() {
        System.out.println(title);
    }


    public abstract void execute();

    public void run() {
        display();
        execute();
    }
}
