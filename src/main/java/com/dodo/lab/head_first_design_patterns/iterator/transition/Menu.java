package com.dodo.lab.head_first_design_patterns.iterator.transition;

import java.util.Iterator;

public interface Menu {
    public Iterator<?> createIterator();
}
