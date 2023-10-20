/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithms;
import common.Library;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import view.Menu;

/**
 *
 * @author huynh
 */
public class Handler extends Menu<String>
{
    protected Library library;
    protected Algorithms algorithm;

    public Handler() {
        super("=====Analyze String Program=====");
        library = new Library();
        algorithm = new Algorithms();
    }

    public void execute() {
        String stringInput = library.getString("Input string: ");
        HashMap<String, List<Integer>> result = algorithm.getNumber(stringInput);
        for (Map.Entry<String, List<Integer>> entry : result.entrySet()) {
            String typeNum = entry.getKey();
            List<Integer> listNum = entry.getValue();
            System.out.println(typeNum + ": " + listNum);
            
        }
        HashMap<String, List<Character>> resultC = algorithm.getCharacter(stringInput);
        for (Map.Entry<String, List<Character>> entry : resultC.entrySet()) {
            String typeChar = entry.getKey();
            List<Character> listNum = entry.getValue();
            String s = "";
            for (Character character : listNum) {
                s += character;
            }
            System.out.println(typeChar + ": " + s);
            
        }
    }
}
