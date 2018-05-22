import trie.Trie;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("test");
        trie.add("testy");
        trie.add("testowy");
        trie.add("testowany");
        trie.add("przetestowany");
        trie.add("przetestowac");

        trie.add("tekst");
        trie.add("teksty");

        trie.add("text");

        trie.printTrie();

        Supplier<String> supplier = new Scanner(System.in)::nextLine;
        while (true) {
            System.out.println(trie.getPossibilities(supplier.get()));
        }
    }
}
