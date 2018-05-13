package pl.piasecki;

/**
 * Created by Patrick on 13 maj 2018
 */
public class MyLinkedList implements ItemList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null){
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison < 0){
                if (currentItem.moveToNextItem() != null){
                    currentItem = currentItem.moveToNextItem();
                } else {
                    currentItem.setNextItem(item);
                    return true;
                }
            } else if (comparison > 0){
                if (currentItem.moveToPreviousItem() != null){
                    currentItem.moveToPreviousItem().setNextItem(item);
                    currentItem.setPreviousItem(item);
                    return true;
                } else {
                    item.setNextItem(this.root);
                    this.root = item;
                    return true;
                }

            } else {
                System.out.println(item.getValue() + " is already exists.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null){
            System.out.println("Removing item: " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if (comparison == 0){
                if (currentItem.equals(this.root)){
                    this.root = currentItem.moveToNextItem();
                    //this.root.setPreviousItem(null);
                } else {
                    currentItem.moveToPreviousItem().setNextItem(currentItem.moveToNextItem());
                }
                return true;
            } else if (comparison < 0){
                currentItem = currentItem.moveToNextItem();
            } else {
                return false;
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null){
            System.out.println("List is empty");
        } else {
            while (root != null){
                System.out.println(root.getValue());
                root = root.moveToNextItem();
            }
        }
    }
}
