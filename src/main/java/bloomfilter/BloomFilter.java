package bloomfilter;

class BloomFilter {

    private boolean[] filter;

    BloomFilter(int n) {
        filter = new boolean[n];
    }

    void add(Object object) {
        filter[hash1(object)] = true;
        filter[hash2(object)] = true;
        filter[hash3(object)] = true;
    }

    boolean isNotInFilter(Object object) {
        return !(filter[hash1(object)] &&
                filter[hash2(object)] &&
                filter[hash3(object)]);
    }

    /**
     * Poczatek kodu do modyfikacji
     *
     * Stworzyc funkcje hashujace tak aby wydajnosc filtru byla jak najlepsza
     */
    private int hash1(Object object){
        return 0;
    }

    private int hash2(Object object){
        return 0;
    }

    private int hash3(Object object){
        return 0;
    }
}
