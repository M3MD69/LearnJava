package _1_learn._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_7_trie;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        final Trie ELEMENTS = new Trie();

        ELEMENTS.insert("apple");

        System.out.println(ELEMENTS.search("apple"));

        System.out.println(ELEMENTS.startsWith("app"));

        ELEMENTS.insert("app");

        ELEMENTS.delete("apple");

        ELEMENTS.printElements();
    }
}