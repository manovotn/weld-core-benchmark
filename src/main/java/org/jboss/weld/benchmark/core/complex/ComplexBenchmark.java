package org.jboss.weld.benchmark.core.complex;

import static org.jboss.weld.benchmark.core.Main.BATCH_SIZE_SLOW;
import static org.jboss.weld.benchmark.core.Main.ITERATIONS;

import org.jboss.weld.benchmark.core.AbstractBenchmark;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;

// Use smaller batch size for complex benchmark
@Warmup(batchSize = BATCH_SIZE_SLOW, iterations = ITERATIONS)
@Measurement(batchSize = BATCH_SIZE_SLOW, iterations = ITERATIONS)
public class ComplexBenchmark extends AbstractBenchmark<RequestScopedBean>{

    static final int BATCH_SIZE = 1 << 10;

    @Override
    protected Class<RequestScopedBean> getBeanClass() {
        return RequestScopedBean.class;
    }
}
