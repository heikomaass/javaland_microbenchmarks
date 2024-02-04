package de.heikomaass.javaland;

import org.openjdk.jmh.annotations.*;


public class StringFormatBenchmark {

    private static final String NAME = "Felix";

    @Benchmark
    @Measurement(iterations = 3)
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 1)
    public String stringFormat() {
        return String.format("Hello my name is %s (%f)", NAME, Math.random());
    }

    @Benchmark
    @Measurement(iterations = 3)
    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 1)
    public String concenation() {
        return "Hello my name is" + NAME + "(" + Math.random() + ")";
    }
}
