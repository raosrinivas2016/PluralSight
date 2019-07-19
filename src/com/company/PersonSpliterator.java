package com.company;

public class PersonSpliterator implements java.util.Spliterator<com.company.Person> {
    private final java.util.Spliterator<String> lineSpliterator;
    private java.util.Date DOB;
    private String id;
    private String name;
    private Integer age;

    public PersonSpliterator( java.util.Spliterator<String> lineSpliterator ) {
        this.lineSpliterator = lineSpliterator;
    }

    @Override
    public boolean tryAdvance( java.util.function.Consumer<? super com.company.Person> action ) {

        if ( this.lineSpliterator.tryAdvance( line -> this.id = line ) &&
                     this.lineSpliterator.tryAdvance( line -> this.name = line ) &&
                     this.lineSpliterator.tryAdvance( line -> this.age = Integer.parseInt( line ) ) &&
                     this.lineSpliterator.tryAdvance( line -> {
                         try {
                             this.DOB = new java.text.SimpleDateFormat( "dd-MM-yyyy").parse( line);
                         } catch ( java.text.ParseException e ) {
                             e.printStackTrace();
                         }
                     } ))
        {
            Person person = new Person( id, name, age, DOB );
            action.accept( person );
            return true;
        }
        else{
            return false;
        }}



    @Override
    public java.util.Spliterator<com.company.Person> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return lineSpliterator.estimateSize() / 4;
    }

    @Override
    public int characteristics() {
        return lineSpliterator.characteristics();
    }
}
