package pl.piasecki;

/**
 * Created by Patrick on 13 maj 2018
 */
public class Item extends ListItem {
    public Item(Object value) {
        super(value);
    }

    @Override
    ListItem moveToNextItem() {
        return this.next;
    }

    @Override
    ListItem moveToPreviousItem() {
        return this.previous;
    }

    @Override
    ListItem setNextItem(ListItem nextItem) {
        if (nextItem != null)
            nextItem.previous = this;
        this.next = nextItem;
        return this.next;
    }

    @Override
    ListItem setPreviousItem(ListItem previousItem) {
        if (previousItem != null)
            previousItem.next = this;
        this.previous = previousItem;
        return this.previous;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null){
            return ((String) getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
