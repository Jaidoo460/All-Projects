package com.techelevator;

import java.util.Stack;

public class Brackets {

    public static void main(String[] args) {

        Brackets b = new Brackets();
        System.out.println(b.isBalanced(""));
        System.out.println(b.isBalanced("("));
        System.out.println(b.isBalanced("()"));
        System.out.println(b.isBalanced("([])"));
        System.out.println(b.isBalanced("([{}])"));
    }



    public boolean isBalanced(String input) {
        Stack<Character> brackets = new Stack<>();//

        for (int index = 0; index < input.length(); index++) {

            Character theCharacter = input.chartAt(index);

            if (brackets.isEmpty()) {
                brackets.push(theCharacter);
            } else if (
                    (theCharacter == ')' && brackets.peek() == '('))
                brackets.pop();
                    ||(theCharacter == '}' && brackets.peek() == '{')
                    || (theCharacter == ']' && brackets.peek() == '[')

        }
        brackets.pop();
    }else {

    }
}
