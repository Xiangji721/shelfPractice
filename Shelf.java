public class Shelf{
    public List<MathBook> m_mathBooks;
    public List<ChineseBook> m_chineseBooks;
    public List<EnglishBook> m_englishBooks;
}
public abstract class Book {

};

class MathBook extends Book{
    private String m_difficult;
    public String getDifficult(){
        return m_difficult;
    }
    public void setDifficult(String level){
        m_difficult = level;
    }
};

class ChineseBook extends Book{

};

class EnglishBook extends Book{
    enum Country{
        British,
        American
    }
    private Country m_country;
    public Country getCountry(){
        return m_country;
    }
    public void setCountry(Country country){
        m_country = country;
    }
};

public void main(String[] args){
        Shelf upShelf = new Shelf();
        EnglishBook i_get_book = upShelf.m_englishBooks.get(0);
}
