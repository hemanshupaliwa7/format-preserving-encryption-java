package com.idealista.fpe.config;

import com.idealista.fpe.config.basic.BasicAlphabetDomain;

public class Defaults {

    private Defaults(){}

    public static final Domain DOMAIN = new BasicAlphabetDomain();
    public static final Integer DEFAULT_MAX_LENGTH = Integer.MAX_VALUE;
    public static final Integer DEFAULT_MIN_LENGTH = 2;
    public static final LengthRange LENGTH_RANGE = new LengthRange(DEFAULT_MIN_LENGTH, DEFAULT_MAX_LENGTH);
}
