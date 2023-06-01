package org.nocoder.datastructure.map;

/**
 * Map put, get 功能简版实现
 * Simple map, associates keys with values
 * low efficiency, fixed size
 *
 * @author yangjinlong
 */
public class AssociativeArray<K, V> {
    private final Object[][] pairs;
    private int index;

    public AssociativeArray(int length) {
        pairs = new Object[length][2];
    }

    public static void main(String[] args) {
        AssociativeArray<String, Integer> map = new AssociativeArray<>(2);
        try {
            map.put("Jason", 29);
            map.put("Freda", 26);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println(map);
        System.out.println(map.get("Jason"));
    }

    public void put(K key, V value) {
        if (index >= pairs.length) {
            throw new ArrayIndexOutOfBoundsException("Too many values");
        }
        pairs[index++] = new Object[]{key, value};
    }

    public V get(K key) {
        for (int i = 0; i < index; i++) {
            if (key.equals(pairs[i][0])) {
                return (V) pairs[i][1];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            if (i == 0) {
                result.append("{");
            }
            result.append(pairs[i][0].toString());
            result.append("=");
            result.append(pairs[i][1].toString());
            if (i < index - 1) {
                result.append(", ");
            } else {
                result.append("}");
            }
        }
        return result.toString();
    }
}
