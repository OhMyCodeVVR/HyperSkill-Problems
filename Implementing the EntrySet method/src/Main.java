import java.util.*;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private final ArrayList<T> value = new ArrayList<>();

        public TableEntry(int key, T value) {
            this.key = key;
            this.value.add(value);
        }

        public int getKey() {
            return key;
        }

        public ArrayList<T> getValue() {
            return value;
        }
    }

    private static class HashTable<T> {
        private int size;
        private TableEntry[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, T value) {
            // put your code here
            int idx = findKey(key);

            if (idx == -1) {
                return false;
            }
            if (table[idx] == null) {
                table[idx] = new TableEntry(key, value);
            } else {
                table[idx].value.add(value);
            }
            return true;

        }

        public T get(int key) {
            // put your code here
            int idx = findKey(key);

            if (idx == -1 || table[idx] == null) {
                return null;
            }

            return (T) table[idx].getValue();
        }

        public Set<T> entrySet() {

            return null;
        }

        private int findKey(int key) {
            // put your code here
            int hash = key % size;

            while (!(table[hash] == null || table[hash].getKey() == key)) {
                hash = (hash + 1) % size;

                if (hash == key % size) {
                    return -1;
                }
            }

            return hash;
        }

        private void rehash() {
            // put your code here
        }

        @Override
        public String toString() {
            String ret = "";
            for (int i = table.length - 1; i >= 0; i--) {
                if (table[i] == null) {
                    continue;
                } else {
                    ret += table[i].getKey() + ": " + table[i].getValue() + "\n";
                }
            }
            ret = ret.replaceAll("\\[", "");
            ret = ret.replaceAll("\\]", "");
            ret = ret.replaceAll(",", "");
            return ret;
        }
    }

    public static void main(String[] args) {
        // put your code here


        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        HashTable table = new HashTable(size);
        while (size > 0) {
            String[] entry = scanner.nextLine().split(" ");
            table.put(Integer.parseInt(entry[0]), entry[1]);
            size--;
        }

        System.out.println(table.toString());
    }
}