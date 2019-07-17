import java.util.ArrayList;

public class Library<E> {
    public ArrayList<E> libra= new ArrayList<>();

    public void addElement(E e){
        libra.add(e);
    }

    public static void main(String[] args) {

        Library<Books> listBook= new Library<>();
        listBook.addElement(new Books("A","e","c"));
        listBook.addElement(new Books("D","e","c"));

        for(Books a: listBook.libra){
            a.showData();
        }
    }
}
