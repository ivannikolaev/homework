package edu.hw1;

public class Problem1 {
    public String say(String word) {
        return switch (word) {
            case "hello" -> "word";
            case "ping" -> "pong";
            case "bye" -> "bye";
            default -> throw new IllegalArgumentException("Unexpected value: " + word);
        };
    }
}
