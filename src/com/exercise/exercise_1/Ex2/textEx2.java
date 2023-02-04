package com.exercise.exercise_1.Ex2;

public class textEx2 {
//  Instance
    private static char b;
    public static void main(String[] args) {
//      Cách 1
        Author author = new Author("A","abc@gmail.com",b);
        Book book1 = new Book("Java for dummy", author, 19.95, 1000);
//      Cách 2
        Book book2 = new Book("Java ", new Author("B","d@gmail.com",b), 27.95, 888);

        System.out.println("Ten tac gia : " + book1.getAuthor().getName());
        System.out.println("Email tac gia : " + book1.getAuthor().getEmail());
    }
}
