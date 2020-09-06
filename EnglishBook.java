public class EnglishBook extends Book{
    private String country;

    public EnglishBook(String name, String type, String country) {
        super(name, type);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
