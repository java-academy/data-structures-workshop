package bloomfilter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilter {

    @Test(invocationCount = 1_000)
    public void addingNewObjectToBloomFilter_size20() {
        BloomFilter bloomFilter = new BloomFilter(20);
        Object o1 = new Object();
        Object o2 = new Object();

        bloomFilter.add(o1);

        Assert.assertTrue(!bloomFilter.isNotInFilter(o1));
        Assert.assertTrue(bloomFilter.isNotInFilter(o2));
    }

    @Test(invocationCount = 1_000)
    public void addingNewObjectToBloomFilter_size10() {
        BloomFilter bloomFilter = new BloomFilter(10);
        Object o1 = new Object();
        Object o2 = new Object();

        bloomFilter.add(o1);

        Assert.assertTrue(!bloomFilter.isNotInFilter(o1));
        Assert.assertTrue(bloomFilter.isNotInFilter(o2));
    }


    @Test(invocationCount = 1_000)
    public void addingNewObjectToBloomFilter_size20_with20RandomObjects() {
        BloomFilter bloomFilter = new BloomFilter(10);
        Object o1 = new Object();
        Object o2 = new Object();

        bloomFilter.add(o1);
        for (int i = 1; i < 20; i++) {
            bloomFilter.add(new Object());
        }

        Assert.assertTrue(!bloomFilter.isNotInFilter(o1));
        Assert.assertTrue(bloomFilter.isNotInFilter(o2));
    }
}
