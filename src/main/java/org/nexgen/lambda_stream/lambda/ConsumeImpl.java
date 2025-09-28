package org.nexgen.lambda_stream.lambda;

import java.util.function.Consumer;

public class ConsumeImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
