package com.sam_sec9;

public class MyLinkedList implements NodeList {

    private ListItem root =null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if(this.root == null) {
            //list is empty
            this.root = item;
            return  true;
        }

        ListItem currentItem = this.root;

        while(currentItem != null){
            int comparasion = (currentItem.compareTo(item));
            if(comparasion < 0){
                if(currentItem.nex() != null) {
                    currentItem = currentItem.nex();
                } else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            } else if(comparasion > 0){
                if(currentItem.previous() != null ) {
                    currentItem.previous().setNext(item);
                }
             }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void transverse(ListItem root) {

    }
}
