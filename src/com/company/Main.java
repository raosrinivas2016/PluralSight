package com.company;

public class Main {

    public static void main( String[] args ) {
      java.nio.file.Path path = java.nio.file.Paths.get("C:\\Developement","persons.txt");

        try(java.util.stream.Stream<String> lines = java.nio.file.Files.lines( path );){
            java.util.Spliterator<String> lineSpliterator = lines.spliterator();
            java.util.Spliterator<com.company.Person> personSpliterator = new PersonSpliterator(lineSpliterator);

            java.util.stream.Stream<com.company.Person> persons = java.util.stream.StreamSupport.stream( personSpliterator,false );
            persons.forEach( System.out::println );
        }catch ( java.io.IOException e ){
            e.printStackTrace();
        }
    }
}
