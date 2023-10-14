package main.java.org.navid.stack;

import java.util.Stack;

public class StringBalanceChecker {

    public void check(String input){
        Stack<Character> startChars = new Stack<>();
        Stack<Character> endChars = new Stack<>();
        for(char ch: input.toCharArray()){
            if(ch == '(' || ch == '<' || ch == '[' || ch == '{')
                startChars.push(ch);
            else if(ch == ')' || ch == '>' || ch == ']' || ch == '}')
                endChars.push(ch);
        }
    }
}
