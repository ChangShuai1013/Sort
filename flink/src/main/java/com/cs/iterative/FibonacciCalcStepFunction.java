package com.cs.iterative;

import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.api.java.tuple.Tuple5;

/**
 * author:chang shuai
 * date:2021/1/21
 * time:15:18
 */
public class FibonacciCalcStepFunction extends
        RichMapFunction<Tuple5<Integer, Integer, Integer, Integer, Integer>,
                        Tuple5<Integer, Integer, Integer, Integer, Integer>> {
    @Override
    public Tuple5<Integer, Integer, Integer, Integer, Integer> map(Tuple5<Integer, Integer, Integer, Integer, Integer> tuple) throws Exception {
        return new Tuple5<>(tuple.f0, tuple.f1, tuple.f3, tuple.f2 + tuple.f3, ++tuple.f4);
    }
}
