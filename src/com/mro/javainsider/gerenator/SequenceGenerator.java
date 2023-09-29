package com.mro.javainsider.gerenator;

public class SequenceGenerator implements Generator{

    private int current;
    @Override
    public int next() {
        return ++current;
    }
}
