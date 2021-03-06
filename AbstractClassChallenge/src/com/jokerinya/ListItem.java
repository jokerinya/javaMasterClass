package com.jokerinya;

public abstract class ListItem {
    protected ListItem leftLink = null;
    protected ListItem rightLink = null;

    protected Object value; // can have many forms

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);


}
