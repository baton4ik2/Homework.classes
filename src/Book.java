public class Book {
    private Author author;
    private int ageOfPublication;
    private String publisherName;

    public Book(Author author, int ageOfPublication, String publisherName) {
        this.author = author;
        this.ageOfPublication = ageOfPublication;
        this.publisherName = publisherName;
    }
    public Author getAuthorName(){
        return this.author;
    }

    public int getAgeOfPublication() {
        return this.ageOfPublication;
    }

    public void setAgeOfPublication(int ageOfPublication) {
        this.ageOfPublication = ageOfPublication;
    }

    public String getPublisherName() {
        return this.publisherName;
    }

}
