import java.awt.*;
import java.util.ArrayList;

public class Shelf {
    ArrayList<Book> upBookList;
    ArrayList<Book> middleBookList;
    ArrayList<Book> bottomBookList;

    public Shelf(ArrayList<Book> upBookList, ArrayList<Book> middleBookList, ArrayList<Book> bottomBookList) {
        this.upBookList = upBookList;
        this.middleBookList = middleBookList;
        this.bottomBookList = bottomBookList;
    }

    public ArrayList<Book> getUpBookList() {
        return upBookList;
    }

    public void setUpBookList(ArrayList<Book> upBookList) {
        this.upBookList = upBookList;
    }

    public ArrayList<Book> getMiddleBookList() {
        return middleBookList;
    }

    public void setMiddleBookList(ArrayList<Book> middleBookList) {
        this.middleBookList = middleBookList;
    }

    public ArrayList<Book> getBottomBookList() {
        return bottomBookList;
    }

    public void setBottomBookList(ArrayList<Book> bottomBookList) {
        this.bottomBookList = bottomBookList;
    }
}
