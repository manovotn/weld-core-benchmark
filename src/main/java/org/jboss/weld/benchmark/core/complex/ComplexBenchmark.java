package org.jboss.weld.benchmark.core.complex;

import org.jboss.weld.benchmark.core.AbstractBenchmark;
import org.jboss.weld.benchmark.core.Main;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;

// Use smaller batch size for complex benchmark
@Warmup(batchSize = ComplexBenchmark.BATCH_SIZE, iterations = Main.ITERATIONS)
@Measurement(batchSize = ComplexBenchmark.BATCH_SIZE, iterations = Main.ITERATIONS)
public class ComplexBenchmark extends AbstractBenchmark<RequestScopedBean>{

    static final int BATCH_SIZE = 1 << 10;

    @Override
    protected Class<RequestScopedBean> getBeanClass() {
        return RequestScopedBean.class;
    }
}
