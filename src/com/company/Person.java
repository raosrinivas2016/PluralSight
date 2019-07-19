package com.company;

public class Person {
private String Id;
private String Name;
private Integer age;
private java.util.Date DOB;

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        com.company.Person person = ( com.company.Person ) o;
        return java.util.Objects.equals( Id, person.Id ) &&
                       java.util.Objects.equals( Name, person.Name ) &&
                       java.util.Objects.equals( age, person.age ) &&
                       java.util.Objects.equals( DOB, person.DOB );
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash( Id, Name, age, DOB );
    }

    @Override
    public String toString() {
        return "Person{" +
                       "Id='" + Id + '\'' +
                       ", Name='" + Name + '\'' +
                       ", age='" + age + '\'' +
                       ", DOB=" + DOB +
                       '}';
    }

    public String getId() {
        return Id;
    }

    public void setId( String id ) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName( String name ) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge( Integer age ) {
        this.age = age;
    }

    public java.util.Date getDOB() {
        return DOB;
    }

    public void setDOB( java.util.Date DOB ) {
        this.DOB = DOB;
    }

    public Person( String id, String name, Integer age, java.util.Date DOB ) {
        Id = id;
        Name = name;
        this.age = age;
        this.DOB = DOB;
    }
}
