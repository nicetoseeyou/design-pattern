package com.dodo.lab.head_first_design_patterns.iterator.dinermergeri;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
