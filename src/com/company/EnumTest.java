package com.company;

public enum  EnumTest {
    India(1.2,"very large","5"),
    US(0.6,"large","2"),
    china(1.3,"very large","1");
    private double size;
    private String description;
    private String lanugages;

    private EnumTest( double _size, String _description, String _lanugages ){
        this.description=_description;
        this.lanugages=_lanugages;
        this.size=_size;
    }

    public double getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public String getLanugages() {
        return lanugages;
    }
}
