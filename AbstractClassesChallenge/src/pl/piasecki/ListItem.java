package pl.piasecki;

import java.util.Objects;

/**
 * Created by Patrick on 10 maj 2018
 */
public abstract class ListItem {
    protected Object value;
    protected ListItem next;
    protected ListItem previous;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem moveToNextItem();
//    {
//        this.previous = this;
//        this.value = this.next.value;
//        this.next = this.next.next;
//        return this;
//    }

    abstract ListItem moveToPreviousItem();
//    {
//        this.next = this;
//        this.value = this.previous.value;
//        this.previous = this.previous.previous;
//        return this;
//    }

    abstract ListItem setNextItem(ListItem nextItem);
    abstract ListItem setPreviousItem(ListItem previousItem);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
