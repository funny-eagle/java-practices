package org.nocoder.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jason
 * @date 2019/5/7.
 */
public class HeapOutOfMemory {
    static class OutOfMemoryObject {
    }

    public static void main(String[] args) {
        List<OutOfMemoryObject> list = new ArrayList<>();
        while (true) {
            list.add(new OutOfMemoryObject());
        }
    }
}
