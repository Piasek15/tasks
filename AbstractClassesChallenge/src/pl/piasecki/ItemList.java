package pl.piasecki;

/**
 * Created by Patrick on 13 maj 2018
 */
public interface ItemList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
