package pl.piasecki;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String string : data){
            list.addItem(new Item(string));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Item("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Item("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Item("0"));
        list.removeItem(new Item("4"));
        list.removeItem(new Item("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Item("9"));
        list.removeItem(new Item("8"));
        list.removeItem(new Item("6"));
        list.traverse(list.getRoot());

        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());

    }
}
