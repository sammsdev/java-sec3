package com.sam_sec9;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem nex();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

}
