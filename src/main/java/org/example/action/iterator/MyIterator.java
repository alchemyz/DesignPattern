package org.example.action.iterator;

/**
 * @author : zhuzhenjie
 **/
public interface MyIterator {
    void first();

    void last();

    boolean hasNext();

    void next();

    Object getCurrentObject();
}
