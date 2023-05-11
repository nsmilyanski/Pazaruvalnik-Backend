package com.example.pazaruvalnikbackend.auth;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}

//package com.example.test05;
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) {
//        System.out.println(validateStringInput("[([]{})]"));
//    }
//    private static boolean validateString(String input) {
//        Deque<Character> stack = new ArrayDeque<>();
//
//        for (int i = 0; i < input.length(); i++) {
//            char symbol = input.charAt(i);
//            if (symbol == '(') {
//                stack.push(input.charAt(i));
//            }else if (symbol == ')') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                stack.pop();
//            }else {
//                return false;
//            }
//        }
//        return stack.isEmpty();
//    }
//
//    private static boolean validateStringInput(String input) {
//        Deque<Character> stack = new ArrayDeque<>();
//
//        for (int i = 0; i < input.length(); i++) {
//            char symbol = input.charAt(i);
//            if (symbol == '(' || symbol == '{' || symbol == '[') {
//                stack.push(input.charAt(i));
//            }else if (symbol == ')' || symbol == '}' || symbol == ']') {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                char peek = stack.peek();
//
//                if (symbol == ')' && peek != '(') {
//                    return false;
//                } else if (symbol == '}' && peek != '{') {
//                    return false;
//                }else if (symbol == ']' && peek != '[') {
//                    return false;
//                }
//                stack.pop();
//            }else {
//                return false;
//            }
//        }
//        return stack.isEmpty();
//    }
//
//
//    private static void generateAllPossibleStrings(List<Character> allPossibleChars, List<String> result, String current, int n, int index) {
//        if (current == null || !validateStringInput(current) || result.contains(current)) {
//            return;
//        }
//
//        if (!current.isBlank()) {
//            result.add(current);
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = index; i < allPossibleChars.size(); i++) {
//            char symbol = allPossibleChars.get(i);
//            if (symbol == '(' || symbol == '{' || symbol == '[') {
//                continue;
//            }
//            for (int j = i + 1; j < allPossibleChars.size(); j++) {
//
//            }
//        }
//    }
//
//    //1.
//    //Given a string s containing just the characters '(', ')'	determine if the input string is valid.
//    //An input string is valid if:
//    //Open brackets must be closed by a closing bracket.
//    //Open brackets must be closed in the correct order.
//    //
//    //Examples:
//    //(()(())) - True
//    //())()() - False
//
//    //2
//    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//    //
//    //An input string is valid if:
//    //Open brackets must be closed by the same type of brackets.
//    //Open brackets must be closed in the correct order.
//    //
//    //Examples:
//    //[([]{})] - True
//    //[([{]})] - False
//    //[([}]{)] - False
//
//
//    //Given a number n generate all possible strings of length 2*n that are valid (as in level 2)
//    //
//    //Examples:
//    //()()
//    //(())
//    //...
//    //...
//    //...
//    //...
//}
