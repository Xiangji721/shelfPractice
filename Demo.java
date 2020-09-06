import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){
        Book mathBook1 = new MathBook("math1", "mathBook", "level_1");
        Book mathBook2 = new MathBook("math2", "mathBook", "level_2");
        Book englishBook1 = new EnglishBook("english1", "englishBook", "british");
        Book englishBook2 = new EnglishBook("english2", "englishBook", "america");
        Book chineseBook1 = new ChineseBook("chinese1", "chineseBook");
        Book chineseBook2 = new ChineseBook("chinese2", "chineseBook");
        Book chineseBook3 = new ChineseBook("chinese3", "chineseBook");
        Book chineseBook4 = new ChineseBook("chinese4", "chineseBook");
        Book chineseBook5 = new ChineseBook("chinese5", "chineseBook");


        ArrayList<Book> upBookList = new ArrayList<Book>();
        upBookList.add(mathBook1);
        upBookList.add(mathBook2);
        upBookList.add(englishBook1);

        ArrayList<Book> middleBookList = new ArrayList<Book>();
        middleBookList.add(chineseBook1);
        middleBookList.add(chineseBook2);
        middleBookList.add(chineseBook3);
        middleBookList.add(chineseBook4);
        middleBookList.add(chineseBook5);
        middleBookList.add(englishBook1);
        middleBookList.add(englishBook2);

        ArrayList<Book> bottomBookList = new ArrayList<Book>();

        Shelf newShelf = new Shelf(upBookList, middleBookList, bottomBookList);

        // Get English Book　in the upBookList
        Book returnBook1 = upBookList.get(2);
        System.out.println(returnBook1.getName());

        // Get 2rd Chinese Book in the middleBookList
        Book returnBook2 = middleBookList.get(1);
        System.out.println(returnBook2.getName());

    }
}
