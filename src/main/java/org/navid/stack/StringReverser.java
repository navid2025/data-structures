package main.java.org.navid.stack;

import java.util.Stack;

public class StringReverser {

    public String reverse(String str){
        Stack<Character> characterStack = new Stack<>();
        for(Character ch: str.toCharArray()){
            characterStack.push(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int size = characterStack.size();
        for(int i = 0; i< size; i++) {
            stringBuilder.append(characterStack.pop());
        }
        return stringBuilder.toString();
    }
}
