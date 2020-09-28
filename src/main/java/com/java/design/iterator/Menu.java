package com.java.design.iterator;

import lombok.Getter;

import java.util.*;
import java.util.function.Consumer;

@Getter
public class Menu implements Iterator {
    private List<Item> items;

    private int currentIndex;

    public Menu() {
        this.items = new ArrayList<>();
        currentIndex = 0;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public boolean hasNext() {
        return (this.currentIndex < this.items.size());
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Item item = this.items.get(this.currentIndex);
            currentIndex++;
            return item;
        }
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }
}
